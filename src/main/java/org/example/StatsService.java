package org.example;

public class StatsService {
/*Сумму всех продаж.
Среднюю сумму продаж в месяц.
Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
Количество месяцев, в которых продажи были ниже среднего (см. п.2).
Количество месяцев, в которых продажи были выше среднего (см. п.2).*/
    public int sumSales(long[] sales) {  //Сумма всех продаж
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageMonth(long[] sales) { // Средняя сумма продаж в месяц
        int averageSales = sumSales(sales)/ sales.length;

        return averageSales;
    }

    public int maxSalesPerMonth(long[] sales) { // Месяц с наибольшими продажами
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {           // Месяц с наименьшими продажами
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {  //Кол-во мес. в которых продажи ниже среднего
        int lower = 0;
        for (long sale : sales) {
            if (sale < averageMonth(sales)) {
                lower = lower + 1;
            }

        }
        return lower;
    }

    public int OverAverage(long[] sales) {   // Кол-во мес. в которых продажи выше среднего
        int over = 0;
        for (long sale : sales) {
            if (sale > averageMonth(sales)) {
                over = over + 1;
            }

        }
        return over;
    }
}







