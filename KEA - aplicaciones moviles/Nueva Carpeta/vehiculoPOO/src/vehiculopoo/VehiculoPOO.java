
package vehiculopoo;


public class VehiculoPOO {

   
    public static void main(String[] args) {
        // Instanciar la clase vehículo, es decir, crear un objeto basado en
        //un clase.
        
        //Nombre de la clase + nombre del objeto instancia = new nombre del 
        //método constructor
        
        /*vehiculo vehiculo1 = new vehiculo();
        //Al utilizar un metodo sin parametros, debo realizar el siguiente procedimiento
        
        vehiculo1.setPlaca("GIU889");
        vehiculo1.setMarca("Chevrolet Alto");
        vehiculo1.setValor(32000000);
        vehiculo1.setEstado(true);*/
        
        vehiculo vehiculo1 = new vehiculo("GIU889", "Chevrolet Alto", 28000000, false);
        
        System.out.println(vehiculo1.getPlaca());
        
        //String mplaca = vehiculo1.getPlaca(); Otra opción
        //System.out.printIn(mplaca);
        
        System.out.println(vehiculo1.getMarca());
        System.out.println(vehiculo1.getValor());
        
        if (!vehiculo1.getEstado())
        {
            System.out.println("La placa "+vehiculo1.getPlaca()+ " está disponible");
        }
        else
        {
            System.out.println("La placa "+ vehiculo1.getPlaca()+ " no está disponible");
        }
                
               
        //Una vez instanciada la clase, se trabaja con el objeto,
        //visualizar vehiculo1
        
        System.out.println(vehiculo1.Matricular(vehiculo1.getPlaca()));
        vehiculo1.InscribirRunt(vehiculo1.getPlaca());
        
        System.out.println("El valor del iva es: " +vehiculo1.CalcularIva(vehiculo1.getPlaca(), vehiculo1.getValor()));
        
        int xvaloriva = vehiculo1.CalcularIva(vehiculo1.getPlaca(), vehiculo1.getValor());
        
        if ( xvaloriva > 0)
        {
            System.out.println("Tiene un bono de "+ xvaloriva);
        }
    }
    
    
    
}
