package com.trifork.enumexample;

enum Field {
    YEAR("År"),
    MONTH("Måned"),
    WEEK_OF_YEAR("Ugenr"),
    WEEK_OF_MONTH("Ugenr i måned"),
    DATE("Dato"),
    DAY_OF_MONTH("Dag"),
    DAY_OF_YEAR("Dagnr i år"),
    DAY_OF_WEEK("Dag i uge"),
    DAY_OF_WEEK_IN_MONTH("Dag i måned");
    
    private final String humanName;

    Field(String humanName) {
        this.humanName = humanName;
    }

    public String getHumanName() {
        return humanName;
    }
}
