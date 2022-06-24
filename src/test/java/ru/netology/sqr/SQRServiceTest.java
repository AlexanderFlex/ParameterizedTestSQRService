package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3, 200, 300",
            "0, 0, 99",
            "0, 10000, 20000"
    })
    public void test(int expected, int min, int max) {
        SQRService nsqr = new SQRService();
        int actual = nsqr.calcsquares(min, max);
        Assertions.assertEquals(expected,actual);
    }
}
