/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_1;

/**
 *
 * @author Asus
 */
public class Dumbbell {
    //atribut
    String namaalatgym,caraangkat, posisibadan;
    int jumlahbeban;
    int jumlahdumbbell;
    
    
    //method
    void setjudul ()
    {
        System.err.println("Tugas 1");
    }
    
    void setbawah ()
    {
        System.err.println("Alat Gym Majapahit");
    }
       void setgaris ()
    {
        System.err.println("================================================================");
    }
    
    //konstruktor
    Dumbbell(){
        this.namaalatgym="dumbbell";
        this.jumlahbeban=16;
        this.jumlahdumbbell=2;
        this.caraangkat="tangan lurus kebawah, angkat 45 derajat keatas";
        this.posisibadan="tegak";
    }
   }
