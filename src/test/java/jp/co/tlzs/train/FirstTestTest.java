package jp.co.tlzs.train;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * FirstTest Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Apr 7, 2019</pre>
 */
public class FirstTestTest {
    FirstTest firstTest;

    @Before
    public void before() throws Exception {
        firstTest = new FirstTest();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getWord()
     */
    @Test
    public void testGetWord() throws Exception {
        assertEquals("word", firstTest.getWord());

//TODO: Test goes here... 
    }


} 
