/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca_polimorfismo;

/**
 *
 * @author steli
 */
public class Soma implements Calculadora{

    @Override
    public void calcular(int a, int b) {
        System.out.println("A soma de: "+ a + " + " + b +" = " + (a+b));
    }
    
    
}
