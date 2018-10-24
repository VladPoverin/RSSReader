/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import obrazce.dedicnost.*;
import obrazce.rozhrani.CtverecInt;
import obrazce.rozhrani.ObrazecInt;
import obrazce.rozhrani.KruhInt;
import obrazce.rozhrani.ObdelnikInt;

/**
 *
 * @author trejbja2
 */
public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // POLE OBRAZCU O VELIKOSTI DESET KTERE 
        // BUDE UZIVATEL VE FOR CYKLU PLNIT CTVERCI
       ObrazecInt[] pole = new ObrazecInt[10];

        for (int i = 0; i < pole.length; i++) {
            System.out.println("Přidejte čtverec.");
            int a = input.nextInt();
            pole[i] = new CtverecInt(a);

        }

        List<ObrazecInt> obrazce = new ArrayList<>();

        for (int i = 0; i < obrazce.size(); i++) {
            System.out.println("Zadejte stranu A");
            int a = input.nextInt();
            obrazce.add(new CtverecInt(a));
        }

        //PROJÍŽDĚNÍ ARRAYLISTU
        for (int i = 0; i < obrazce.size(); i++) {
            obrazce.get(i).spoctiObsah();
            System.out.println("Obsah obrazce je: " + obrazce.get(i).getObsah());
        }
        //
        System.out.println(obrazce.size());
        obrazce.add(new CtverecInt(5));
        System.out.println(obrazce.size());
        
        
        //ALTERNATIVNÍ ZÁPIS POLE POMOCÍ ARRAYLISTU

        /*List<ObrazecInt> obrazce = new ArrayList<>();
        obrazce.add(new CtverecInt(10));
        obrazce[0] = new CtverecInt(10);[
        
        obrazce.get(0);
        obrazce[0];
        
        obrazce.size();
        obrazce.length;*/
        List<ObrazecInt> obrazce1 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Zadejte typ obrazce.");
            int typObrazce = input.nextInt();
            if (typObrazce == -1) {
                System.out.println("Zadejte poloměr.");
                int polomer = input.nextInt();
                obrazce1.add(new KruhInt(polomer));
            }
            if(typObrazce == 0){
                System.out.println("Zadejte stranu A.");
                int a = input.nextInt();
                obrazce1.add(new CtverecInt(a));
            }
            if(typObrazce == 1){
                System.out.println("Zadejte hodnotu a");
                int a = input.nextInt();
                System.out.println("Zadejte hodnotu b");
                int b = input.nextInt();
                obrazce1.add(new ObdelnikInt(a,b));
            }
            
            if(typObrazce != -1 && typObrazce != 0 && typObrazce != 1){
                System.out.println("Zadal jste špatné hodnoty!");
            }
        }
        
        

    }

}
