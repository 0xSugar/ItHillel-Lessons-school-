package introductionJava.lesson15.hw_24_Squirrel;

/**
 * Задача сделана в отдельном провекте, для работы нужна установка Gradle
 *
 * После можно скопировать данные от сюда по нужным классам. Классы:
 * Day
 * Main
 * Util
 * + не забудьте про journal_ru.json
 * Зависимость compile group: 'com.alibaba', name: 'fastjson', version: '1.2.68' // JSON parser
 */

public class ClickOnMe {

/**
 * Первый класс - Day: комментарии
 *  * Я считаю, что правильней назвать класс как Day, а не Events. По то причине, что он
 *  * записывал события за день. Получается, что День - это класс, а события - это какой-то
 *  * список строк, которые он записывал.
 *  * Так же я не вижу смысла использовать лист, по той причине, что все события в течении
 *  * суток пишутся один раз и являются уникальными, а доступ к каждом отдельно события нам
 *  * не нужен.
 *  Код:
 */
/*
public class Day {
    private Set<String> events;
    private boolean squirrel;

    public Day(boolean squirrel, String... events) {
        this.events = new HashSet<String>();
        this.squirrel = squirrel;
        Collections.addAll(this.events, events);
    }

    public Day() {
    }

    public Set<String> getEvents() {
        return events;
    }

    public boolean isSquirrel() {
        return squirrel;
    }

    @Override
    public String toString() {
        return squirrel + ": " + events;
    }
}
 */
/**
 * Второй класс - Main: комментарии
 *  * Перевод строк .json в объекты - моя реализация. Но по сколько логику
 *  * при таком выполнении я не понимаю, то я просто взял её не из книги,
 *  * а из объяснения в лекции 13, на примере массивов.
 *  Код:
 */
/*
public class Main {

    private static String file = "src/main/java/journal_ru.json";

    public static void main(String[] args) throws IOException {
        // считываем файл
        List<Day> days = Util.parseFile(file);
//        System.out.println(days);

        // проверяем формулу
        checkFormula("ел пиццу", days);

        // получаем уникальные элементы
        Set<String> uniqueEvents = getUniqueEvents(days);

        // Все считаем и выводим
        printResult(uniqueEvents, days);

        for (int i = 0; i < days.size(); i++) {
            Set <String> events = days.get(i).getEvents();
            if (includes("ел арахис", events) && !includes("чистил зубы", events)) {
                events.add("арахис-зубы");
            }
        }

        // Выводим
        System.out.println();
        checkFormula("арахис-зубы", days);
    }


    private static void printResult(Set<String> uniqueEvents, List<Day> days) {
        System.out.println("\nДля корреляции > 0.1 или < -0.1");
        for (String event : uniqueEvents) {
            double fi = pi(tableFor(event, days));
            if (fi > 0.1 || fi < -0.1) {
                System.out.println(String.format("%.15s: %.4f", event, fi));
            }
        }
    }

    private static HashSet<String> getUniqueEvents(List<Day> days) {
        HashSet<String> set = new HashSet<>();
        for (Day day : days) {
            set.addAll(day.getEvents());    // порой кажется, что Idea умнее меня :(
        }
        return set;
    }

    private static void checkFormula(String event, List<Day> days) {
        int[] tableForPizza = tableFor(event, days);
        double pi = pi(tableForPizza);
        System.out.println("Проверка = для события \"" + event + "\" таблица = " + Arrays.toString(tableForPizza) + ", число Fi = " + pi);
    }

    private static double pi(int[] arr) {
        double upSide = arr[3] * arr[0] - arr[2] * arr[1];
        double downSide = (arr[2] + arr[3]) *
                (arr[0] + arr[1]) *
                (arr[1] + arr[3]) *
                (arr[0] + arr[2]);
        return upSide / Math.sqrt(downSide);
    }

    // Мой способ мышления явно не такой, как ниже... даже когда я это адаптировал
    // под классы - я все равно с трудом понимаю что происходит. В общем - понимаю,
    // но работать с этим я бы не взялся
    private static int[] tableFor(String event, List<Day> days) {
        int[] table = new int[4];
        for (int i = 0; i < days.size(); i++) {
            int index = 0;
            if (includes(event, days.get(i).getEvents())) {
                index += 1;
            }
            if (days.get(i).isSquirrel()) {
                index += 2;
            }
            table[index] += 1;
        }
        return table;
    }

    private static boolean includes(String event, Set<String> set) {
        for (String oneEvent : set) {
            if (oneEvent.equals(event)) {
                return true;
            }
        }
        return false;
    }
}
*/
/**
 * Третий класс - Util: комментарии
 *  * Я не удивлюсь, если данные в файле я смогу гораздо проще переделать в класс Day
 *  * без FastJSON с помощью split, if && regex.. regex тут скорее всего не понадобятся
 */
/*
public class Util {
    // документация у этих японцев мне не понравилась.. пришлось писать по примеру
    static List<Day> parseFile(String filePath) throws IOException {
        List<Day> list = new ArrayList<>();

        String jsonFile = readFromFile(filePath);                   // получаем все строки в файле - одной строкой
        JSONArray wholeFile = JSONObject.parseArray(jsonFile);  // переделываем это в массив
        if (wholeFile != null) {

            for (Object object : wholeFile) {                   // для каждого эллемента этого массива
                JSONObject x = (JSONObject) object;                 // создаем объект
                boolean squirrel = x.getBoolean("squirrel");   // узнаем состояние, было превращение или нет
                JSONArray events = x.getJSONArray("events");   // снова берем массив
                String[] eventsArr = toStringArr(events);  // ну, понятнее имения не придумал
                list.add(new Day(squirrel, eventsArr));
            }
        }
        return list;
    }

    private static String[] toStringArr(JSONArray events) {
        String delimiter = "SplitPoint";    // разделитель
        if (events == null) {
            return new String[0];
        }
        StringBuilder line = new StringBuilder();
        for (Object object : events) {
            line.append((String) object).append(delimiter);
        }
        return line.toString().split(delimiter);
    }


    private static String readFromFile(String file) throws IOException {
        StringBuilder everything = new StringBuilder();
        BufferedReader rd = new BufferedReader(new FileReader(file));
        while (rd.ready()) {
            everything.append(rd.readLine());
        }
        return everything.toString();
    }
}
 */


}
