package com.trifork;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    List<Integer> scores = new ArrayList<Integer>();
    
    public void box() {
        scores.add(new Integer(4));
        scores.add(7);

        int i = new Integer(12);
    }

    public void assign(Integer j) {
        int k = j;
    }
}
