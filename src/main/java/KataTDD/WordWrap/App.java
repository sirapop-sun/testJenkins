package KataTDD.WordWrap;

public class App {

    public int wrap(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

}
