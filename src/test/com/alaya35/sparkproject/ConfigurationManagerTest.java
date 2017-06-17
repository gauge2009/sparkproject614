package com.alaya35.sparkproject;

import com.alaya35.sparkproject.conf.ConfigurationManager;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ConfigurationManagerTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ConfigurationManagerTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ConfigurationManagerTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        String testvalue1 = ConfigurationManager.getProperty("testkey1");
        String testvalue2 = ConfigurationManager.getProperty("testkey2");
      if(testvalue1== "testvalue1" )
        assertTrue( true );
      assertEquals("testvalue2", testvalue2);
    }
}
