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
public class Ctverec {

    double a;

    public Ctverec(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double spoctiObsah(){
        return a*a;
    }
    public double spoctiObvod(){
        return 4*a;
    }
}
