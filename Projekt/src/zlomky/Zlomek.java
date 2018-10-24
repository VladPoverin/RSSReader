/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zlomky;

/**
 *
 * @author povervl1
 */
public class Zlomek {
    private double citatel;
    private double jmenovatel;
    
public Zlomek (double citatel, double jmenovatel){
    this. citatel = citatel;
    this. jmenovatel = jmenovatel;
}

public double getCitatel (){
    return this. citatel;
}

public double getJmenovatel (){
    return this. jmenovatel;
}    



public void zktrat(double cislo){
   this.citatel = this.citatel / cislo;
   this.jmenovatel = this.jmenovatel / cislo;
}

public double vratHodnotu(){
    return citatel / jmenovatel;

 }
} 