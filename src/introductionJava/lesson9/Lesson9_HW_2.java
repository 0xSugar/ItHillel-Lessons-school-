package introductionJava.lesson9;

import java.util.Arrays;
import java.util.SplittableRandom;

public class Lesson9_HW_2 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        int[] array = new int[40];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 100);
        }
        System.out.println(Arrays.toString(array));

        boolean isIncreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {              // если первое число больше за сторое - false
                isIncreasing = false;
                break;
            }
        }
        System.out.println((isIncreasing ? "Да, этот массив" : "Нет, этот массив не") + " является строго возрастающей последовательностю");
    }
}

//  Эксперемент
//      SplittableRandom random=new SplittableRandom();
//      boolean isIncreasing=true;
//      int count=0;
//      do{
//          System.out.println("Попытка №"+ ++count);
//          int[]array=new int[40];
//          for(int i=0;i<array.length;i++) {
//              array[i]=random.nextInt(10,100);
//          }
//          System.out.println(Arrays.toString(array));
//
//          for(int i=0;i<array.length-1;i++){
//              if(array[i]>array[i+1]){
//                  isIncreasing=false;
//                  break;
//              }
//          }
//      System.out.println((isIncreasing?"Да, этот массив":"Нет. этот массив не")+" является строго возрастающей последовательностю");
//      } while(!isIncreasing);