/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumBAB3;

/**
 *
 * @author Asus
 */
public class Tabung extends Lingkaran { 

    int t;
    double volume, luasPermukaan;
    
    public Tabung() {
//    S
    t = 20;
    }
    
void Keterangan () {
    Deskripsi(); 
    System.out.println( "mengitung Volume Tabung");
    }

double HitvolumeTabung() {
// phi x r2 x t.
volume = ((phi* r * r) * t); 
return volume;
}
}