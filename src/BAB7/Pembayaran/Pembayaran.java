/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Pembayaran;

/**
 *
 * @author Asus
 */
public abstract class Pembayaran {
    abstract double hitPembayaran (double bayar);
    abstract double cekKode (String input);
    abstract void tampilkanMember();

    String member(G0001 member) {
        return "Gold";
    }
    
    String member(P0001 member) {
        return "Platinum";
    }
    
    String member(S0001 member) {
        return "Silver";
    }
}
