import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    private Human aris = new Human("Aris");


    @Test
    public void getName() throws Exception {
        assertEquals("Aris",aris.getName());
    }

    @Test
    public void testUmhappyToStart() throws Exception {
        assertFalse(aris.isHappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception {
        aris.playWithBall();
        assertTrue(aris.isHappy());
    }

    @Test (expected = IllegalStateException.class)
    public void nameFail() throws Exception {
      aris.getHappyMethod();
    }

    @Test
    public void name() throws Exception {
        aris.playWithBall();
        String msg = aris.getHappyMethod();
        assertEquals("i'm happy", msg);
    }
}