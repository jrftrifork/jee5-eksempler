package com.trifork.livret;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

@Stateless
public class LivretService {
    @Resource
    private SessionContext ctx;

    @PostConstruct
    public void init() {
        System.out.println("LivretService er i live");
    }

    public List<String> listLivretter() {
        return Arrays.asList("Boller i karry", "Paella", "Bøf med løg");
    }
}
