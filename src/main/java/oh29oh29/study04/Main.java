package oh29oh29.study04;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        EnumSet<Color> allColorSet = EnumSet.allOf(Color.class);
        System.out.println("EnumSet.allOf(Color.class)");
        System.out.println(allColorSet);
        System.out.println();

        EnumSet<Color> defaultColorSet = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        System.out.println("EnumSet.of(Color.RED, Color.GREEN, Color.BLUE)");
        System.out.println(defaultColorSet);
        System.out.println();

        System.out.println("전체에서 defaultColorSet 제외");
        System.out.println(EnumSet.complementOf(defaultColorSet));
        System.out.println();

        System.out.println("BLUE 에서 ORANGE 범위 출력");
        System.out.println(EnumSet.range(Color.BLUE, Color.ORANGE));
    }
}
