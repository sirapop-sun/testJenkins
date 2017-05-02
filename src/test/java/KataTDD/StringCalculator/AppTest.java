package KataTDD.StringCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    private App app;
    
    @Before
    public void setup() {
        app = new App();
    }
    
    @After
    public void teardown() {
        app = null;
    }
    
    @Test
    public void add_string_empty_should_be_0() {
        assertAdd("", "0");
    }
    
    @Test
    public void add_string_one_should_be_1() {
        assertAdd("1", "1");
    }
    
    @Test
    public void add_string_two_should_be_3() {
        assertAdd("1,2", "3");
    }
    
    @Test
    public void add_string_two_should_be_1() {
        assertAdd("1;0", "1");
    }
    
    @Test
    public void add_null_should_be_0() {
        assertAdd(null, "0");
    }   
    
    @Test
    public void add_string_three_should_be_6() {
        assertAdd("1,2;3", "6");
    }
    
    @Test
    public void add_string_negative_should_be_errorMessage() {
        assertAdd("1,-2;3", "negatives not allowed");
    }
    
    @Test
    public void add_string_not_number_should_be_0() {
        assertAdd("1,a;3", "0");
    }
    
    public void assertAdd(String numbers, String expect) {
        assertEquals(expect, app.Add(numbers));
    }
   
}
