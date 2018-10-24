/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vyucovaciHodina;

/**
 *
 * @author trejbja2
 */
public class Student extends Osoba {

    private String cislo;
    
    public Student(String cislo) {
        this.cislo = cislo;
    }
    
    public void setCislo(String cislo) {
        this.cislo = cislo;
    }
    
    public String getCislo() {
        return this.cislo;
    }
}
