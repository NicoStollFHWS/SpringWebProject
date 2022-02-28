package com.example.model;


import org.springframework.stereotype.Component;

public class Verfahren {
    String name;
    String kennung;

    public Verfahren(String name, String kennung) {
        this.name = name;
        this.kennung = kennung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKennung() {
        return kennung;
    }

    public void setKennung(String kennung) {
        this.kennung = kennung;
    }
}
