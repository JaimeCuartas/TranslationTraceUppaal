package translation.Main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

public class Preamble {
    private Set<String> channels;
    private String timeout;
    private String precision;

    public Preamble (Set<String> channels, String precision, String timeout){
        this.channels = channels;
        this.precision = precision;
        this.timeout = timeout;
    }

    public String getChannelsString() {
        String output = "";
        String separator = "";
        for(String chan: this.channels){
            output = output.concat(separator).concat(chan).concat("()");
            separator = ", ";
        }
        return output;
    }

    public String getTimeout() {
        return this.timeout;
    }

    public String getPrecision() {
        return this.precision;
    }

    public String getPreamble(){
        String output = "input ;\n";
        output = output.concat("output ").concat(this.getChannelsString()).concat(";\n");
        output = output.concat("precision ").concat(this.precision).concat(";\n");
        output = output.concat("timeout ").concat(this.timeout).concat(";\n");
        return output;
    }
}
