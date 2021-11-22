package ru.netology.sqr;

public class SQRService {
    public static void main(String[] args) {
        int a = 10; // Начальное число
        int b = 99; // Конечное число

        // Возведение каждого числа в квадрат и вывод на экран
        for (int i = a; i <= b; i++) {
            if (Math.pow(i, 2)>=200 && Math.pow(i, 2)<=300)
                System.out.printf("Значение " + i + " в квадрате равно %.0f \n", Math.pow(i, 2));
        }
    }
}
