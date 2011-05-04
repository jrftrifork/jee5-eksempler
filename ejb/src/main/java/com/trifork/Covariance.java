package com.trifork;

import java.util.ArrayList;
import java.util.Collection;

public class Covariance {
    CharSequence[] covariant = new String[1];
    //Collection<CharSequence> notCovariant = new ArrayList<String>();
    Collection<? extends CharSequence> wildcardToTheRescue = new ArrayList<String>();
}
