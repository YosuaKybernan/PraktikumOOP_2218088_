/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1;

/**
 *
 * @author Asus
 */
public class Kendaraan {
    String nama, warna, merk; //atribut
    int speed;
//method
    int jmlRoda (int jml){
        return jml;
    }

    
    void kendaraanMaju(){
        System.err.println("Berjalan Maju");
    }
    
   void kendaraanMundur(){
       System.err.println("Berjalan Mundur");
   }
   void kendaraanBerhenti (){
       System.err.println("Kendaraan Berhenti");
   }
}

