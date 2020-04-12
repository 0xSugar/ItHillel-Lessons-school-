package lessons.lesson6;

public class Lesson6_HW_3_BodyMassIndex {
    public static double calculateBodyMassIndex(int height, double weight){
        return weight / (Math.pow(height * 0.01, 2));
    }

    // На всякий, если перепутают... как я
    public static double calculateBodyMassIndex(double weight, int height){
        return calculateBodyMassIndex(height, weight);
    }

    public static String interpretation(double massIndex) {
        if (massIndex < 16) {
            return "Выраженный дефицит массы тела";
        } else if (massIndex < 18.5) {
            return "Недостаточная (дефицит) масса тела";
        } else if (massIndex < 25) {
            return "Норма";
        } else if (massIndex < 30) {
            return "Избыточная масса тела (предожирение)";
        } else if (massIndex < 35) {
            return "Ожирение";
        } else if (massIndex < 40) {
            return "Ожирение резкое";
        } else {
            return "Очень резкое ожирение";
        }
    }

    public static void printResult (String name, double weight, int height, double bmi) {
        System.out.println("\nИмя: " + name);
        System.out.println("Вес: " + weight);
        System.out.println("Рост: " + height);
        System.out.println("Индекс массы тела: " + Math.round(bmi) + " (" + interpretation(bmi) + ")");
    }
}
