package com.trifork;

import org.junit.Test;

public class StructureTest {
    @Test(expected = RuntimeException.class)
    public void beTheClient() {
        Structure<String> struct =
          new Structure<String>();
        String str = struct.get();

        final Integer another =
          struct.<Integer>process(new Integer(1));
    }
}
