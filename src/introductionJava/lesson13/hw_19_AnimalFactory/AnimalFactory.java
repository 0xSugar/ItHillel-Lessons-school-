package introductionJava.lesson13.hw_19_AnimalFactory;

public class AnimalFactory {
    public static Animal getAnimalByKey(String key) {
        // break не создавал, т.к. до него просто не дойдет.. он сразу возвращает результат и все...
        switch (key) {
            case "da" :
                return new Dog("Арамис");
            case "db" :
                return new Dog("Блек");
            case "dc" :
                return new Dog("Спайки");
            case "ca" :
                return new Cat("Амадей");
            case "cd" :
                return new Cat("Баксик");
            case "cc" :
                return new Cat("Снежок");
            default:
                throw new RuntimeException("Null");
        }
    }
}
