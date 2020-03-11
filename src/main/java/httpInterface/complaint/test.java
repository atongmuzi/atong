package httpInterface.complaint;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class test {

    public void testWrite() throws IOException {
        FileWriter fstream = new FileWriter("testatong.csv",false);
        BufferedWriter out = new BufferedWriter(fstream);
    }

    }

