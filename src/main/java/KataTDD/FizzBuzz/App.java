
package KataTDD.FizzBuzz;

public class App {

    public String concatenation(int division) {
        String result = "";
        for (int i = 1; i <= 100; i++) {
            if ((division == 3) && (i % division) == 0) {
                result = result.concat("Fizz");
            } else if ((division == 5) && (i % division) == 0) {
                result = result.concat("Buzz");
            } else if ((division == 15) && (i % division) == 0) {
                result = result.concat("FizzBuzz");
            } else {
                result = result.concat(String.valueOf(i));
            }
        }
        return result;
    }

//    private String concatenationCase(int division) {
//        String result = "";
//        for (int i = 1; i <= 100; i++) {
//            if ((division == 3) && (i % division) == 0) {
//                result = result.concat("Fizz");
//            } else if ((division == 5) && (i % division) == 0) {
//                result = result.concat("Buzz");
//            } else if ((division == 15) && (i % division) == 0) {
//                result = result.concat("FizzBuzz");
//            } else {
//                result = result.concat(String.valueOf(i));
//            }
//        }
//        return result;
//    }
//
//    private String concatenationFive() {
//        String result = "";
//        for (int i = 1; i <= 100; i++) {
//            if ((i % 5) == 0) {
//                result = result.concat("Buzz");
//            } else {
//                result = result.concat(String.valueOf(i));
//            }
//        }
//        return result;
//    }
//
//    private String concatenationBoth() {
//        String result = "";
//        for (int i = 1; i <= 100; i++) {
//            if ((i % 15) == 0) {
//                result = result.concat("FizzBuzz");
//            } else {
//                result = result.concat(String.valueOf(i));
//            }
//        }
//        return result;
//    }
}
