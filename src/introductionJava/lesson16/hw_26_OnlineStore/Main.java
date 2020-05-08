package introductionJava.lesson16.hw_26_OnlineStore;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String file = "src/introductionJava/lessons/lesson16/hw_26_OnlineStore/file.txt";

        // читает файлы
        List<String> lines = readLines(file);

        // заносит в мапу
        Map<String, TreeMap<String, Integer>> customers = fillCustomersMap(lines);

        // выводит
        printStatistic(customers);
    }

    private static void printStatistic(Map<String, TreeMap<String, Integer>> customers) {
        for (Map.Entry<String, TreeMap<String, Integer>> entry : customers.entrySet()) {    // берем основную мапу
            System.out.println(entry.getKey());                                             // выводим имя
            for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {         // берем вторую мапу
                System.out.println(entry2.getKey() + ": " + entry2.getValue());             // выводи покупки + кол-во
            }
            System.out.println();                                                           // ставим пробел
        }
    }

    private static Map<String, TreeMap<String, Integer>> fillCustomersMap(List<String> lines) throws IOException {
        Map<String, TreeMap<String, Integer>> customers = new TreeMap<>();  // создаем мапу
        for (String line : lines) {                                         // прохрдим по всем строкам

            String[] customer = line.split("\\s");                   // разделяем на составляющие
            if (customer.length != 3) {                                    // если составляющих не 3 - исключение
                throw new RuntimeException("Было передано не 3 значения в строке");
            }

            TreeMap<String, Integer> purchases = getMapByName(customers, customer[0]); // берем вторую мару у этого человека
            // если нету - создаем и возвращаем
            String purchase = customer[1];                      // перем покупку
            Integer amount = Integer.parseInt(customer[2]);     // колличество

            if (purchases.containsKey(purchase)) {              // если такая покупка уже есть - прибавить значение
                amount += purchases.get(purchase);
            }
            purchases.put(purchase, amount);                    // обновить данные
        }
        return customers;
    }

    private static TreeMap<String, Integer> getMapByName(Map<String, TreeMap<String, Integer>> customers, String name) {
        if (customers.containsKey(name)) {      // все просто.. если есть такой ключ - вернуть значение
            return customers.get(name);
        } else {                                // если нету - создать мапу, положить ключ - значение, вернуть мапу
            TreeMap<String, Integer> purchases = new TreeMap<>();                   // тут значение equals мапа
            customers.put(name, purchases);
            return purchases;
        }
    }


    private static List<String> readLines(String file) throws IOException {
        List<String> list = new ArrayList<>();

        BufferedReader rd = new BufferedReader(new FileReader(file));
        while (rd.ready()) {        // открыли поток, считали - добавили, закрыли поток - вернули лист
            String line = rd.readLine();
            if (!line.isBlank()) {
                list.add(line);
            }
        }
        rd.close();

        return list;
    }
}
