package com.dmdev.cs.homeTask.HT2;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Task3 {

//    private static final double SALARY = 600.0;
//    private static final double SALARY_UP = 400.0;
//    private static final int EVERY_MONTHS = 6;
//    private static final double COSTS = 300.0;
//    private static final double COLLECT_PCT = 10.0;
//    private static final double BROKER_PCT = 2.0;

    public static void main(String[] args) {
        int year = 3;
        int month = 2;
        int startSalary = 600;
        int increase = 400;
        int expenses = 300;
        int percentForSave = 10;
        int brokersPercent = 2;


        System.out.println("Account amount: " + saveAccountAmount(startSalary, increase, year, month, expenses, percentForSave));
        System.out.println("Invest amount: " + calcBrokerAccountAmount(startSalary, increase, year, month, percentForSave, brokersPercent));
    }

    // итого месяцев
    private static int countMonth(int year, int month) {
        return (year * 12) + month;
    }

    // зп с повышением = итого за весь период
    private static int countSalary(int startSalary, int increase, int year, int month) {
        int countMonth = countMonth(year, month);
        int totalSalary = 0;
        for (int m = 1; m <= countMonth; m++) { // месяца с первого по 38
            if (m % 6 == 0) {
                startSalary += increase;
            }
            totalSalary += startSalary;
        }
        return totalSalary;

    }

    // сбережения
    private static int saveAccountAmount(int startSalary, int increase, int year, int month, int expenses, int percentForSave) {
        int countMonth = countMonth(year, month);
        int totalSalary = countSalary(startSalary, increase, year, month); //общая зп за весь период
        int totalExpenses = expenses * countMonth; // общие обязательные расходы
        int totalInvest = (totalSalary * percentForSave) / 100;
        return totalSalary - totalExpenses - totalInvest;
    }

    //сколько ежемесячно под инвестиции c учетом повышений + 2 %
    private static double calcBrokerAccountAmount(int startSalary, int increase, int year, int month, int percentForSave, int brokersPercent) {
        int countMonth = countMonth(year, month);
        double brokerAccountAmount = 0;  // Общая сумма на брокерском счете
        int currentSalary = startSalary; // от кого стартуем
        for (int m = 1; m <= countMonth; m++) { // повышения
            if (m % 6 == 0) {
                currentSalary += increase;
            }
            double monthlyInvestment = (currentSalary * percentForSave) / 100.0; // ежемесячная сумма инвестиций
            brokerAccountAmount += monthlyInvestment;
            brokerAccountAmount *= (1 + brokersPercent / 100.0); // коэффициент доходности

        }
        return brokerAccountAmount;
    }

}
