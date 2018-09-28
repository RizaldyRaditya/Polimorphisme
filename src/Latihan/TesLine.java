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
public class TesLine {
    public static void main(String[] args) {
     Line LN = new Line(1,2,3,4); 
        System.out.println(LN.getLength());
        System.out.println(LN.isGreater(LN, LN));
        System.out.println(LN.isLess(LN, LN));
        System.out.println(LN.isEqual(LN, LN));
    }
}
