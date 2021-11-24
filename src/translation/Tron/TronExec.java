package translation.Tron;

import java.io.*;

public class TronExec {


    public boolean checkTrace(String model, String trace){


        try{
            String cmd = "\"C:\\Users\\Jaime\\OneDrive - correounivalle.edu.co\\Documentos\\uppaal-tron-1.5-win32\\tron.exe\" ".concat(model).concat(" -Q log -I TraceAdapter -- -m preamble.trn\"");

            ProcessBuilder pb = new ProcessBuilder(cmd);
            pb.redirectInput(new File(trace));
            pb.redirectErrorStream(true);
            Process p = null;
            p = pb.start();

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;
            String traceString = "";
            boolean testPassed = false;

            while ((line = stdInput.readLine()) != null) {
                //System.out.println(line);
                if(line.contains("TEST PASSED")){
                    System.out.println("#############################################3");
                    System.out.println("#############################################3");
                    System.out.println("#############################################3");
                    System.out.println(model);
                    System.out.println(trace);
                    System.out.println("#############################################3");
                    System.out.println("#############################################3");
                    return true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean checkModels(String pathFolder, String nameModel1, String nameModel2, String folderTraces, int nTraces ) {

        String model1 = pathFolder.concat("\\").concat(nameModel1);
        String model2 = pathFolder.concat("\\").concat(nameModel2);

        if (simulationTraces(model1, nameModel1, nTraces, folderTraces)) return false;

        return !simulationTraces(model2, nameModel2, nTraces, folderTraces);
    }

    private boolean simulationTraces(String model, String nameModel, int nTraces, String folderTraces) {
        for(int k = 0; k<nTraces; k++){
            String trace = folderTraces.concat(nameModel).concat(Integer.toString(k)).concat("Trace.trn");
            boolean passComplete = this.checkTrace(model, trace);
            if(!passComplete){
                return true;
            }
        }
        return false;
    }
}
