/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrazce.rozhrani;

import java.util.List;

/**
 *
 * @author trejbja2
 */
public class KruhInt implements ObrazecInt  {
    
    double polomer;
    double obsah;
    double obvod;
    
    public KruhInt(double polomer) {
        this.polomer = polomer;
    }

    @Override
    public void spoctiObsah() {
        obsah = polomer*polomer*Math.PI;
    }

    @Override
    public void spoctiObvod() {
        obvod = 2*Math.PI*polomer;
    }

    @Override
    public double getObsah() {
        return obsah;
    }

    @Override
    public double getObvod() {
        return obvod;
    }
    
    
}
