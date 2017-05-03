package by.tamp.module4.test.dataProviders;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "dataForDivDouble")
    public static Object[][] getDataForDivDouble() {
        return new Object[][] {
                {48,8,6},
                {0, 5, 0},
                {1000000000, 1000000000, 1},
                {-30, 6, -5},
                {-24, -4, 6}
        };
    }

    @DataProvider(name = "dataForDivLong")
    public static Object[][] getDataForDivLong() {
        return new Object[][] {
                {48,8,6},
                {0, 5, 0},
                {1000000000, 1000000000, 1},
                {-30, 6, -5},
                {-24, -4, 6}
        };
    }

}
