/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Rudi Erwanto
 */
public class Shape {
   private String Color;
  public Shape (String Color){
      this.Color = Color;
   }
   public String toString (){
       return "Shape[Color = " + Color + " ] ";
   }
   public double getArea(){
       System.out.println("Shape unknown! Cannot compute area!");
       return 0;
   }
}
