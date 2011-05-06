package com.trifork;

public class TypeReference<T extends Number> {
    public T add(Number first, Number second, Class<? extends T> resultType) throws IllegalAccessException, InstantiationException {
        final T t = resultType.newInstance();
        //new T(first + second) won't work
        return t;
    }
}
