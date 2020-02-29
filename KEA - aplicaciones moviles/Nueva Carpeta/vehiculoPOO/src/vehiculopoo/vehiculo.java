
package vehiculopoo;
public class vehiculo {
   //Definición de atributos, por defecto si no se escribe los tomará como public
    //Se recomienda a los atributos colocarlos privados, para que no se pueda
    //hacer referencia directa a ellos.
    
    
    private String placa; //atributo en color verde
    private String marca;
    private int valor;
    private boolean estado;
    
    //Definición de (los) método(s) - Método(s) constructor(es)
    //El método constructor debe tener el mismo nombre de la clase
    
    public vehiculo()
    {
        
    }
    
    //Para poder tener varias cantidades de métodos con el mismo nombre
    //es necesario establecer parámetros. - Polimorfismo
    
    public vehiculo(String placa, String marca, int valor, boolean estado)
    {
        //Asignar el contenido de las variables (parámetros) a los atributos
        this.placa = placa;
        this.marca = marca;
        this.valor = valor;
        this.estado = estado;
        
        //Si no hacemos le procedimiento anterior, los atributos
        //quedarían vacíos.      
        
    }
    
    //Definición de los métodos GETs y SETs por cada atributo
    //GET = Función, Devuelve algo. Lleva Return
    //SET = Procedimiento, no devuelve nada (VOID). Deben tener un parametro
    //con el tipo de variable
    
    public String getPlaca()
    {
        //Toda instrucción debe devolver un dato del tipo especificado
        //String, int, boolean... según el atributo.
        
        return this.placa;
    }
    
    public void  setPlaca(String placa)
    {
        this.placa = placa;
    }
    
    
    public String getMarca()
    {
        return this.marca;
    }
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    
    public int getValor()
    {
        return this.valor;
    }
    public void setValor(int valor)
    {
        this.valor = valor;
    }
    
    
    public boolean getEstado()
    {
        return this.estado;
    }
    public void setEstado(boolean estado)
    {
        this.estado = estado;
    }
    
    //Definición de los métodos propios de la clase
    
    public String Matricular(String placa)
    {
        return "El vehículo con placa: "+ placa + " se ha matriculado";
    }
    //El dato a retornar debe ser del tipo que se marca en el método
    
    public void InscribirRunt(String placa)
    {
      System.out.println("El vehículo con placa " + placa +  " se ha inscrito en el RUNT");
    }
    
    //VOID vacío que puede o no devolver
    //System es igual que Console en C#
    
    //Cuando es función la estructura es public "tipo de atributo"
    //Cuando es un procedimiento es public void
    
    public int CalcularIva(String placa, int valor)
    {
        //Variable local, nace y muere en la función en la que se encuentra
        int valorIva;
        if (valor > 30000000)
        {
            valorIva = valor * 19/100;
        }
        else
        {
            valorIva = 0;
        }
        
        return valorIva;
    }
    
}

