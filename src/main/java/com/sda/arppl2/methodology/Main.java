package com.sda.arppl2.methodology;

public class Main {
    public static void main(String[] args) {
        System.out.println("zadanie 1 zrobione!");
        Bear[] bear = new Bear[4];
        for (int i = 0; i < 4; i++) {
            bear[i] = new Bear();
        }
        bear[0].imie = "Marian";
        bear[1].imie = "Olek";
        bear[2].imie = "Filipek";
        bear[3].imie = "Teddy";

        bear[0].wiek = 32;
        bear[1].wiek = 2;
        bear[2].wiek = 10;
        bear[3].wiek = 13;


    }
}
