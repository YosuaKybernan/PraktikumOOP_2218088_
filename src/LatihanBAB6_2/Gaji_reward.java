/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanBAB6_2;

/**
 *
 * @author Asus
 */
public class Gaji_reward extends Gaji_abs_Reward{
    
    double waktu, menit, tunj_anak, gapok, tunj_bonus, anak;
    
    @Override
    public double tunjanganAnak() {
        if(anak == 1){
            tunj_anak = 0.10 * gapok ;
        }
        else if (anak > 1 ){
            tunj_anak = 0.20 * gapok ;
        }
        return tunj_anak;
    }
    @Override
    public double lembur() {
        waktu = (menit/60);
        return (waktu*25000);
    }
}