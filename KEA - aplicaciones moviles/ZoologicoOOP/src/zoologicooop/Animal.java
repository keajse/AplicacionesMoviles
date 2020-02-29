
package zoologicooop;


public class Animal {
    
    private String id;
    private String especie;
    private String nombre;
    private String fechanacim;
    private boolean sexo;
    
    
    public Animal()
    {
        
    }
    
    public Animal(String id, String especie, String nombre, String fechanacim, boolean sexo)
    {
        this.id = id;
        this.especie = especie;
        this.nombre = nombre;
        this.fechanacim = fechanacim;
        this.sexo = sexo;
    }
    
    public String getId()
    {
        return this.id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    
    
    public String getEspecie()
    {
        return this.especie;
    }
    public void setEspecie(String especie)
    {
        this.especie = especie;
    }
    
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    
    public String getFechanacim()
    {
        return this.fechanacim;
    }
    public void setFechanacim(String fechanacim)
    {
        this.fechanacim = fechanacim;
    }
    
    
    public boolean getSexo()
    {
        return this.sexo;
    }
    public void setSexo(boolean sexo)
    {
        this.sexo = sexo;
    }
    
}
