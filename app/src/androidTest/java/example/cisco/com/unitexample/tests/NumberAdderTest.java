package example.cisco.com.unitexample.tests;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

import example.cisco.com.unitexample.NumberAdder;

/**
 * Created by bhargoel on 28/10/14.
 */
public class NumberAdderTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }


    @SmallTest
        public void testNumberAdder()
        {

            int result = NumberAdder.addNumbers(2,3);
            assertEquals(result,5);

        }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
