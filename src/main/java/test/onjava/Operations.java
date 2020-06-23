package test.onjava;

public class Operations {

    String string;

    public Operations(String string){
            this.string = string;
    }

    @Override
    public String toString(){
        return string;
    }

    public static Operations show(String string){
            return new Operations(string);
    }
}
