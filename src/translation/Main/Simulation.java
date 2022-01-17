package translation.Main;

public class Simulation {
    private int nCheckedTraces;
    private boolean similar;
    private int time;

    public Simulation(int nCheckedTraces, boolean similar, int time) {
        this.nCheckedTraces = nCheckedTraces;
        this.similar = similar;
        this.time = time;
    }

    public int getnCheckedTraces() {
        return nCheckedTraces;
    }

    public boolean isSimilar() {
        return similar;
    }

    public int getTime() {
        return time;
    }
}


