package ru.netology.services;

public class FreelancerService {

    public int calculateRestMonths(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money = money - money / 3;
            } else {
                money = money + income;
            }
        }
        return count;
    }
}