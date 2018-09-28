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
public class Staf extends Pegawai {
    private static final int GajiStaf = 50000;
    private static final int BonusStaf = 10000;
    
    public int Gaji(){
        return GajiStaf;
    }
    public int Bonus(){
        return BonusStaf;
    }
}
