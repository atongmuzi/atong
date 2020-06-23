package test.enums;

import java.util.EnumSet;

import static test.enums.AlarmPoints.*;

public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        points.add(BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);
        points= EnumSet.allOf(AlarmPoints.class);
        System.out.println(points);
        points.removeAll(EnumSet.of(STAIR1));
        System.out.println(points);
        EnumSet<AlarmPoints> points1 = EnumSet.range(OFFICE1,OFFICE4);
        points.removeAll(points1);
        System.out.println(points);

    }
}
