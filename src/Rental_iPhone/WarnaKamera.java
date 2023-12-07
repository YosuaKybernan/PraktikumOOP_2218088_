/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental_iPhone;

/**
 *
 * @author Asus
 */
public class WarnaKamera extends Ipad {
     //    atribut jenis protected
    protected String warna, kamera,durasi;
    
//    construction
    public WarnaKamera (){
    this.warna = warna;
    this.kamera = "48";
    }
        
//    method
    void dataWarna(String Warna){
    this.warna= Warna;
    }
    void dataKamera(String Kamera){
    this.kamera = Kamera;
    }
    String cetakwarna(){
    return warna;
    }
    String cetakkamera(){
    return kamera;
    }
    
    
    //method dari class Rental_iPhone
    void dataJenisIpad(String JenisIpad){
    this.JenisIpad = JenisIpad;
    }
    void datainternal(String internal){
    this.internal = internal;
    } 
void dataHargaIpad (int HargaIpad){
 this.hargaIpad = HargaIpad;
 }
 void dataPro(int Pro){
 this.Pro = Pro;
 }
 void dataAir(int Air){
 this.Air = Air;
 }
 int cetakPro(){
 return Pro;
 }
 int cetakAir(){
 return Air;
 }
 int cetakHargaIpad(){
 return hargaIpad;
 }
 String cetakJenisIpad(){
 return JenisIpad;
 }
 void dataNama(String Nama){
 this.nama = Nama;
 }
 void dataTlp(String Tlp){
 this.tlp = Tlp;
 }
 void dataTgl(String Tgl){
 this.tgl = Tgl;
 }
 void dataBulan(String Bulan){
 this.bulan = Bulan;
 }
 void dataTahun(String Tahun){
 this.tahun = Tahun;
 }
 void dataJam (String Jam){
 this.jam = Jam;
 }
 void dataDurasi(String Durasi){
 this.durasi = Durasi;
 }
// void dataHarga (int Harga){
// this.harga = Harga;
// }
//  void dataJenisiPhone (String JenisiPhone){
// this.JenisiPhone = JenisiPhone;
// } 
//  String cetakJenisiPhone(){
// return JenisiPhone;
// }
 void dataBiasa(int Biasa){
 this.biasa = Biasa;
 }
 void dataLengkap(int Lengkap){
 this.lengkap = Lengkap;
 }
 int cetakBiasa(){
 return biasa;
 }
 int cetakLengkap(){
 return lengkap;
 }
// int cetakHarga(){
// return harga;
// }
 String cetakNama(){
 return nama;
 }
 String cetakTlp(){
 return tlp;
 }
 String cetakTgl(){
 return tgl;
 }
 String cetakBulan(){
 return bulan;
 }
 String cetakTahun(){
 return tahun;
 }
 String cetakdurasi(){
 return durasi;
 }
 String cetakJam(){
 return jam;
 }
}
