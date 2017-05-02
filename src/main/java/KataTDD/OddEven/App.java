
package KataTDD.OddEven;

public class App {

    public String concatenation(String division) {
        String result = "";
        for (int i = 1; i <= 20; i++) {
            if ((division == "even") && ((i % 2) == 0)) {
                result = result.concat("even");
            } else if ((division == "odd") && ((i % 2) != 0)) {
                result = result.concat("odd");
            } else if ((division == "prime") && (checkPrime(i) && (i > 1))) {
                result = result.concat("prime");
            } else {
                result = result.concat(String.valueOf(i));
            }
        }
        return result;
    }

    private boolean checkPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
