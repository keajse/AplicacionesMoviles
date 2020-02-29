
package pooherencia2;

public class Perro extends Mamifero {
    
    private String colorPelo;

    public Perro() {
    }

    public Perro(String colorPelo, boolean sangreCaliente, float peso) {
        super(sangreCaliente, peso);
        this.colorPelo = colorPelo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
    
    public void ladrar()
    {
        
    }
    
}
