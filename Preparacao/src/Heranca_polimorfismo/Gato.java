
package Heranca_polimorfismo;

/**
 *
 * @author steli
 */
public class Gato extends Animal{

    @Override
    public void fazerBarrulho() {
        super.fazerBarrulho(); 
    }

    @Override
    void locomover() {
        System.out.println("Flexivel");
    }
    
}
