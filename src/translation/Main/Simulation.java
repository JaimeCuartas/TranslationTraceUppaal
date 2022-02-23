package translation.Main;

public class Simulation {
    private int nCheckedTraces;
    private boolean similar;
    private long time;

    public Simulation (){
        this.nCheckedTraces = 0;
        this.similar = true;
        this.time = 0;
    }



    public int getnCheckedTraces() {
        return nCheckedTraces;
    }

    public boolean isSimilar() {
        return similar;
    }

    public long getTime() {
        return time;
    }

    public void increaseNCheckdTraces(){
        this.nCheckedTraces += 1;
    }

    public void setSimilar(){
        this.similar = false;
    }

    public void setTime(long time){
        this.time = time;
    }
}


