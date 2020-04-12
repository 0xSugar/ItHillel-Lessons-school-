package lessons.lesson5;

public class Lesson5_HW_2 {

    static final double KM_TO_ML = 1.609;

    public static void main(String[] args) {
        double n = 75.114;
        toMilesPerHour(n);
        printConversion(n);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {  // в задаче - "если меньше нуля".. так и написал
            return -1;
        } else {
            return Math.round(kilometersPerHour / KM_TO_ML);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Неверное значение");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}