package by.tamp.module4.test;

import by.tamp.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Date;

public class BaseTest {
    protected Calculator calculator = new Calculator();

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();// почему не инициализирует перед каждым тестовым классом? Разобраться!
    }

    protected void checkTime() {
        System.out.println(new Date(System.currentTimeMillis()));
    }

    @AfterClass
    public void teatDown() {
        System.out.println("Suite completed");
    }
}
