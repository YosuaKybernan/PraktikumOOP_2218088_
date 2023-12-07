/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7;

/**
 *
 * @author Asus
 */
public class Driverclass {
        public static void main(String[] args){
//        membuat objek manusia
    Manusia manusia = new Manusia();
    
//    membuat objek apel dan pisang
    Buah apel = new Apel();
    Buah pisang = new Pisang();
    
//    meManggil metode makanBuah()) pada manusia untuk objek Apel dan Pisang
    manusia.makanBuah(apel);
    manusia.makanBuah(pisang);
    }
}
