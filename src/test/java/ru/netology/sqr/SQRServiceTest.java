package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void squareCounterCorrectValueInBorder() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.squareCounter(200,300);

        assertEquals(expected,actual);
    }

    @Test
    void squareCounterInvalidValueWithinTheBoundaries() {
        SQRService sqrService = new SQRService();

        int expected = 4;
        int actual = sqrService.squareCounter(200,300);

        assertEquals(expected,actual);
    }

    @Test
    void squareCounterBoundaryNumbers() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.squareCounter(225,289);

        assertEquals(expected,actual);
    }

    @Test
    void squareCounterBoundaryNumbersBeyond() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.squareCounter(226,289);

        assertEquals(expected,actual);
    }

}