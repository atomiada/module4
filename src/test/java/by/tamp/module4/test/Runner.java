package by.tamp.module4.test;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TestListenerAdapter testListenerAdapter = new TestListenerAdapter();
        TestNG testNG = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setName("CalculatorSuite");
        List<String> files = new ArrayList<String>();
        files.addAll(new ArrayList<String>(){{
            add("./src/test/resources/sum.xml");
            add("./src/test/resources/sub.xml");
        }});
        suite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
