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

        int expected = 3;
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

        int expected = 2;
        int actual = sqrService.squareCounter(226,289);

        assertEquals(expected,actual);
    }

    @Test
    void squareCounterGettingOneSquareIntoTheBoundaries() {
        SQRService sqrService = new SQRService();

        int expected = 1;
        int actual = sqrService.squareCounter(224,226);

        assertEquals(expected,actual);
    }

    @Test
    void squareCounterGettingOneSquareIntoTheBoundariesIncludingTheSumOfSquare() {
        SQRService sqrService = new SQRService();

        int expected = 1;
        int actual = sqrService.squareCounter(225,225);

        assertEquals(expected,actual);
    }
}