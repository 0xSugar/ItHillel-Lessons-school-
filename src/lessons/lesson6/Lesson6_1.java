package lessons.lesson6;

import java.util.SplittableRandom;

public class Lesson6_1 {
    public static void main(String[] args) {
        int numb = 0;

        for (int i = 0; i < 10000; i++) {
            while(true) {
                double numbDouble = 10 * Math.random();
                if (numbDouble > 1 && numbDouble < 7) {
                    numb = (int) numbDouble;
                    break;
                }
            }
            System.out.println(numb);
        }

        isEvenNumber(numb);
        SplittableRandom random = new SplittableRandom();
        int numb2 = random.nextInt(1, 7);
        System.out.println("Автомат рандом = " + numb2);

        String g;
        String na = "Четное число";
        String na2 = "Нечетное число";
        switch (numb) {
            case 1:
            case 3:
            case 5:
                g = na2;
                break;
            case 2:
            case 4:
            case 6:
                g = na;
                break;
            default:
                g = "Что-то другое";
                break;
        }
    }

    /**
     *  sdfsdfdsf
     * @param numb dsfdsf
     * @return dsfdsfds
     */
    public static boolean isEvenNumber(int numb) {
        return numb % 2 == 0;
    }

    public static String isEvenNumber(boolean g) {
        return g ? "Четное число" : "Нечетное число";
    }

}
