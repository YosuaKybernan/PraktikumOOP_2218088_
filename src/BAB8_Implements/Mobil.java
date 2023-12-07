/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8_Implements;

/**
 *
 * @author Asus
 */
public class Mobil extends kendaraan implements Berjalan {
    
    public Mobil (String merek){
        super(merek);
    }
    
    @Override
    void carabegerak(){
        System.out.println("Bergerak maju melalui roda yang bersentuhhan langsung dengan permukaan tanah.");
    }
    
     @Override
    public void kecepatanMax(){
        System.out.println("180km/h");
    }
    
    @Override
    public void berjalan(){
        System.out.println("Mobil " + getMerek() + "sedang berjalan di jalan raya");
    }
}
