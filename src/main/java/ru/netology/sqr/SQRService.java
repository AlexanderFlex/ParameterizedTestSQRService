package ru.netology.sqr;

public class SQRService {
    public int calcsquares(int min, int max) {
        int n = 0;
        for (int i = 10; i <= 99; i++) {
            while (i * i > min) {
                if (i * i < max) {
                    n = n + 1;
                }
                break;
            }
        }
        return (n);
    }
}
