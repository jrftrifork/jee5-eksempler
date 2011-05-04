package com.trifork;

import org.junit.Before;
import org.junit.Test;

public class NewForLoopTest {
    @Before
    public void setup() {
    }

    @Test
    public void testListNames() throws Exception {
        System.out.println("\nOld:");
        new NewForLoop().listNames();
    }

    @Test
    public void testListNamesModernStyle() throws Exception {
        System.out.println("\nNew:");
        new NewForLoop().listNamesModernStyle();
    }
}
