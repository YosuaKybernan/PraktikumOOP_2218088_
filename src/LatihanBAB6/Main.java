/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanBAB6;

/**
 *
 * @author Asus
 */
public class Main {
    
    public static void main(String[] args){
        System.out.println("Nyalakan Mesin Mobil");
        Mobil H = new Mobil();
        System.out.println("----------------");
        System.out.println ("Nyala Mesin : "+H.nyalakanmesin());
        Pesawat A = new Pesawat();
        System.out.println("\nNyalakan Mesin Pesawat");
        System.out.println("----------------");
        System.out.println ("Nyala Mesin : "+A.nyalakanmesin());
    }
}
