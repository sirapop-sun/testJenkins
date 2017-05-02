
package KataTDD.CalcStat;

public class App {

    public int getMinVal(int[] array) {
        int tmp = array[0];
        for (int i : array) {
            if (i < tmp) {
                tmp = i;
            }
        }
        return tmp;
    }

    public int getMaxVal(int[] array) {
        int tmp = array[0];
        for (int i : array) {
            if (i > tmp) {
                tmp = i;
            }
        }
        return tmp;
    }

    public int getLength(int[] array) {
        return array.length;
    }

    public float getAverageVal(int[] array) {
        float sum = 0;
        float avg = 0;
        for (int i : array) {
            sum = sum + i;
        }
        avg = sum / (float) array.length;
        return avg;
    }
}
