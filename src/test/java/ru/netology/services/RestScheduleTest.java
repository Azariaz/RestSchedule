package ru.netology.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RestScheduleTest {

    @Test
    void shouldCalculateForSmallAmounts() {
        RestSchedule restSchedule = new RestSchedule();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int expected = 3;

        int actual = restSchedule.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForLargeAmounts() {
        RestSchedule restSchedule = new RestSchedule();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int expected = 2;

        int actual = restSchedule.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
