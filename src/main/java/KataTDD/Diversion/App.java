
package KataTDD.Diversion;

import java.math.BigInteger;

public class App {

    public String[] makeBinary(int digits) {
        String[] result = new String[2];
        result[0]= String.format("%0" + digits + "d", 0);
        int length = (int) Math.pow(2, digits);
        for (int i = 1; i < length; i++) {
            result[0] = result[0] + ","
                    + String.format("%0" + digits + "d", new BigInteger(Integer.toBinaryString(i)));
        }
        result[1] = String.valueOf(checkDontAdjacent(result[0]));
        return result;
    }

    private int checkDontAdjacent(String binary) {
        
        String[] splited = binary.split(",");
        int count = 0;
        
        for (String split : splited) {
            for (int i = 1; i < split.length(); i++) {
                if ((split.charAt(i - 1) == '1') && (split.charAt(i) == '1')
                        && (split.charAt(i - 1) == split.charAt(i))) {
                    count++;
                    break;
                }
            }
        }

        return splited.length - count;
    }

}
