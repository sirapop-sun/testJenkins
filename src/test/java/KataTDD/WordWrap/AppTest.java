package KataTDD.WordWrap;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

  private App app;
  private String word;
  private String wordNewline;

  @Before
  public void setup() {
    app = new App();
    word = "this is a text";
    wordNewline = "this\nis a t\nest";
  }

  @After
  public void teardown() {
    app = null;
    word = "";
    wordNewline = "";
  }

  @Test
  public void sendString_return_amountOfWord() {
    int amount = app.wrap(word);
    assertEquals(3, amount);
  }

  @Test
  public void sendString_ignoreNewline_return_amountOfWord() {
    int amount = app.wrap(wordNewline);
    assertEquals(2, amount);
  }
}
