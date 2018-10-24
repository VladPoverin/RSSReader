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
public class Obdelnik {

    double b;
    double a;

    public Obdelnik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public void setA(double a) {
        this. a = a;
    }
    public void setB(double b) {
        this. b = b;
    }
    public double spoctiObsah (){
        return a*b;
    }
    public double spoctiObvod (){
        return 2*(a+b);
    }
}
