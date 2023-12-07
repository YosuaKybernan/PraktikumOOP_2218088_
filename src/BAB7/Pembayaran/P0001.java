/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Pembayaran;

/**
 *
 * @author Asus
 */
public class P0001 extends Pembayaran{
    public String InputPinKredit;
        public String nama, alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;
    public P0001(){
        this.nama = "Yosua Kybernan";
        this.kode = "P0001";
        this.saldo = 3000000;
        this.alamat = "Malang, Jl. Atletik";
    }
    public double hasil() {
        return diskon;
    }
    @Override
    double cekKode(String input){
        if (input.compareTo(kode)== 0){
            diskon = 0.3;
        }else {
            diskon = 0;
        }
        return diskon;
    }
    @Override
    double hitPembayaran(double bayar){
        diskon = bayar * diskon;
        total = bayar - diskon;
        return total;
    }
    double potSaldo() {
        return this.saldo - total;
    }
    @Override
    void tampilkanMember(){
        System.out.println("Member S0001 dengan diskon 30%");
    }
    void jenisPembayaran(Cash cash) {
 if (bayar >= total) {
 System.out.println("Kembalian : " + 
cash.kembalian(total, bayar));
 } else if (bayar <= total) {
 System.out.println("uang anda kurang");
 } else {
 System.out.println("Pembayaran Berhasil");
 }
 }
 
 void jenisPembayaran(Emoney emoney) {
 emoney.scanQris();
 }
 
 void jenisPembayaran(Kredit kredit) {
 kredit.cekKartuKredit(kode, InputPinKredit);
 }
}
