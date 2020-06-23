package test.enums;

import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;
import java.util.Date;

public enum  ConstantSpecificMethod {
    DATE_TIME("hahaha"){
        @Override
        String getInfo(){
            return
                    DateFormat.getDateInstance()
                            .format(new Date());
        }
    },CLASSPATH("hehehe"){
        @Override
        String getInfo() {
            return System.getenv("CLASSPATH");
        }

    },VERSION("dududu"){
        @Override
        String getInfo() {
            return System.getProperty("java.version");
        }
    };
    abstract String getInfo();
    String code;

    private ConstantSpecificMethod(String code){
        this.code = code ;
    }

    public String getCode(){
        return code;
    }



    public static void main(String[] args) {
        for(ConstantSpecificMethod csm : values())
            System.out.println(csm.getInfo());
    }
    }
