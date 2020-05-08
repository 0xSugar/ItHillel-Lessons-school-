package introductionJava.lesson6;

import java.io.IOException;
import java.text.ParseException;

public class Lesson6_HW_1_seconds_and_minutes {

    public static void main(String[] args) throws ParseException, IOException {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(69, 9));
        System.out.println(getDurationString(230004L, 56L));
    }

    public static String getDurationString(long mins, long secs) throws ParseException {
        if (mins >= 0 && secs >= 0 && secs <= 59) {
/**         Отличный код через SimpleDateFormat + Date:
 *          -> экономит место
 *          -> упрощает чтение
 *          -> лечит простуды!!                          */
//            SimpleDateFormat sdf = new SimpleDateFormat("mm ss");
//            Date date = sdf.parse(mins + " " + secs);
//            SimpleDateFormat correctFormat = new SimpleDateFormat("HH'h' mm'm' ss's'");
//            return correctFormat.format(date);

                long correctHours = mins / 60;
                long correctMins = mins % 60;


                String h, m, s;
                h = (correctHours < 10) ? "0" + correctHours + "h " : correctHours + "h ";
                m = (correctMins < 10) ? "0" + correctMins + "m " : correctMins + "m ";
                s = (secs < 10) ? "0" + secs + "s" : secs + "s";

//              Можно! написать в одну строку.. но это --- М И Н У С глаза.. вот доказательства:
//              return (correctHours < 10 ? "0" + correctHours + "h " : correctHours + "h ") + (correctMins < 10 ? "0" + correctMins + "m " : correctMins + "m ") + (secs < 10 ? "0" + secs + "s" : secs + "s");
                return h + m + s;
        } else {
            return "Invalid value";
        }
    }

    public static String getDurationString(long secs) throws ParseException {
        if (secs >= 0) { // за простоту балы Н Е Л Ь З Я снимать!!!!!!!!
            return getDurationString(secs / 60, secs % 60);
        } else {
            return "Invalid value";
        }
    }
}