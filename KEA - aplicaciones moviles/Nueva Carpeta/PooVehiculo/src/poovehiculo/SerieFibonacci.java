package poovehiculo;


public class SerieFibonacci {
    public static void main(String[] args) {
    
    //"0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89"...
    
    int n= 5;
        
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
          
              
      }
    
}
