package com.company;

public class Main {

    public static void main(String[] args) {

    // objektu masyvas mokiniai su penkiomis vietomis
        Mokinys[] mokiniai = new Mokinys[5];

    //  I Objektu masyva mokiniai dedami duomenys

        mokiniai[0] = new Mokinys("Simas", "Simaitis", 8,new int[]{9, 8, 10});
        mokiniai[1] = new Mokinys("Stase", "stasyte", 9, {7, 6, 10});
        mokiniai[2] = new Mokinys("Tadas", "Greitas", 8, 8);
        mokiniai[3] = new Mokinys("Paulius", "Paulaitis", 11, 8);
        mokiniai[4] = new Mokinys("Vilma", "Vilmute", 11, 9);

        int pazimiuSuma = 0 ;
        float pazimiuVidurkis = 0;
     // Duomenu paemimas is objektu masyvo mokiniai

        for ( int i = 0; i < mokiniai.length; i++)
        {
            pazimiuSuma +=  mokiniai[i].pazimiai;

            pazimiuVidurkis =(float) pazimiuSuma   / mokiniai.length;

        }

        System.out.println();

    }
}
