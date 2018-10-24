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
public class VyucujiciHod {

    private Ucitel ucitel;
    private Student[] studenti;
    private int delka;

    public VyucujiciHod(int delka, Student[] studenti, Ucitel ucitel) {
        this.ucitel = ucitel;
        this.delka = delka;
        this.studenti = studenti;
    }

    public void setUcitel(Ucitel ucitel) {
        this.ucitel = ucitel;
    }

    public Ucitel getUcitel() {
        return this.ucitel;
    }

    public void setStudent(Student[] studenti) {
        this.studenti = studenti;
    }

    public Student[] getStudent() {
        return this.studenti;
    }

    public void setDelka(int delka) {
        this.delka = delka;
    }

    public int getDelka() {
        return this.delka;
    }

    public void pridejStudenta(Student student) {
      

    }
}
