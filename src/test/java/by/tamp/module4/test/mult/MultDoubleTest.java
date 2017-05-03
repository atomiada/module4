package by.tamp.module4.test.mult;

import by.tamp.module4.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultDoubleTest extends BaseTest {
    private double firstArg;
    private double secondArg;
    private double expectedResult;

    public MultDoubleTest(double firstArg, double secondArg, double expectedResult) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testPositiveMultFromFactory() throws Exception {
        checkTime();
        double actualResult = calculator.mult(firstArg, secondArg);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result for mult, expected: " + expectedResult);

    }
}
