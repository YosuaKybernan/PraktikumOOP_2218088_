/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumBAB4.Enkapsulasi;

/**
 *
 * @author Asus
 */
public class HitungLimas {
    private double LuasAlas;
 public double tinggi;
 double volume;
 public double getLuasAlas() {
 return LuasAlas;
 }
 public void setLuasAlas(double LuasAlas) {
 this.LuasAlas = LuasAlas;
 }
 double volumeLimas() {
 volume = ( getLuasAlas() * tinggi ) / 3;
 return volume;
 }
}
