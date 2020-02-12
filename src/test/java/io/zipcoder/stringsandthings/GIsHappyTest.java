package io.zipcoder.stringsandthings;

import io.zipcoder.StringsAndThings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 29/01/2019.
 */
public class GIsHappyTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setup(){
        stringsAndThings = new StringsAndThings();
    }


    @Test
    public void gIsHappyTest1(){
        Boolean actual = stringsAndThings.gIsHappy("xxggxx");
        Assert.assertTrue(actual);
    }

    @Test
    public void gIsHappyTest2(){
        Boolean actual = stringsAndThings.gIsHappy("xxgxx");
        Assert.assertFalse(actual);
    }

    @Test
    public void gIsHappyTest3(){
        Boolean actual = stringsAndThings.gIsHappy("xxggyygxx");
        Assert.assertFalse(actual);

        //Just a heads up i changed this to assertFalse so i can see if my this passes all 3 test cases. the comments said this is supposed to assert false. please no accuse of cheating :)
    }

}
