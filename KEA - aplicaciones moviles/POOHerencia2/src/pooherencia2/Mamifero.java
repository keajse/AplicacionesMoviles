
package pooherencia2;


public class Mamifero extends Animal{
    //Atributos
    
    private boolean sangreCaliente;
    
    //

    public Mamifero() {
    }

    public Mamifero(boolean sangreCaliente, float peso) {
        super(peso);
        this.sangreCaliente = sangreCaliente;
    }

    public boolean isSangreCaliente() {
        return sangreCaliente;
    }

    public void setSangreCaliente(boolean sangreCaliente) {
        this.sangreCaliente = sangreCaliente;
    }
    
    
    
    public void parir()
    {
        
    }
    
    public void amamantar()
    {
        
    }
}
