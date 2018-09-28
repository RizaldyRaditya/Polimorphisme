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
public class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
        int Uang =  peg.Gaji();
        if(peg instanceof Direktur)
            Uang += ((Direktur)peg).Tunjangan();
        if(peg instanceof Staf)
            Uang += ((Staf)peg).Bonus();
        return  Uang;
    }
    public static void main(String[] args) {
        PembayaranGaji PG = new PembayaranGaji();
        Staf all = new Staf();
        Direktur Tony = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk Staf = "+ PG.hitungGaji(all));
        System.out.println("Gaji yang dibayarkan kepada Direktur = " + PG.hitungGaji(Tony));
    }
}
