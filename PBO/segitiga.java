/*
File : segitiga.java 14/03/2024
Penulis : Johanes D.K
Deskripsi :
*/

package org.bangundatar

public class segitiga extends poligon{
    private double alas;
    private double tinggi;

    public segitiga(double alas, double tinggi){
        super(3);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double hitungluas(){
        return 0.5 * alas * tinggi;
    }
    public double hitungkeliling(){
        return -1;
    }
}