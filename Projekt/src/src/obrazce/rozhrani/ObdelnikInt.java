/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrazce.rozhrani;

/**
 *
 * @author trejbja2
 */
public class ObdelnikInt implements ObrazecInt {

    private double a, b;
    private double obsah;
    private double obvod;
    
    public ObdelnikInt(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void spoctiObsah() {
        this.obsah = a*b;
    }

    @Override
    public void spoctiObvod() {
        obvod = 2*(a+b);
    }

    @Override
    public double getObsah() {
        return this.obsah;
    }

    @Override
    public double getObvod() {
        return this.obvod;
    }

}
