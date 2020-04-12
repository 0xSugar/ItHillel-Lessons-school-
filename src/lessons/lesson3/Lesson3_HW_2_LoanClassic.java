package lessons.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3_HW_2_LoanClassic {
    public static void main(String[] args) throws IOException {
        final float TO_PERCENT = 0.01F; // для себя я бы вообще не создавал эту переменную, мне легче разобраться когда просто циферки написаны. Но черт с ним. В рамках "константы" напишу.
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        // ввод всех данных, суммы, процент и срок
        System.out.print("Введите сумму кредита: ");
        int creditValue = Integer.parseInt(rd.readLine());
        System.out.print("Введите процентную ставку, %: ");
        double creditRate = Double.parseDouble(rd.readLine());
        System.out.print("Введите срок кредитования (сколько месяцев): ");
        int timeOfCredit = Integer.parseInt(rd.readLine());

        // Вычисляем сумму для погашения тела кредита
        double amountForRepayment = (double) creditValue / timeOfCredit;
        System.out.println("\nCумма, которая идёт на погашение тела кредита: " + amountForRepayment +"\n");

        // Вычеслям ежемесячную выплату по процентам и общую переплату
        double totalCredit = creditValue;   // Сумма кредита. Можно конечно использовать creditValue и отнимать он неё.. но вдруг она еще пригодится (сумма кредита)? Не в рамках этой программы, но все же
        double payOver = 0;                 // Общая переплата по кредиту
        for (int i = 1; i <= timeOfCredit; i ++) {  // цикл для кол-ва месяцев
            double payForPercents = totalCredit * (creditRate * TO_PERCENT) / timeOfCredit; // вычесление суммы на погашения... на каждый месяц
            System.out.println(+i + " расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + payForPercents);
            totalCredit -= amountForRepayment;  // от полный суммы кредита отнимаем уже выплаченные
            payOver += payForPercents;          // считаем общую переплату по всем месяцем
        }
        System.out.println("Сумма переплаты за 12 месяцев = " + payOver);


    }
}
