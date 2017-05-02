package KataTDD.LeapYear;

public class App {

    public boolean checkLeapYear(int year) {
        boolean result = false;
        
        if (((year % 4) == 0) && ((year % 100) != 0)) {
            result = true;
        } else if ((year % 400) == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}
