package translation.Main;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;




public class Main1TraceRun {
    public static void main(String[] args) throws IOException, InterruptedException {
        //new A().executeCommand("\"C:\\Users\\Jaime\\OneDrive - correounivalle.edu.co\\Documentos\\uppaal-tron-1.5-win32\\tron.exe\" \"C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\carpetaMut\\tadSyncid8id4.xml\" -Q log -I TraceAdapter -- -m \"preamble.trn\"");



        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "dir \"C:\\Users\"");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        p.waitFor();

        BufferedReader buf = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = "";
        while ((line=buf.readLine())!=null) {
            System.out.println(line);
        }
        /*
        "C:\Users\Jaime\Desktop\Train-Gate-Controller\mut\tadSyncid8id2.xml0Trace.trn"

        Process process = Runtime.getRuntime().exec("java --version");
        BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = null;
        while (true) {
            line = in.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }

         */
    }


}


class A{
    A(){

    }

    void executeCommand(String command) {
        try {
            log(command);
            //Process process = Runtime.getRuntime().exec(command);

            ProcessBuilder builder = new ProcessBuilder(command);

            builder.redirectInput(new File("C:\\Users\\Jaime\\Desktop\\Train-Gate-Controller\\mut\\tadSyncid8id2.xml0Trace.trn"));
            Process process = builder.start();
            logOutput(process.getInputStream(), "");
            logOutput(process.getErrorStream(), "Error: ");
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void logOutput(InputStream inputStream, String prefix) {
        new Thread(() -> {
            Scanner scanner = new Scanner(inputStream, "UTF-8");
            while (scanner.hasNextLine()) {
                synchronized (this) {
                    log(prefix + scanner.nextLine());
                }
            }
            scanner.close();
        }).start();
    }

    private static SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss:SSS");

    private synchronized void log(String message) {
        System.out.println(format.format(new Date()) + ": " + message);
    }
}
