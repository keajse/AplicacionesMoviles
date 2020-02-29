
package pooherencia;


//Con la palabra extends convierte en una subclase al que la antecede y una super clase al que la precede

public class Estudiante extends Persona{
    
    //Atributos
    
    private boolean trabaja;
    
    //Método constructor

    public Estudiante() {
    }

    //public Estudiante(boolean trabaja) {
   //     this.trabaja = trabaja;
   // }
    
    //con la palabra super que aparece sabe que lo está tomando de la super clase

    public Estudiante(boolean trabaja, String ident, String nombre, String telmovil, boolean estado) {
        super(ident, nombre, telmovil, estado);
        this.trabaja = trabaja;
    }
    
    
    //Metodo Get y set

    public boolean isTrabaja() {
        return trabaja;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }
    
    public void Matricular(String ident)
    {
        System.out.println("El estudiante con identificación " + ident + " ha sido matriculado correctamente");
    }
    
    public String CancelarMatricula(String ident, String fecha)
    {
        return "El estudiante con identificación "+ ident + " ha cancelado su matricula";
    }
    
    
    
}
