package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelancerServiceTest {
    @Test
    public void testCalculateRestMonths() {
        FreelancerService service = new FreelancerService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expectedRestMonths = 3;

        int actualRestMonths = service.calculateRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expectedRestMonths, actualRestMonths);
    }
}
