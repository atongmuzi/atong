package test.enums;

public enum  OzWitch {
    NOT("hehe"),HAVE("haha");

    private String description;
    // Constructor must be package or private access:
    private OzWitch(String description) {
        this.description = description;
    }
    public String getDescription(){
        return  description;
    }

    public static void main(String[] args) {
            for (OzWitch ozWitch:OzWitch.values()){
                System.out.println(ozWitch.getClass());
            }
    }
}
