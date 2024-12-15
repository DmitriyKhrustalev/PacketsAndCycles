package ru.netology.services;

public class FreelancerService {

    public int calculateRestMonths(int income, int expenses, int threshold) {
        int restMonths = 0;
        int savings = 0;


        for (int month = 1; month <= 12; month++) {
            if (savings >= threshold) {

                savings -= expenses;
                savings /= 3;
                restMonths++;
            } else {

                savings += income - expenses;
            }
        }

        return restMonths;
    }
}
