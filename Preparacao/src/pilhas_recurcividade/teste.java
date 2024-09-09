/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhas_recurcividade;

import Heranca_polimorfismo.Cao;
import java.util.Stack;

/**
 *
 * @author steli
 */
public class teste {

    public static void main(String[] args) {
        
        //pilha 
        Stack<Integer> pilha = new Stack<>();
        //Metd add
        pilha.push(10);
        pilha.push(5);
        pilha.push(4);
        System.out.println(pilha.toString());
        // Mostra e nao remove
        System.out.println(pilha.peek());
        //Mostra e apaga
        System.out.println(pilha.pop());
        System.out.println(pilha.toString());
        
        /*
        int dnumero = 12345;
        
        String nome = String.valueOf(dnumero);
           
        Stack<Character> inverso = new Stack<>();
        
        for (int i = 0; i < nome.length(); i++) {
            inverso.add(nome.charAt(i));
            
        }
        
        while(!inverso.isEmpty()){
            System.out.print(inverso.pop());
        }
        System.out.println("");
        //
        */
        funcao fnc = new funcao();
        System.out.println(fnc.factorial(5));
        System.out.println(fnc.somaprog(5,1,2));
        Cao[] adssa = new Cao[5];
       
        
    }
}
