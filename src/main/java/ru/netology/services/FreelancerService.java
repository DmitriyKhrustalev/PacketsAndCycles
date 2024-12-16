package ru.netology.services;

public class FreelancerService {

    public int calculateRestMonths(int income, int expenses, int threshold) {
        int restMonths = 0;
        int savings = 0;

        for (int month = 1; month <= 12; month++) {
            if (savings >= threshold) {
                restMonths++;
                savings -= expenses;
                savings -= savings / 3;
            } else {
                savings += income;
                savings -= expenses;
            }
        }
        return restMonths;
    }
}