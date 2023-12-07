/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Rental_iPhone;

/**
 *
 * @author Asus
 */
public class CLI_Rental_iPhone {
    public static void main(String[] args) {
        //membuat object baru dengan nama "iP" dari class Rental_iPhone
        Rental_iPhone iP = new Rental_iPhone();
 
 //menginputkan data
 iP.dataNama("Yosua Liandra Kybernan");
 iP.dataTlp("2218088");
 iP.dataTgl("20");
 iP.dataBulan("Oktober");
 iP.dataTahun("2023");
 iP.dataJam("18.00 WIB");
 iP.dataDurasi(2);
 iP.dataJenisiPhone("Lengkap");
 if (iP.cetakJenisiPhone() == "Biasa"){
 iP.dataHarga(600000*iP.cetakDurasi());
 }
 else{
 iP.dataHarga(700000*iP.cetakDurasi());
 }

 //output program
 System.out.println("===========RENTAL IPHONE MALANG============");
 System.out.println("Nama Pemesan  : "+ iP.cetakNama());
 System.out.println("Telepon       : "+ iP.cetakTlp());
 System.out.println("Tanggal/Waktu : "+iP.cetakTgl()+" "+ iP.cetakBulan()+" "+ iP.cetakTahun()+ " / "+ iP.cetakJam());
 System.out.println("Durasi Sewa   : "+ iP.cetakDurasi()+ " Hari");
 System.out.println("Total Harga   : Rp."+iP.cetakHarga());
 }
}

  
    

