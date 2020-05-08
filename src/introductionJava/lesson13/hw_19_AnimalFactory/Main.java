package introductionJava.lesson13.hw_19_AnimalFactory;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String line = rd.readLine();
            if (line.equals("exit")) return;

            Animal animal = AnimalFactory.getAnimalByKey(line);
            if (animal != null) {                       // Не вижу смысла проверять на Cat или Dog, как и
                System.out.println(animal.getName());   // делать даункастинг, он и так, если не null, выведет
                return;                                 // метод наследника и все правльно отпишет...
            } else {
                System.out.println("Не могу создать Animal, введите следующую строку");
            }
        }
    }
}
