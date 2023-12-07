/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bab1;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        membuat objek
    Kendaraan mobil = new Kendaraan ();
    mobil.nama = "vios";
    mobil.warna = "silver";
    mobil.merk = "Toyota";
    mobil.speed = 200;
    System.out.println("Nama Kendaraan : " + mobil.nama);
    System.out.println("Warna Kendaraan : "+mobil.warna);
    System.out.println("Merek Kendaraan : " + mobil.merk);
    System.out.println("Kecepatan Maximal : " + mobil.speed + "km/jam \n");
    System.out.println("Jumlah Roda : " +mobil.jmlRoda (4) + "\n");
    System.out.println( "Cara kendaraan bergerak : "); 
    System.out.print("Saat maju : ");
    mobil.kendaraanMaju();
    System.out.print( "Saat mundur: ");
    mobil.kendaraanMundur();
    System.out.print("Saat berhenti : "+ mobil.nama);
    mobil.kendaraanBerhenti();
    
    }
    
}
