package test.enums;

import test.enums.Food.*;

public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Food.Appetizer.SALAD;
             food = MainCourse.BURRITO;
             food = Dessert.FRUIT;
             food = Coffee.CAPPUCCINO;
    }
}
