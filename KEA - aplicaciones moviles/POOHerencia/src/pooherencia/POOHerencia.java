
package pooherencia;

//El nombre de las clases por lo general va en singular.


public class POOHerencia {

    public static void main(String[] args) {
        //Instanciar la clase estudiante
        //El primero es la clase, y el que va despues de new es un método de la clase mencionada
        //Lo que esta en negrita es propio de la clase
        
        
       /*Opción 1 
        
        Estudiante estud1 = new Estudiante();
        
        estud1.setIdent("45");
        estud1.setNombre("Juanita Pérez");
        estud1.setTelmovil("3205842620");
        estud1.setEstado(true);
        estud1.setTrabaja(true);*/
        
        
        /*Opción 2, para esta forma se debe tener en cuenta la forma como se creó el metodo
        y respetar el orden*/
        
        
        Estudiante estud1 = new Estudiante(false,"45","Juanita Pérez", "3205842620", true);
        
        System.out.println("Identificación: "+ estud1.getIdent());
        
       // System.out.println("Trabaja: " + estud1.isTrabaja());
        
        if (estud1.isTrabaja())
        {
            System.out.println("El estudiante, trabaja");
        }
        else
        {
            System.out.println("El estudiante NO trabaja");
        }
        
        estud1.Contratar(estud1.getIdent());
        
       System.out.println(estud1.Retirar(estud1.getIdent()));
       
       if (estud1.Retirar(estud1.getIdent()))
       {
           System.out.println("La persona se puede retirar");
       }
       else
       {
           System.out.println("La persona se puede retirar");
       }

    }
    
}
