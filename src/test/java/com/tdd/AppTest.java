package com.tdd;


import org.junit.Assert;
import org.junit.Test;
import com.tdd.App;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest{

    @Test
    public void shouldReturnTrue(){
        Assert.assertTrue(1 == 1);

    }

    @Test
    public void checkNumberDivisbleByThreeAndFive()
    {
        App app = new App();
        assertEquals("FizzBuzz", app.checkNumber(6));
    }

    public void chedkNumberNotDivisbleByThreeAndFive()
    {
        App app = new App();
        assertEquals("6", app.checkNumber(6));
    }


}
