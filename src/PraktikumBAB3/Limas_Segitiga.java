/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumBAB3;

/**
 *
 * @author Asus
 */
public class Limas_Segitiga extends Segitiga{
    double tinggiLimas,Vol;
    double volumeLimas(){
        Vol = ((0.333 * Luas())* tinggiLimas);
        return Vol;
    }
}
