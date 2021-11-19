package translation.Main;


import translation.Antlr.TraceUppaalLexer;
import translation.Antlr.TraceUppaalParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Antlr.TraceUppaalLexer;
import translation.Antlr.TraceUppaalParserVisitor;
import translation.Tron.TronExec;
import translation.visitor.TranslationVisitor;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\carpetaMut");
        final String[] pathnames = file.list();

        String pathFolder = file.getAbsolutePath();

        assert pathnames != null;
        int n = pathnames.length;

        Set<String> channels = new HashSet<>();

        String prop = "C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\prop.q";
        String folderTraces = "C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\mut\\";

        try{
            File theDir = new File(folderTraces);
            if (!theDir.exists()){
                theDir.mkdirs();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        int seed = 1;

        for(String nameModel: pathnames){
            String fullNameModel = pathFolder.concat("\\").concat(nameModel);



            for(int i =0; i<seed; i++){
                try{
                    String cmd = "\"C:\\Program Files\\uppaal64-4.1.25-5\\bin-Windows\\verifyta.exe\" -q -t 0 -r ".concat(Integer.toString(i)).concat(" ").concat(fullNameModel).concat(" ").concat(prop).concat("\"");
                    ProcessBuilder pb = new ProcessBuilder(cmd);
                    pb.redirectErrorStream(true);
                    Process p = null;
                    p = pb.start();

                    BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

                    String line = null;
                    String traceString = "";

                    stdInput.readLine();
                    stdInput.readLine();

                    while ((line = stdInput.readLine()) != null) {
                        traceString = traceString.concat(line).concat("\n");
                    }


                    CharStream input = CharStreams.fromString(traceString);
                    TraceUppaalLexer lexer = new TraceUppaalLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    TraceUppaalParser parser = new TraceUppaalParser(tokens);
                    ParseTree tree = parser.trace();



                    FileWriter traceTrn = null;
                    FileWriter preambleTrn = null;

                    try{
                        traceTrn = new FileWriter(folderTraces.concat("\\").concat(nameModel).concat(Integer.toString(i)).concat("trace.trn"));

                        TranslationVisitor eval = new TranslationVisitor(channels);
                        traceTrn.write(eval.visit(tree));
                        traceTrn.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

        try{
            FileWriter traceTrn = new FileWriter("preamble.trn");

            Preamble preamble = new Preamble(channels, "1000", "1000");
            traceTrn.write(preamble.getPreamble());
            traceTrn.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        TronExec tron = new TronExec();


        HashMap<String, ArrayList<Thread>> mapThreads = new HashMap<>();

        for(String nameModel: pathnames) {

            String model = pathFolder.concat("\\").concat(nameModel);

            mapThreads.put(nameModel, new ArrayList<>());
            ArrayList<Thread> threads = mapThreads.get(nameModel);
            for(int i=0; i<seed; i++){
                String trace = folderTraces.concat(nameModel).concat(Integer.toString(i)).concat("trace.trn");
                threads.add(new Thread(()->{
                    new TronExec().testTrace(model, trace);
                }));
            }

        }


        for(ArrayList<Thread> listThread: mapThreads.values()){
            for(Thread thread: listThread){
                thread.start();
            }
        }


    }
}



        /*

        String pathFolder = "C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\train-gate-controllerTestTrace.xml";
        String prop = "C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\prop.q";

        Set<String> channels = new HashSet<>();

        try{
            String cmd = "\"C:\\Program Files\\uppaal64-4.1.25-5\\bin-Windows\\verifyta.exe\" -q -t 0 -r 0 ".concat(pathFolder).concat(" ").concat(prop).concat("\"");
            ProcessBuilder pb = new ProcessBuilder(cmd);
            pb.redirectErrorStream(true);
            Process p = null;
            p = pb.start();

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;
            String traceString = "";

            stdInput.readLine();
            stdInput.readLine();

            while ((line = stdInput.readLine()) != null) {

                traceString = traceString.concat(line).concat("\n");
            }

            System.out.println(traceString);


            CharStream input = CharStreams.fromString(traceString);
            TraceUppaalLexer lexer = new TraceUppaalLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TraceUppaalParser parser = new TraceUppaalParser(tokens);
            ParseTree tree = parser.trace();



            FileWriter traceTrn = null;
            FileWriter preambleTrn = null;

            try{
                traceTrn = new FileWriter("ejemploTrazaAutomatica.trn");

                TranslationVisitor eval = new TranslationVisitor(channels);
                traceTrn.write(eval.visit(tree));
                traceTrn.close();

                traceTrn = new FileWriter("ejemploPreambleAutomatico.trn");

                Preamble preamble = new Preamble(eval.getChannels(), "1000", "1000");
                traceTrn.write(preamble.getPreamble());
                traceTrn.close();
            }catch (Exception e){
                e.printStackTrace();
            }




        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
*/
