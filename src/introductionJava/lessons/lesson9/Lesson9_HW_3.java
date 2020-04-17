package introductionJava.lessons.lesson9;

import java.util.Arrays;

public class Lesson9_HW_3 {
    public static void main(String[] args) {
        int[] arr = {1,1,5,5,1,5,1,5,5,1};
        int numb = 5;

        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != numb) {
                size++;
            }
        }

        int[] result = new int[size];

        size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != numb) {
                result[size] = arr[i];
                size++;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
