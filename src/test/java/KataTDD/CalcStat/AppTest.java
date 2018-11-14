package KataTDD.CalcStat;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

  private App app;
  private int[] arrayInt;

  @Before
  public void setup() {
    app = new App();
    arrayInt = new int[]{
        6, 9, 15, -2, 92, 11
    };
  }

  @Test
  public void checkArray_returnMinimumValue() {
    assertEqualsThat(-2, app.getMinVal(arrayInt));
  }

  @Test
  public void checkArray_returnMaximumValue() {
    assertEqualsThat(92, app.getMaxVal(arrayInt));
  }

  @Test
  public void checkArray_returnNumberOfElements() {
    assertEqualsThat(6, app.getLength(arrayInt));
  }

  @Test
  public void checkArray_returnAverageOfArray() {
    float avg = app.getAverageVal(arrayInt);
    assertEquals(21.833333, avg, 0.001);
  }

  private void assertEqualsThat(int expect, int actual) {
    assertEquals(expect, actual);
  }
}
