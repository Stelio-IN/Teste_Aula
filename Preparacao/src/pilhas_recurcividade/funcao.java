/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilhas_recurcividade;

/**
 *
 * @author steli
 */
public class funcao {
    
    int factorial(int x){
        if(x<0) return -1;
        if(x==1) return 1;        
        return x * factorial(x-1);    
    } 
    
    // progreccao 2n
    double somaprog(int n, int a1, int r){
        if (n==0) return 0;
    //    1 + 3 + 5 + 7+9
        return a1 +  somaprog(n-1, a1+r, r);
    }
}
