package test.enums;




import java.util.EnumMap;

import static test.enums.AlarmPoints.BATHROOM;
import static test.enums.AlarmPoints.KITCHEN;

interface Command { void action(); }

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> enumMap =  new EnumMap<>(AlarmPoints.class);
        enumMap.put(KITCHEN,
                () -> System.out.println("Kitchen fire!"));
        enumMap.put(BATHROOM,()-> System.out.println("BATHROOM alert"));

    }
}
