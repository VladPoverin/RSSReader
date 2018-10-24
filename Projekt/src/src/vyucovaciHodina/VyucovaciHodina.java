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
public class VyucovaciHodina {

    private Ucitel ucitel;
    private Student[] studenti;
    private int delka;

    public VyucovaciHodina(Ucitel ucitel, Student[] studenti, int delka) {
        this.ucitel = ucitel;
        this.studenti = studenti;
        this.delka = delka;
    }

    public void setUcitel(Ucitel ucitel) {
        this.ucitel = ucitel;
    }

    public void setStudenti(Student[] studenti) {
        this.studenti = studenti;
    }

    public void setDelka(int delka) {
        this.delka = delka;
    }
    
    public Ucitel getUcitel() {
        return this.ucitel;
    }
    
    public Student[] getStudenti() {
        return this.studenti;
    }
    
    public int getDelka() {
        return this.delka;
    }
    
    public void pridejStudenta(Student student, int pozice) {
        this.studenti[pozice] = student;
    }
}
