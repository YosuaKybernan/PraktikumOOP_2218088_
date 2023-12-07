/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental_iPhone;

/**
 *
 * @author Asus
 */
public class Ipad extends Rental_iPhone {
//    atribut
    int Pro, Air,hargaIpad;
//    atribut jenis protected
    protected String JenisIpad,internal;
//    construction
    public Ipad (){
    this.JenisIpad = "Ipad 12 Pro";
    this.internal = "256 GB";
}
    
//    method
    void dataJenisIpad(String JenisIpad){
    this.JenisIpad = JenisIpad;
    }
    void dataInternal(String Internal){
    this.internal = Internal;
    }
    
 //method dari class Rental_iPhone
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
 void dataDurasi(int Durasi){
 this.durasi = Durasi;
 }
// tidak lagi dipake karena khusus iPhone
// void dataHarga (int Harga){
// this.harga = Harga;
// }
//  void dataJenisiPhone (String JenisiPhone){
// this.JenisiPhone = JenisiPhone;
// } 
 // String cetakJenisiPhone(){
// return JenisiPhone;
// }
 void dataHargaIpad (int HargaIpad){
 this.hargaIpad = HargaIpad;
 }
 void dataBiasa(int Biasa){
 this.biasa = Biasa;
 }
 void dataLengkap(int Lengkap){
 this.lengkap = Lengkap;
 }
 void dataPro(int Pro){
 this.Pro = Pro;
 }
 void dataAir(int Air){
 this.Air = Air;
 }
 int cetakBiasa(){
 return biasa;
 }
 int cetakLengkap(){
 return lengkap;
 }
 int cetakPro(){
 return Pro;
 }
 int cetakAir(){
 return Air;
 }
 // tidak lagi dipake karena khusus iPhone
// int cetakHarga(){
// return harga;
// }
 int cetakHargaIpad(){
 return hargaIpad;
 }
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
 String cetakJenisIpad(){
 return JenisIpad;
 }
 String cetakInternal(){
 return internal;
 }
 int cetakDurasi(){
 return durasi;
 }
 String cetakJam(){
 return jam;
 }
}
