package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;

    }

    public int maximum(long[] sales) {
        int maximumMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maximumMonth]) {
                maximumMonth = month;
            }
            month = month + 1;
        }
        return maximumMonth + 1;
    }

    public int minSales(long[] sales) {
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

    public int belowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }

        }
        return counter;
    }


    public int aboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }

        }
        return counter;
    }
}
