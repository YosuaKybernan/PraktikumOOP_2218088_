/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8_Implements;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[]args){
//        contoh penggunaan dengan objek mobil
    Mobil mobil = new Mobil("Toyota");
    mobil.berjalan();
    mobil.carabegerak();
    mobil.kecepatanMax();
        System.err.println("==========================");
        Pesawat pesawat = new Pesawat("Lion Air");
       pesawat.carabegerak();
       pesawat.kecepatanMax();
       pesawat.berjalan();
       pesawat.terbang();
    }
}
