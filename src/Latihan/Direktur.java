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
public class Direktur extends Pegawai {
    private static final int GajiDr = 1000000;
    private static final int Tunjangan =  50000;
    
    public int Gaji(){
        return GajiDr;
    }
    public int Tunjangan(){
        return Tunjangan;
    }
}
