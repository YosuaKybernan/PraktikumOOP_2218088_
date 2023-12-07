/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_BAB9;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ThrowException {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        int jmlKaki;
        System.out.println("Berapa jumlah kaki kerbau? ");
        try{
            System.out.println("Jumlah kaki : ");
            jmlKaki = input.nextInt(); //mendapatkan Input dari user
            if(jmlKaki != 4){
                //Jika jumlah kaki kerbau lebih atau kurang dari 4, maka akan terjadi error
            throw new NullPointerException("Terjadi kesalahan nih!");
        }else{
                System.out.println("Benar Jumlah kaki kerbau 4");
                }
            }catch(NullPointerException e){
                //menampilkan pesan kesalahan 
                e.printStackTrace();
        }
    }
}
