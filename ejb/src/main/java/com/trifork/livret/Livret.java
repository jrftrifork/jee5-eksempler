package com.trifork.livret;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livret {
   private long id;
    private String navn;

    // default constructor
    public Livret() {}

    @Id
    @GeneratedValue
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}

    public String getNavn() {return navn;}
    public void setNavn(String navn) {this.navn = navn;}
}
