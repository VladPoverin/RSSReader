/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vozidlo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author trejbja2
 */
public class Auto extends Vozidlo {
    
    private Motor motor;
    private List<Pasazer> pasazeri;
    private String spz;
    
    public Auto() {
        pasazeri = new LinkedList<>();
    }
    
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public Motor getMotor() {
        return this.motor;
    }
    
    public void pridejPasazer(Pasazer pasazer) {
        pasazeri.add(pasazer);
    }
    
}
