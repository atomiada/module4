package by.tamp.module4.test.sub;

import by.tamp.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubLongTest extends BaseTest {
    private long firstArg;
    private long secondArg;
    private long expectedResult;

    @Factory(dataProvider = "dataProviderForSum")
    SubLongTest(long firstArg, long secondArg, long expectedResult) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.expectedResult = expectedResult;
    }

    @Test(groups = "sub")
    public void testSumFromDataProvider() throws Exception {
        double actualResult = calculator.sub(firstArg, secondArg);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result for sum, expected: " + expectedResult);

    }

    @DataProvider(name = "dataProviderForSum")
    public static Object [][] dataProvider() {
        return new Object[][]{
                {6, 2, 4},
                {2, 2, 0},
                {10, 5, 5},
                {32, 30, 2},
                {11, 8, 3}
        };
    }


}
