package school.mjc.stage0.conditions.task3;

public class Seasons {
    public static void tellTheSeasonByMonthNumber(int month) {
        if (month == 12) {
            System.out.println("Winter");
        }
        if (month < 13 && month > 0) {
            if (month < 3) {
                System.out.println("Winter");
            }
            if (month > 2 && month < 6) {
                System.out.println("Spring");
            }
            if (month > 5 && month < 9) {
                System.out.println("Summer");
            }
            if (month > 8 && month < 12) {
                System.out.println("Autumn");
            }
        } else {
            System.out.println("wrong number!");
        }
    }
}
