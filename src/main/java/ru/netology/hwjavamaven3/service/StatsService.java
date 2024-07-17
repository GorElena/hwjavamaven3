package ru.netology.hwjavamaven3.service;

public class StatsService {

    public long sumSales(long[] sales) { //ищет сумму продаж
        long allSale = 0;

        for (long sale : sales) {
            allSale += sale;
        }

        return allSale;
    }

    public long averageSales(long[] sales) { //ищет среднюю сумму продаж
        return sumSales(sales) / 12;

    }

    public int maxSumMonth(long[] sales) { //ищет номер месяца с максимальными продажами
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSumMonth(long[] sales) { //ищет номер месяца с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) { //ищет количество месяцев с продажами выше среднего
        int counter = 0;
        long average = averageSales(sales);

        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }

        }
        return counter;
    }

    public int aboveAverageSales(long[] sales) { //ищет количество месяцев с продажами ниже среднего
        int counter = 0;
        long average = averageSales(sales);

        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }

        }
        return counter;
    }
}

