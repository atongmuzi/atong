package test.excption;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception{
        try {
            in = new BufferedReader(new FileReader(fname));
        }catch (FileNotFoundException f){
            System.out.println("Could not open " + fname);
            throw  f;
        }catch (Exception e){
            try {
                in.close();
            }catch (IOException io){
                System.out.println("in.close() unsuccessful");
            }
            throw e;
        }finally {

        }
    }
    public String getLine(){
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw  new  RuntimeException("readLine() failed");
        }
        return s;
    }
    public void dispose(){
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch (IOException e) {
            throw new RuntimeException("in.close() failed");
        }

    }
}
