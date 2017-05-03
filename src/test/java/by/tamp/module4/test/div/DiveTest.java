package by.tamp.module4.test.div;

import by.tamp.module4.test.BaseTest;
import by.tamp.module4.test.dataProviders.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DiveTest extends BaseTest {
    double actualResult;

    @Test(description = "creates instance")
    public void testInstance() {
        Assert.assertNotNull(calculator, "Instance wasn't created");
    }

    @Test(dependsOnMethods = "testInstance", dataProvider = "dataForDivDouble", dataProviderClass = TestData.class)
    public void testDivDouble(double a, double b, double expectedResult) throws Exception {
        actualResult = calculator.div(a, b);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result for div, expected: " + expectedResult);
    }

    @Test(dependsOnMethods = "testInstance", dataProvider = "dataForDivLong", dataProviderClass = TestData.class)
    public void testDivLong(long a, long b, long expectedResult) throws Exception {
        actualResult = calculator.div(a, b);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result for div, expected: " + expectedResult);
    }
}
