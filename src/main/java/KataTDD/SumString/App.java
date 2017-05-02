
package KataTDD.SumString;

public class App {

    public String Sum(String num1, String num2) {
        return String.valueOf(parseToInt(num1) + parseToInt(num2));
    }

    public int parseToInt(String num1) {        
        int numInt;
        try {
            numInt = Integer.parseInt(num1);
            return numInt;
        } catch (Exception e) {
            return 0;
        }
    }
}
