/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Pembayaran;

/**
 *
 * @author Asus
 */
public class Cash implements dapatKembalian{
    @Override
    public double kembalian (double total, double jmlUang){
        double jmlKembalian;
        jmlKembalian = jmlUang - total;
        return jmlKembalian;
    }
    
}
