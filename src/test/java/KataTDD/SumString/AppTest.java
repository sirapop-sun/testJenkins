package KataTDD.SumString;

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
  public void sum_string_num1PlusNum2_should_be_3() {
    assertSum("1", "2", "3");
  }

  @Test
  public void sum_string_num1PlusNum2_should_be_2() {
    assertSum("a", "2", "2");
  }

  @Test
  public void sum_string_num1PlusNum2_should_be_0() {
    assertSum("a", "b", "0");
  }

  @Test
  public void sum_string_emptyPlusNum2_should_be_0() {
    assertSum("", "b", "0");
  }

  @Test
  public void sum_string_num1PlusNegativeNum2_should_be_0() {
    assertSum("1", "-1", "0");
  }

  public void assertSum(String num1, String num2, String expect) {
    assertEquals(expect, app.Sum(num1, num2));
  }

}
