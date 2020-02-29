
package pooherencia2;


public class POOHerencia2 {

 
    public static void main(String[] args) {
        
        /*Perro animal = new Perro();
        
        animal.setColorPelo("blanco");
        animal.setPeso(20);
        animal.setSangreCaliente(true);*/
        
        
        Perro animal = new Perro("blanco", true, 20);
        
        System.out.println("El perro es de color: "+ animal.getColorPelo() +" y pesa: "+ animal.getPeso());
        
        
        Mamifero mam = new Mamifero();
        
        mam.setPeso(35);
        mam.setSangreCaliente(true);
        
       if(mam.isSangreCaliente())
       {
           System.out.println("Animal de sangre caliente");
       }
  
    }
    
}
