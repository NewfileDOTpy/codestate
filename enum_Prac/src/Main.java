import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Season favoriteSeason = Season.WINTER;
        System.out.println(favoriteSeason);

        Level level = Level.MEDIUM;


        System.out.println("-------------------");
        Level[] levels = Level.values();
        System.out.println(Arrays.toString(levels));
        for (Level x : levels){
            System.out.printf("%s = %d%n",x.name(),x.ordinal());
        }

        System.out.println("--------------------");


        Level finalLevel = Level.valueOf("LOW");
        System.out.println(finalLevel);
        System.out.println(Level.valueOf("LOW")== level.LOW);
        System.out.println(finalLevel.compareTo(Level.MEDIUM));
        System.out.println(level.ordinal());
        System.out.println(level.name());
        System.out.println(Arrays.toString(Level.values()));


        System.out.println("-------------------");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Level input2 = Level.valueOf(input);
        switch (input2) {
                case LOW:
                    System.out.println("낮은 레벨");
                    break;
                case MEDIUM:
                    System.out.println("중간 레벨");
                    break;
                case HIGH:
                    System.out.println("높은 레벨");
                    break;
            }
        System.out.println("--------------------");


    }
}

