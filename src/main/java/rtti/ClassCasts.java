package rtti;

class Building{}
class House extends Building{}

public class ClassCasts {
    public static void main(String[] args) {
        Building building = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(building);
    }

}
