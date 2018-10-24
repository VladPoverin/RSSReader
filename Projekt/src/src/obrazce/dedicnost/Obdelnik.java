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
public class Obdelnik extends Obrazec {
   private double a;
   private double b;
   
   public Obdelnik(double a, double b) {
       this.a = a;
       this.b = b;
   }
   
   @Override
   public void spoctiObsah() {
       this.obsah = a*b;
   }
   
   @Override
   public void spoctiObvod() {
       this.obvod = 2*(a + b);
   }
   
   public double getA() {
       return a;
   }
   
   public double getB() {
       return b;
   }
}
