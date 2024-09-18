package org.example;

//import junit.framework.Assert;
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.config.AppConfig;
import org.example.model.AnimalsCage;
import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;




/**
 * Unit test for simple App.
 */
@ContextConfiguration(classes = AppConfig.class)
public class AppTest extends TestCase {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void mainTest() {
        long time = 0;
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            if (i == 0) {
                time = bean.getTimer().getTime();
                continue;
            }
            Assert.assertEquals("Тест провален, не корректная реализация бинов.", time, bean.getTimer().getTime().longValue());
            System.out.println(time);
        }
    }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    @org.jetbrains.annotations.Contract(" -> new")
    public static TestSuite suite() {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue( true );
    }
}
