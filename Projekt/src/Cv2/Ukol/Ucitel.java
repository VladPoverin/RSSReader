/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cv2.Ukol;

/**
 *
 * @author povervl1
 */
public class Ucitel extends Osoba {

    private String pozice;

    public Ucitel(String pozice, String jmeno, String prijmeni) {
        super(jmeno, prijmeni);
        this.pozice = pozice;
    }

    public void setPozice(String pozice) {
        this.pozice = pozice;
    }

    public String getPozice() {
        return this.pozice;
    }

}
