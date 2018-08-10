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

        if (teller == maxCursisten) throw new IllegalArgumentException("Maximum aantal cursisten bereikt.");     //   0     1      -1


        cursisten[teller] = naam;

        teller++;
        }


    public int getAantalCursisten() {
        return teller;
    }

    public String getCursist(int cursist) {

        return cursisten[cursist];
    }

    public void verwijderCursist(String namen) {

        cursisten[teller] = "";
    }
}

