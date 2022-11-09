package ru.netology.stats;

public class StatsService {

    public long theSumOfAllSales (long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long averageAmountOfSales (long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result / sales.length;
    }

    public int maxAmount (long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minAmount (long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= minSale) {
                minSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lowAverage (long[] sales) {
        long averageSale = averageAmountOfSales (sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverage (long[] sales) {
        long averageSale = averageAmountOfSales (sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}