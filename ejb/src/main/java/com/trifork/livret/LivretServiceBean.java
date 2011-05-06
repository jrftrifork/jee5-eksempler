package com.trifork.livret;

import org.apache.log4j.Logger;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;

@Stateless
public class LivretServiceBean implements LivretService {
    private static final Logger logger = Logger.getLogger(LivretServiceBean.class);
    @PersistenceContext(unitName="livret")
    EntityManager em;
    private SessionContext ctx;

    @RolesAllowed("gourmet")
    public Livret createLivret(String navn) {
        Livret afd = new Livret();
        afd.setNavn(navn);

        em.persist(afd);
        return afd;
    }

    public LivretServiceBean() {
        logger.debug("LivretServiceBean er i live");
    }

    @Resource
    public void setSessionContext(SessionContext ctx) {
        this.ctx = ctx;
        logger.debug("LivretServiceBean fik session context");
    }

    @RolesAllowed("kok")
    public List<String> listLivretter() {
        return Arrays.asList("Boller i karry", "Paella", "Bøf med løg");
    }
}
