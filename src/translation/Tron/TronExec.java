package translation.Tron;

import translation.Main.Simulation;

import java.io.*;

public class TronExec {


    public boolean checkTrace(String model, String trace){


        try{
            //String cmd = "  /home/jaime/Downloads/uppaal-tron-1.5-linux/tron  ".concat(model).concat(" -Q log -I TraceAdapter -- -m preamble.trn\"");

            ProcessBuilder pb = new ProcessBuilder(
                    "/home/jaime/Downloads/uppaal-tron-1.5-linux/tron",
                    model,
                    "-Q",
                    "log",
                    "-I",
                    "TraceAdapter",
                    "--",
                    "-m",
                    "preamble.trn"
            );
            pb.redirectInput(new File(trace));
            pb.redirectErrorStream(true);
            Process p = null;
            p = pb.start();
            p.waitFor();

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = null;

            while ((line = stdInput.readLine()) != null) {

                if(line.contains("TEST PASSED")){
                    System.out.println("TEST PASSED");
                    return true;
                }
            }

            System.out.println(model);
            System.out.println(trace);
            System.out.println("NOT PASSED");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return false;
    }

    public Simulation checkModels(String pathFolder, String nameModel1, String nameModel2, String folderTraces, int nTraces ) {

        long timeStart = System.currentTimeMillis();

        String model1 = pathFolder.concat("/").concat(nameModel1);

        Simulation simulation = new Simulation();

        simulationTraces(simulation, model1, nameModel2, nTraces, folderTraces);

        if (!simulation.isSimilar()) {
            long timeFinish = System.currentTimeMillis();
            long timeCheck = timeFinish - timeStart;
            simulation.setTime(timeCheck);
            return simulation;
        }

        String model2 = pathFolder.concat("/").concat(nameModel2);

        simulationTraces(simulation, model2, nameModel1, nTraces, folderTraces);

        long timeFinish = System.currentTimeMillis();
        long timeCheck = timeFinish - timeStart;
        simulation.setTime(timeCheck);
        return simulation;
    }

    //Increase the number of checked traces and set "similar" into false in case some trace can not be simulated

    private void simulationTraces(Simulation simulation, String model, String nameModel, int nTraces, String folderTraces) {
        for(int k = 0; k<nTraces; k++){
            String trace = folderTraces.concat(nameModel).concat(Integer.toString(k)).concat("Trace.trn");
            boolean passComplete = this.checkTrace(model, trace);
            simulation.increaseNCheckdTraces();
            if(!passComplete){
                simulation.setSimilar();
                return;
            }
        }
    }
}
