package com.company;

public class Cursus {

    private String[] cursisten;

    private int teller = 0;

    private int maxCursisten;


    public Cursus(int maxCursisten) {

        this.maxCursisten = maxCursisten;

        cursisten = new String[maxCursisten];
    }

    public void addCursist(String naam) {

        if (teller == cursisten.length) throw new IllegalArgumentException("Maximum aantal cursisten bereikt.");


        cursisten[teller] = naam;

        teller++;
        }


    public int getAantalCursisten() {
        return teller;
    }

    public String getCursist(int cursist) {

        if (cursist >= cursisten.length) throw new IllegalArgumentException("Cursist niet gevonden.");

        return cursisten[cursist];
    }

    public void verwijderCursist(String namen) {

        cursisten[teller] = "";
    }

/*
    private int indexOf(String naam) {
        int index

    }
*/

}

