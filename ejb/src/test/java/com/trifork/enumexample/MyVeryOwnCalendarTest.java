package com.trifork.enumexample;

import org.junit.Test;

public class MyVeryOwnCalendarTest {
    @Test
    public void itShouldRun() {
        final MyVeryOwnCalendar cal = new MyVeryOwnCalendar();
        final Field fieldToSet = Field.MONTH;
        cal.setNicely(fieldToSet, 2);
        System.out.println("Satte dette felt: " + fieldToSet.getHumanName());
    }
}
