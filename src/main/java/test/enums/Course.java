package test.enums;

public enum  Course {
    APPETIZER(Food.Appetizer.class);
    Food[] values;

    private Course(Class<? extends Food> cc){
            values = cc.getEnumConstants();
    }
    public Food randomSelection(){
        return Enums.random(values);
    }
}
