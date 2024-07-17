package ru.netology.hwjavamaven3.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void AllSumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSumSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSumMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSumMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverageMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverageMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.aboveAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}