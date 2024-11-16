package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] Guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome e premi invio...");
        String yourName = input.nextLine();
        input.close();

        boolean isInvited = false;
        for(int i = 0; i < Guests.length; i++){
            if(Guests[i].equalsIgnoreCase(yourName)){
                isInvited = true;
            };
        };

        if (isInvited) {
            System.out.println(yourName + " Benvenuto/a alla festa!");
        } else{
            System.out.println("Mi dispiace il tuo nome non è in lista, non puoi entrare.");
        } 
    }
}
