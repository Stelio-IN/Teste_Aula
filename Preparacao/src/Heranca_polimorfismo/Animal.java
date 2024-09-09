
package Heranca_polimorfismo;

public abstract class Animal {
    int nome;
    int ano_nascimento;
/*
    public Animal(int nome) {
        this.nome = nome;
    }

    public Animal(int nome, int ano_nascimento) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
    }
    
    */
    
    public void fazerBarrulho(){
        System.out.println("Superior");       
    }
    
    double quandrado(int x ){
     return x*x;   
    }
    
     int quandrado(int x, int y  ){
     return x*x;   
    }
     
     abstract void locomover(); 

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     
}
