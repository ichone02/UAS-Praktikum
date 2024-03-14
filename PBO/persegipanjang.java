// File : persegipanjang.java 14/03/2024
// Penulis : Johanes D.K
// Deskripsi : representasi dari objek persegi panjang, turunan kelas poligon

package org.bangundatar;

import org.poligon.Poligon;

public class persegipanjang extends Poligon{
    private double panjang,lebar;

    public persegipanjang(double panjang, double lebar, int jumlahsisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahsisi ; jumlahsisi;
    }
    public double hitungluas(){
        return panjang * lebar;
    }
    public void printInfo(){
        System.out.println("bangun persegi panjang bersisi" +this,getjumlahsisi());
    }
}