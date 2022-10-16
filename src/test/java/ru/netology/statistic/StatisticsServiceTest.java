package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {
StatisticsService service = new StatisticsService();
    @Test
    void findMax() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);
        System.out.println(actual);
        assertEquals(expected, actual);
    }
    @Test
    void findLessZero(){
        long[] incomesInBillions = {-12, -5, -8, -1, -5, -3, -8, -6};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);
        System.out.println(actual);
        assertEquals(expected, actual);
    }
    @Test
    void findFromOne(){
        long[] incomesInBillions = {5};
        long expected = 5;

        long actual = service.findMax(incomesInBillions);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void findBigAmount(){
        long[] incomesInBillions = {12, 5, 8, 2765040, 5, 3, 8, 6};
        long expected = incomesInBillions[3];

        long actual = service.findMax(incomesInBillions);
        System.out.println(actual);
        assertEquals(expected, actual);
    }
    @Test
    void findZero(){
        long[] incomesInBillions = {-12, -5, -8, 0, -5, -3, -8, -6};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);
        System.out.println(actual);
        assertEquals(expected, actual);
    }
}