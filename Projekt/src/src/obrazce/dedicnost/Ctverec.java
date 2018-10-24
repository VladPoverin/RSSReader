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
public class Ctverec extends Obrazec {
   private double a;
   private double b;
   
   public Ctverec(double a) {
       this.a = a;
   }
   
   @Override
   public void spoctiObsah() {
       this.obsah = a*b;
   }
   
   @Override
   public void spoctiObvod() {
       this.obvod = 2*(a + b);
   }
}
