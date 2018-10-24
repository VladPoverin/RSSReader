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
public class CtverecInt implements ObrazecInt{
    private double a;
    private double obsah;
    private double obvod;
    
    public CtverecInt(double a) {
        this.a = a;
    }

    @Override
    public void spoctiObsah() {
        this.obsah = a*a;
    }

    @Override
    public void spoctiObvod() {
        this.obvod = 4*a;
    }

    @Override
    public double getObsah() {
        return this.obsah;
    }

    @Override
    public double getObvod() {
        return obvod;
    }
    
}
