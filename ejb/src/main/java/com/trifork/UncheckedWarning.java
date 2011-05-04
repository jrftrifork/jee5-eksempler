package com.trifork;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class UncheckedWarning<T> {
    public String doYourStuff(T element) {
        List list = new ArrayList<T>();
        list.add(element);

        T theElement = (T) list.get(0);
        String maybeWeAreLucky = (String) list.get(0);

        return maybeWeAreLucky + theElement.toString();
    }
}
