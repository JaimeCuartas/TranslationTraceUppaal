package translation.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1Trace {
    public static void main(String[] args) {
        try{
            String cmd = "\"C:\\Users\\Jaime\\OneDrive - correounivalle.edu.co\\Documentos\\uppaal-tron-1.5-win32\\tron.exe\" C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\carpetaMut\\tadSyncid8id4.xml -Q log -I TraceAdapter -- -m preamble.trn\"";

            ProcessBuilder pb = new ProcessBuilder(
                    "\"C:\\Users\\Jaime\\OneDrive - correounivalle.edu.co\\Documentos\\uppaal-tron-1.5-win32\\tron.exe\"",
                    "C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\carpetaMut\\tadSyncid8id4.xml",
                    "-Q",
                    "log",
                    "-I",
                    "TraceAdapter",
                    "--",
                    "-m",
                    "preamble.trn"
                    );
            pb.redirectInput(new File("C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\mut\\tadSyncid8id2.xml0Trace.trn"));
            pb.redirectErrorStream(true);

            Process p = null;

            p = pb.start();


            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = stdInput.readLine();

            String complete = "";
            while (line != null) {

                //System.out.println(line);
                complete = complete.concat(line).concat("\n");

                System.out.println(line);
                System.out.println(line.contains("TEST PASSED"));
                line = stdInput.readLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
