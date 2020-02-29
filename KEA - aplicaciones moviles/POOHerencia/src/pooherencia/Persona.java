
package pooherencia;


public class Persona {
    
    //Atributos
    
    private String ident;
    private String nombre;
    private String telmovil;
    private boolean estado;
    
    //Insertar código Constructor

    public Persona() {
    }

    public Persona(String ident, String nombre, String telmovil, boolean estado) {
        this.ident = ident;
        this.nombre = nombre;
        this.telmovil = telmovil;
        this.estado = estado;
    }
    
    
    //con clic derecho insertar código getters y setters

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelmovil() {
        return telmovil;
    }

    public void setTelmovil(String telmovil) {
        this.telmovil = telmovil;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    //Métodos propios
    
    //Recordar Void es un procedimiento
    
    //En los boleanos sino se niega se está preguntado por el verdadero
    //Para negar anteponer !
    
    public void Contratar(String ident)
    {
        if(this.estado)
        {
            System.out.println("La persona ha sido contratada...");
        }
        else
        {
            System.out.println("La persona No se puede contratar porque no está activa...");
        }
    }
    
    
    public boolean Retirar(String ident)
    {
        boolean retirado= false;
        if(!this.estado)
        {
            retirado = true;
        }
        return retirado;
    }
    
    
}
