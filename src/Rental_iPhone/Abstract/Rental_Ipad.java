/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental_iPhone.Abstract;

/**
 *
 * @author Asus
 */
//Membuat class
public class Rental_Ipad extends ClassAbstract{
       //atribut
 String nama, tlp, tgl, bulan, tahun, jam;
 int durasi, biasa, lengkap, Pro, Air,hargaIpad;
 //    atribut jenis protected
    protected String JenisIpad,internal;
//    method
        //Menggunakan Constructor 
    public Rental_Ipad(){
        this.nama = "Yosua Kybernan";
        this.tlp = "2218088"    ;
        }
    //Setter dan Getter
    public String getnama() {
        return nama;
    }
    public String gettlp() {
        return tlp;
    }
    public void setnama(String nama) {
        this.nama = nama;
    }
    public void settlp(String tlp) {
        this.tlp = tlp;
    }

    void dataJenisIpad(String JenisIpad){
    this.JenisIpad = JenisIpad;
    }
    void dataHargaIpad (int HargaIpad){
    this.hargaIpad = HargaIpad;
 }
    //method
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
 int cetakDurasi(){
 return durasi;
 }
 String cetakJam(){
 return jam;
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
// abstrak
 @Override
    public String Status() {
        return "Ipad Tidak Tersedia";
    }
    public String Status(String JenisIpad){
    
    return "Ipad Tersedia";
    }
}
