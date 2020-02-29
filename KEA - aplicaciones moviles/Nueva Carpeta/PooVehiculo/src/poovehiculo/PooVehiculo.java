
package poovehiculo;

public class PooVehiculo {

    public static void main(String[] args) {
       System.out.println("Paz y bien");
       
       //Definición de variables, es como en C# 
       //solo que en algunos casos se inicia en mayúscula
       // tipo= byte tamaño= 8 bits valor minimo -128   valor máximo: 127
        // tipo= short tamaño= 16 bits valor minimo -32768   valor máximo: 32767
       
       
       String nombre = "Laura Serrano";
       int salario;
       boolean disponible;
       
       //boolean una de dos posibles respuestas
       
       salario = 4500000;
       disponible = true;
       
       int suma = salario + 100000;
       
       System.out.println("El nombre del empleado es: "+ nombre);
       System.out.println("El salario es: "+ salario);
       //System.out.println("La disponibilidad es: "+ disponible);
       
       /*Cuando la variable está inicializada o especificada
       Basta con mencionarla para saber que se está relacinando con
       verdadero, mientras no la niegue es verdadero*/
               
       
       //CONDICIONAL
       
       if(disponible)
       {
           System.out.println("El empleado está disponible");
       }
       else
       {
           System.out.println("El empleado no está disponible");
       }
       
       
       //CICLO
       //RECORDAR: i++ Incrementa de uno en uno
       
      int i;
      for(i=1;i<=10;i++)
      {
          System.out.println("8 X "+ i + " = "+ 8*i);
      }
      
      
      //SELECTOR
      
      String cargo = "Desarrollador";
      
      switch(cargo)
      {
          case "Gerente":
          {
              salario = 3500000;
              break;
          }
          
          case "Desarrollador":
          {
              salario = 2500000;
              break;
          }
          
          case "Presidente":
          {
              salario = 5000000;
              break;
          }
          
          default:
          {
              salario = 0;
              break;
          }
      }
    
        System.out.println("El valor del salario es: "+ salario);
      
     
        //CICLO MIENTRAS
        // Variable antes del ciclo y utilizar dentro del mismo un incremento
        
        
        int c=1;
        while (c<=50)
        {
            if(c%2 == 0)
            {
                if(c<50)
                {
                   System.out.print(c+", "); 
                }
                else
                {
                    System.out.print(c);
                }                
            }
            c++;
        }
       
        
     /* int n = 1;
        
      switch(n)
      {
          case 1:
          {
              System.out.println("0");
              break;
          }
          
          case 2:
          {
              System.out.println("0, 1");
              break;
          }
          
          case 3:
          {
              System.out.println("0, 1, 1");
              break;
          }
          
          case 4:
          {
              System.out.println("0, 1, 1, 2");
              break;
          }
          
          case 5:
          {
              System.out.println("0, 1, 1, 2, 3");
              break;
          }
          
          case 6:
          {
              System.out.println("0, 1, 1, 2, 3");
              break;
          }
          
          case 7:
          {
              System.out.println("0, 1, 1, 2, 3, 5");
              break;
          }
          
          case 8:
          {
               System.out.println("0, 1, 1, 2, 3, 5, 8, 13");
               System.out.println("Gano");
              break;
          }
          
          case 9:
          {
               System.out.println("0, 1, 1, 2, 3, 5, 8, 13, 21");
               break;
          }
          
           case 10:
          {
               System.out.println("0, 1, 1, 2, 3, 5, 8, 13, 21, 34");              
              break;
          }
           
            case 11:
          {
               System.out.println("0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55");               
              break;
          }
          
             case 12:
          {
               System.out.println("0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89");              
              break;
          }
             
             default:
          {
                System.out.println("Revisar numeros del 1 - 12");
                break;
          }
             
      } */
        
      
      int n = 1;
      String k;
        
      switch(n)
      {
          case 1:
          {
              k= "0";
              break;
          }
          
          case 2:
          {
             k= "0, 1";
              break;
          }
          
          case 3:
          {
              k= "0, 1, 1";
              break;
          }
          
          case 4:
          {
              k= "0, 1, 1, 2";
              break;
          }
          
          case 5:
          {
             k="0, 1, 1, 2, 3";
              break;
          }
          
          case 6:
          {
              k= "0, 1, 1, 2, 3";
              break;
          }
          
          case 7:
          {
              k= "0, 1, 1, 2, 3, 5";
              break;
          }
          
          case 8:
          {
               k = "0, 1, 1, 2, 3, 5, 8, 13";
              
              break;
          }
          
          case 9:
          {
               k= "0, 1, 1, 2, 3, 5, 8, 13, 21";
               break;
          }
          
           case 10:
          {
               k="0, 1, 1, 2, 3, 5, 8, 13, 21, 34";              
              break;
          }
           
            case 11:
          {
               k="0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55";               
              break;
          }
          
             case 12:
          {
               k="0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89";              
              break;
          }
             
             default:
          {
               k="Revisar numeros del 1 - 12";
                break;
          }                      
             
      } 
         System.out.println(k);
        
        
      
    }
    
}
