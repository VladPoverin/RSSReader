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
public class Osoba {

    private String jmeno;
    private String prijmeni;

    public Osoba(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return this.jmeno;
    }

    public void setPrijemni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getPrijmeni() {
        return this.prijmeni;
    }
}
