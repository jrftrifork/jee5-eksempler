package com.trifork;

import org.junit.Test;

public class UncheckedWarningTest {
    @Test(expected = NullPointerException.class)
    public void testDoYourStuff() throws Exception {
        new UncheckedWarning<String>().doYourStuff(null);
    }
}
