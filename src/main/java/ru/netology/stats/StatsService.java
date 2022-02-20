package ru.netology.stats;

public class StatsService {
    //1
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    //2
    public int avgSale(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    //3
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //4
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //5
    public int belowAvg(int[] sales) {
        int belowMonth = 0;
        for (int sale : sales) {
            if (sale < avgSale(sales)) {
                belowMonth++;
            }
        }
        return belowMonth;
    }

    //6
    public int aboveAvg(int[] sales) {
        int aboveMonth = 0;
        for (int sale : sales) {
            if (sale > avgSale(sales)) {
                aboveMonth++;
            }
        }
        return aboveMonth;
    }
}


