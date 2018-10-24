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
public class Student extends Osoba {

    private int cislo;

    public Student(int cislo, String jmeno, String prijmeni) {
        super(jmeno, prijmeni);
        this.cislo = cislo;
    }

    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    public int getCislo() {
        return this.cislo;
    }
}
