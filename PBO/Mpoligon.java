//File : Mpoligon.java 14/03/2024
// Penulis : Johanes D.K
// Deskripsi : driver class untuk poligon dan persegi panjang

package org.main;

import org.bangundatar, *;

public class Mpoligon{
    public static void main(Strin[] args){
        persegipanjang persegi = new persegipanjang(10,10,4);
        persegi.printInfo();
        System.out.println("luas persegi panjang: " +persegi.hitungluas());
    }
}