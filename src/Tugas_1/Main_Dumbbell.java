/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas_1;

/**
 *
 * @author Asus
 */
public class Main_Dumbbell {

    /**
     * @param args the command line arguments   
     */
    public static void main(String[] args) {
        // membuat objek
    Dumbbell Dumbbell = new Dumbbell ();
    Dumbbell.setjudul();
    Dumbbell.setbawah();
    Dumbbell.setgaris();
    System.out.println("Jumlah beban    : " + Dumbbell.jumlahbeban + "Kg");
    System.out.println("Jumlah dumbbell : "+ Dumbbell.jumlahdumbbell);
    System.out.println("Cara Angkat     : " + Dumbbell.caraangkat);
    System.out.println("Posisi Badan    : " + Dumbbell.posisibadan);
    }
}
    
