/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PraktikumBAB4;

/**
 *
 * @author Asus
 */
public class mainGaji {
    public static void main(String[] args) {
        // TODO code application logic here
        pembayaranGaji gaji = new pembayaranGaji();
        gaji.setInput("G123456");
        System.out.println("Rekening yang anda masukkan : "+gaji.getInput());
        System.out.println("Jumlah saldo anda : "+ gaji.cekSaldo());
    }
    
}
