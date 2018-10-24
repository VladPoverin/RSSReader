/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cv2;

/**
 *
 * @author povervl1
 */
public class Auto extends Vozidlo {

    private Motor motor;
    private Pasazer[] pasazeri;
    private String spz;

    public Auto(Motor motor, Pasazer[] pasazeri, String spz, int pocetKol) {
        super(pocetKol);
        this.motor = motor;
        this.pasazeri = pasazeri;
        this.spz = spz;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setPasazer(Pasazer[] pasazeri) {
        this.pasazeri = pasazeri;
    }

    public Pasazer[] getPasazer() {
        return this.pasazeri;
    }

    public void setSpz(String spz) {
        this.spz = spz;

    }

    public String getSpz() {
        return this.spz;
    }

}
