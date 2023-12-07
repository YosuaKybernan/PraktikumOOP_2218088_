/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Pembayaran;

/**
 *
 * @author Asus
 */
public class main_pembayaran {
    public static void main(String[] args){
//        upcasting objek dari kelas turunan diubah menjadi objek dari kelas induk
    Pembayaran payment;
    payment = new P0001();
//    tampilan output dari upcasting
    payment.tampilkanMember();
    
//    buat object tiap pembayaran
    Cash cash = new Cash();
    Kredit kredit = new Kredit();
    Emoney emoney = new Emoney();
    //owncasting : objek dari kelas induk diubah kembali menjadi objek dari kelas turunan
    //cek apakah P0001 merupakan turunan dari payment.
    if (payment instanceof P0001) {
        P0001 p0001 = (P0001) payment; //Downcasting dengan menggunakan (P0001)
        
        // Mengakses metode yang hanya ada di kelas P0001
        System.out.println("Jenis Member: " + p0001.member(p0001));
        System.out.println("Total Pembelian: " + p0001.hitPembayaran(500000));
        System.out.println("Sisa saldo: " + p0001.potSaldo());
        p0001.bayar = 60000;
        p0001.jenisPembayaran(cash);
        }   
    }
}
