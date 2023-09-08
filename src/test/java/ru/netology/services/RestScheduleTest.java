package ru.netology.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestScheduleTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/amounts.csv")
    void shouldCalculateForAmounts(int income, int expenses, int threshold, int expected) {
        RestSchedule restSchedule = new RestSchedule();

        int actual = restSchedule.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
