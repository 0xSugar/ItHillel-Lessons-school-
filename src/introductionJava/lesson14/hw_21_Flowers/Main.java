package introductionJava.lesson14.hw_21_Flowers;

public class Main {
    public static void main(String[] args) {
        // Ставим дефотные цены, что бы не заморачиваться с ними
        Rose.setDefaultPrice(45);
        Tulip.setDefaultPrice(20);
        Chamomile.setDefaultPrice(15);

        // Дефолтное имя у каждого цветка уже и так стоит. Создаем букет
        Bouquet bouquet1 = new Bouquet();
        // добавляем цветки
        bouquet1.add(new Tulip(), new Rose(), new Chamomile());
        // выводим
        bouquet1.print();

        System.out.println("\n\n");

        // Создаем второй букет
        Bouquet bouquet2 = new Bouquet();
        bouquet2.add(
                new Rose("Моя Лучшая Роза", 250),
                new Rose(),
                new Rose(),
                new Rose(),
                new Tulip("Мой Лучший Тюльпан", 100),
                new Chamomile(),
                new Chamomile()
        );

        // print
        bouquet2.print();
    }
}
