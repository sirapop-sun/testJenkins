
package KataTDD.FizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    private App app;
    private String checkOneToHundred;
    private String checkFizz;
    private String checkBuzz;
    private String checkFizzBuzz;

    @Before
    public void setup() {
        app = new App();
        checkOneToHundred = "123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899100";
        checkFizz = "12Fizz45Fizz78Fizz1011Fizz1314Fizz1617Fizz1920Fizz2223Fizz2526Fizz2829Fizz3132Fizz3435Fizz3738Fizz4041Fizz4344Fizz4647Fizz4950Fizz5253Fizz5556Fizz5859Fizz6162Fizz6465Fizz6768Fizz7071Fizz7374Fizz7677Fizz7980Fizz8283Fizz8586Fizz8889Fizz9192Fizz9495Fizz9798Fizz100";
        checkBuzz = "1234Buzz6789Buzz11121314Buzz16171819Buzz21222324Buzz26272829Buzz31323334Buzz36373839Buzz41424344Buzz46474849Buzz51525354Buzz56575859Buzz61626364Buzz66676869Buzz71727374Buzz76777879Buzz81828384Buzz86878889Buzz91929394Buzz96979899Buzz";
        checkFizzBuzz = "1234567891011121314FizzBuzz1617181920212223242526272829FizzBuzz3132333435363738394041424344FizzBuzz4647484950515253545556575859FizzBuzz6162636465666768697071727374FizzBuzz7677787980818283848586878889FizzBuzz919293949596979899100";
    }

    @After
    public void teardown() {
        app = null;
        checkOneToHundred = "";
        checkFizz = "";
        checkBuzz = "";
        checkFizzBuzz = "";
    }

    @Test
    public void check_string_1_to_100() {
        assertEquals(checkOneToHundred, app.concatenation(1));
    }

    @Test
    public void check_multiples_of_three_return_Fizz() {
        assertEquals(checkFizz, app.concatenation(3));
    }

    @Test
    public void check_multiples_of_five_return_Buzz() {
        assertEquals(checkBuzz, app.concatenation(5));
    }

    @Test
    public void check_multiples_of_both_return_FizzBuzz() {
        assertEquals(checkFizzBuzz, app.concatenation(15));
    }

}
