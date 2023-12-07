/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumBAB4;

/**
 *
 * @author Asus
 */
public class pembayaranGaji {
    private String nomorRekening;
    private String input;
    private double saldo;
    
    public pembayaranGaji(){
        this.nomorRekening = "G123456";
        this.saldo = 1000000;
    }
    
    public String getNomorRekening(){
        return nomorRekening;
    }
    public void setNomorRekening(String nomorRekening){
        this.nomorRekening = nomorRekening;
    }
    public double getSaldo(double saldo){
        return saldo;
    }
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    public String getInput(){
        return input;
    }
    public void setInput (String input){
        this.input = input;
    }
    public double cekSaldo() {
        if (getNomorRekening().equals(getInput())){
            return getSaldo(saldo);
        }
        else {
            return 0;
        }
    }
}
