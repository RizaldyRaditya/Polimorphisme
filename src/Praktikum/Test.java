/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Rudi Erwanto
 */
public class Test {
    public static int tambah(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2 = new Rect(3,6);
        Rect r3 = new Rect(2,3);
        System.out.println("< " +r1.isInside(4,5)+"> is Inside The Union");
        Rect r4 = r1.union(r2);
        System.out.println("r1 union r2 = " +r4.x1+ ", " + r4.x2 + ", " +r4.y1 + ", " +r4.y2);
        Rect r5 = r1.union(r3);
        System.out.println("r1 intersect r3 = " +r5.x2+ ", " + r5.x1 + ", " +r5.y2 + ", " +r5.y1);
    }
}
