/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrazce;

/**
 *
 * @author povervl1
 */
public class Kruh {

    private double polomer;

    public Kruh(double polomer) {
        this.polomer = polomer;
    }

    public double getPolomer() {
        return this.polomer;
    }

    public void setPolomer() {
        this.polomer = polomer;
    }
    public double spoctiObsah(){
       return Math.PI*Math.pow(polomer,2);
    }
    public double spoctiObvod(){
        return 2*Math.PI*polomer;
    }

}
