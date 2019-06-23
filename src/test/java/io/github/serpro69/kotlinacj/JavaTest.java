package io.github.serpro69.kotlinacj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaTest {

    @Test
    public void testFrodo() {
        assertEquals("Frodo", new FellowshipOfTheRing().getRingBearer());
    }
}
