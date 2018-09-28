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
public class Rectangle extends Shape {
    private int length;
    private int width;
    
    public Rectangle(String Color, int length, int width){
        super(Color);
        this.length = length;
        this.width = width;
    } 
    public String toString (){
        return "Retangle[length = " + length + ", width = " + width + " , " + super.toString() + " ] ";
    }
    public double getArea(){
        return length * width;
    }
}
