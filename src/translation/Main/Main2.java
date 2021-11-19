package translation.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) {
        try{

            String cmd = "\"C:\\Users\\Jaime\\OneDrive - correounivalle.edu.co\\Documentos\\uppaal-tron-1.5-win32\\tron.exe\" C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\carpetaMut\\ccn1.xml -I TraceAdapter -- -m \"C:\\Users\\Jaime\\OneDrive - correounivalle.edu.co\\Documentos\\Github\\TranslationTraceUppaal\\preamble.trn\"";
            //String cmd = "\"C:\\Users\\Jaime\\OneDrive - correounivalle.edu.co\\Documentos\\uppaal-tron-1.5-win32\\tron.exe\" -h \"";
            System.out.println(cmd);
            ProcessBuilder pb = new ProcessBuilder(cmd);
            pb.redirectInput(new File("C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\mut\\ccn1.xml0trace.trn"));
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
    }
}