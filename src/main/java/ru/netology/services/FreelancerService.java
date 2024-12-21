package ru.netology.services;

public class FreelancerService {

    public int calculateRestMonths(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            for (int i = 0; i < 12; i++) {

            }
            if (money <= threshold) {
                // Работаем
                money += income;
                money -= expenses;

            } else {
                // Отдыхаем
                money -= expenses;
                money /= 3;
                count++;
            }
        }
        return count;
    }
}