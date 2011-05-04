package com.trifork;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NewForLoop {
    private List<String> names = Arrays.asList("John", "Paul", "George", "Ringo");

    public void listNames() {
        for (Iterator iter = names.iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println(name);
        }
    }

    public void listNamesModernStyle() {
        for (String name : names) {
            System.out.println(name);
        }
    }

}
