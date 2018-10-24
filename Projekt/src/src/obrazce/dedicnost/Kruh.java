/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrazce.dedicnost;

/**
 *
 * @author trejbja2
 */
public class Kruh extends Obrazec {
   private double polomer;
   
   public Kruh(double polomer) {
       this.polomer = polomer;
   }
   
   @Override
   public void spoctiObsah() {
       this.obsah = Math.PI*polomer*polomer;
   }
   
   @Override
   public void spoctiObvod() {
       this.obvod = 2*Math.PI*polomer;
   }
    
   
}
