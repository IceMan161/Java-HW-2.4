package ru.netology.sqr;

public class SQRService {

    public int squareCounter(int lowerBound, int upperBound) {
        int initialNumber = 10; // Начальное число
        int finiteNumber = 99; // Конечное число
        int calculate = 0;

        // Возведение каждого числа
        for (int i = initialNumber; i <= finiteNumber; i++) {
            int exponentiation = (int) Math.pow(i, 2);
            if (exponentiation >= lowerBound && exponentiation <= upperBound)
                calculate++;

        }
        return calculate;
    }
}


