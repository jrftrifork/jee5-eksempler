package com.trifork;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AutoboxingTest {
    private Autoboxing autoboxing;

    @Before
    public void setup() {
        autoboxing = new Autoboxing();
    }

    @Test
    public void testBox() throws Exception {
        autoboxing.box();
        System.out.println("List after: " + autoboxing.scores);
        assertEquals(2, autoboxing.scores.size());
    }

    @Test(expected = NullPointerException.class)
    public void testAllIsNotWell() throws Exception {
        autoboxing.assign(null);
    }
}
