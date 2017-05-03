package by.tamp.module4.test.sum;

import by.tamp.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseTest {
    double actualResult;

    @Test(groups = "sum", description = "creates instance")
    public void testInstance() {
        Assert.assertNotNull(calculator, "Instance wasn't created");
    }

    @Test(groups = "sum", dataProvider = "dataProviderForSum", dependsOnMethods = "testInstance")
    public void testSumDouble(double a, double b, double expectedResult) throws Exception {
        actualResult = calculator.sum(a, b);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result for sum, expected: " + expectedResult);
    }

    @DataProvider(name = "dataProviderForSum")
    public Object [][] dataProvider() {
        return new Object[][]{
                {3, 2, 5},
                {-1, 6, 5},
                {4, -4, 0},
                {0, 5, 5},
                {1000000000, 10000, 1000010000}
        };
    }


}
