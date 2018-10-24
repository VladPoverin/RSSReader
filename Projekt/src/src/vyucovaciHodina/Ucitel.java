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
public class Ucitel extends Osoba {
    
    private int plat;
    
    public Ucitel(int plat) {
        this.plat = plat;
    }
    
    public void setPlat(int plat) {
        this.plat = plat;
    }
    
    public int getPlat() {
        return this.plat;   
    }
    
}
