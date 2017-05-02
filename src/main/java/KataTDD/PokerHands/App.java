package KataTDD.PokerHands;

public class App {

    public String getHighCard(String cards) {
        String[] splited = cards.split(" ");
        String tmp = splited[0];
        for (int i = 1; i < splited.length; i++) {
        }
        return tmp;
    }

}
