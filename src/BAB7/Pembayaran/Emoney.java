/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Pembayaran;

/**
 *
 * @author Asus
 */
public class Emoney implements dapatDiscan{
    @Override 
    public void scanQris(){
        System.out.println("Pembayaran lewat QRcode : 91232356127375");
        System.out.println("Pembayaran Berhasil!!!!!!!!!!!!");       
    }
}
