
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
        arrayInt = new int[] {
                6, 9, 15, -2, 92, 11
        };
    }

    @Test
    public void checkArray_returnMinimumValue() {
        int min = app.getMinVal(arrayInt);
        assertEquals(-2, min);
    }

    @Test
    public void checkArray_returnMaximumValue() {
        int max = app.getMaxVal(arrayInt);
        assertEquals(92, max);
    }

    @Test
    public void checkArray_returnNumberOfElements() {
        int length = app.getLength(arrayInt);
        assertEquals(6, length);
    }

    @Test
    public void checkArray_returnAverageOfArray() {
        float avg = app.getAverageVal(arrayInt);
        assertEquals(21.833333, avg, 0.001);
    }
}
