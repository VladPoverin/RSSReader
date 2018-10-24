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
public class Vozidlo {

    private int pocetKol;
    private String nejakejText;

    public Vozidlo(int pocetKol) {
        this.pocetKol = pocetKol;

    }

    public void setPocetKol(int pocetKol) {
        this.pocetKol = pocetKol;
    }

    public int getPocetKol() {
        return this.pocetKol;
    }

}
