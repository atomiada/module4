package by.tamp.module4.test.mult;

import by.tamp.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultLongTest extends BaseTest {
    private long firstArg;
    private long secondArg;
    private long expectedResult;

    @Factory(dataProvider = "dataMethod")
    public MultLongTest(long firstArg, long secondArg, long expectedResult) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.expectedResult = expectedResult;
    }

    @DataProvider
    public static Object[][] dataMethod() {
        return new Object[][] {
                {2,2,2},
                {3,3,3},
                {4,4,4}
        };
    }

    @Test
    public void testPositiveMultFromFactory() throws Exception {
        checkTime();
        double actualResult = calculator.mult(firstArg, secondArg);
        Assert.assertNotEquals(actualResult, expectedResult, "Invalid result for mult, expected: " + expectedResult);

    }

}
