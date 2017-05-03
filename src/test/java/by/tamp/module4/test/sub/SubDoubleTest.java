package by.tamp.module4.test.sub;

import by.tamp.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubDoubleTest extends BaseTest {
    private double firstArg;
    private double secondArg;
    private double expectedResult;

    @Factory(dataProvider = "dataProviderForSum")
    SubDoubleTest(double firstArg, double secondArg, double expectedResult) {
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
