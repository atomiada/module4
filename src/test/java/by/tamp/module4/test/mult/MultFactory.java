package by.tamp.module4.test.mult;

import org.testng.annotations.Factory;

public class MultFactory {
    @Factory
    public Object[] factoryMethod() {
        return new Object[] {
            new MultDoubleTest(2,2,4),
                new MultDoubleTest(3,3,9),
                new MultDoubleTest(4,4,16),
                new MultDoubleTest(-2,2,-4),
                new MultDoubleTest(0,2,0)};
    }
}