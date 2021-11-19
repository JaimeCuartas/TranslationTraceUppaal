package translation.Tron;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import translation.Antlr.TraceUppaalLexer;
import translation.Antlr.TraceUppaalParser;
import translation.visitor.TranslationVisitor;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TronExec {

    /*
    tron.exe C:\Users\Jaime\Desktop\pruebaTron\modelTron.xml -I TraceAdapter -Q log -- -m C:\Users\Jaime\Desktop\pruebaTron\preamble.trn < C:\Users\Jaime\Desktop\pruebaTron\trace.trn
     */


    public boolean testTrace(String model, String trace){


        try{
            String cmd = "\"C:\\Users\\Jaime\\OneDrive - correounivalle.edu.co\\Documentos\\uppaal-tron-1.5-win32\\tron.exe\" ".concat(model).concat(" -I TraceAdapter -Q log -- -m preamble.trn < ").concat(trace).concat("\"");
            System.out.println(cmd);
            ProcessBuilder pb = new ProcessBuilder(cmd);
            pb.redirectErrorStream(true);
            Process p = null;
            p = pb.start();

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;
            String traceString = "";

            while ((line = stdInput.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }



        return false;
    }
}
