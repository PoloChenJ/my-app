package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import com.mycompany.animal.*;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Animal a = new Cat();
        assertTrue( a.Description() == "Cat Class" );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDog()
    {
        Animal a = new Dog();
        assertTrue( a.Description() == "Dog Class" );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCat()
    {
        Animal a = new Cat();
        assertTrue( a.Description() == "Cat Class" );
    }

    /**
     * Rigourous Test :-)
     */
    public void testMouse()
    {
        Animal a = new Mouse();
        assertTrue( a.Description() == "Mouse Class" );
    }
}
