package com.trifork;

public class Structure<T> {
     public T get() {
        throw new RuntimeException();
     }
    
     public <G> G process(G input) {
         return input;
     }
}