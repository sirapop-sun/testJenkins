
package KataTDD.StringCalculator;

public class App {

    public String Add(String numbers) {
        if (numbers == "" || numbers == null ) {
            return "0";
        } else {
            String[] splits = numbers.split(",|\\;|\\.|\\r|\\n");
            return Sum(splits);
        }
    }

    private String Sum(String[] splits) {
        String errorMessage = "negatives not allowed";
        int result = 0;
        for (String split : splits) {
            try {
                if (Integer.parseInt(split) >= 0) {
                    result += Integer.parseInt(split);
                } else {
                    throw new Exception(errorMessage);
                }
            } catch (Exception e) {
                if (e.getMessage().equals(errorMessage)) {
                    return errorMessage;
                } else {
                    return "0";
                }
            }
        }
        return String.valueOf(result);
    }
}
