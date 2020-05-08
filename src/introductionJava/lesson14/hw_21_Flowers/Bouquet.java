package introductionJava.lesson14.hw_21_Flowers;

import java.util.ArrayList;
import java.util.Arrays;

public class Bouquet {
    private ArrayList<Flower> list = new ArrayList<>();

    public void print() {
        double price = 0;
        for (int i = 0; i < list.size(); i++) { // увеличием i на 1, что бы красиво отображалось
            System.out.println(String.format("#%d %s", i+1, list.get(i)));
            price += list.get(i).getPrice();
        }
        System.out.printf("Стоимость букета - %d%n", (int) price);
    }

    public void add(Flower...flowers) {
        list.addAll(Arrays.asList(flowers));
    }

    public Flower remove(int number) {  // в print выводит с 1го, а не 0. Если смотреть по нему и удалять,
        if (list.size() > number-1) {   // то под номером 1 будет - ячейка 0, по этому нужно уменьшить на 1
            return list.remove(number-1);   // для обычного пользователя.
        } else {
            System.out.println("Указан неверный индекс");
        }
        return null;
    }

    public Flower removeLast() {
        if (!list.isEmpty()) {
            return list.remove(list.size()-1);
        } else {
            System.out.println("Больше не осталось цветков");
        }
        return null;
    }
}
