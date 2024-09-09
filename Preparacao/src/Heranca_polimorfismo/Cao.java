
package Heranca_polimorfismo;

/**
 *
 * @author steli
 */
public class Cao extends Animal{

    @Override
    public void fazerBarrulho() {
        System.out.println("Classe cao");
    }

    @Override
    void locomover() {
        System.out.println("Rapido");
    }
    
}
