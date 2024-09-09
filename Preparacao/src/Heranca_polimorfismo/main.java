/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca_polimorfismo;

public class main {

    public static void main(String[] args) {
        /*   Animal an = new Animal();
        System.out.println("Animal");
        an.fazerBarrulho();*/
 
        System.out.println("Gato");
        Gato gt = new Gato();
       // gt.fazerBarrulho();
        gt.locomover();
        
        System.out.println("Cao");
        System.out.println(gt instanceof Animal);
        
        Cao ca = new Cao();
        ca.fazerBarrulho();
        ca.locomover();
    
 /*
        Animal mt = new Cao();
        mt.fazerBarrulho();
         */
        //----------------------------------------------
        /*
        System.out.println("Soma");
        Soma soma = new Soma();
        soma.calcular(5, 2);
        System.out.println("Produto -- 2");
        Produto prd = new Produto();
        prd.calcular(5, 5);
*/
    }

}
