package ru.netology.services;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelancerServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/test-data.csv")
    public void testCalculateRestMonths(int income, int expenses, int threshold, int expectedRestMonths) {
        FreelancerService service = new FreelancerService();
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//        int expectedRestMonths = 3;

        int actualRestMonths = service.calculateRestMonths(income, expenses, threshold);

        Assertions.assertEquals(expectedRestMonths, actualRestMonths);
    }
}
