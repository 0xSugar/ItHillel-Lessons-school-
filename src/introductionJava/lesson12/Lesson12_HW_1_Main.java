package introductionJava.lesson12;

public class Lesson12_HW_1_Main {

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }

    // публичный класс - Калькулятор
    public static class Calculator {
        private Floor flour;
        private Carpet carpet;

        public Calculator(Floor flour, Carpet carpet) {
            this.flour = flour;
            this.carpet = carpet;
        }

        public double getTotalCost() {
            return flour.getArea() * carpet.getCost();
        }
    }

    // публичный класс - Ковровая дорожка
    public static class Carpet {
        private double cost;

        public Carpet(double cost) {
            this.cost = cost < 0 ? 0 : cost;
        }

        public double getCost() {
            return cost;
        }
    }

    // публичный класс - Пол
    public static class Floor {
        private double width;
        private double height;

        public Floor(double width, double height) {
            this.width = width < 0 ? 0 : width;
            this.height = height < 0 ? 0 : height;
        }

        public double getArea() {
            return width * height;
        }
    }
}
