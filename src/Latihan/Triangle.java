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
public class Triangle extends Shape {
    private int base;
    private int height;
    
    public Triangle(String Color, int base, int height){
        super(Color);
        this.base = base;
        this.height = height;
    }
    public String toString (){
        return "Triangle[base = " + base + " , height = " + height + " , " + super.toString() + " ] ";
    }
    public double getArea (){
        return 0.5*base*height;
    }
}
