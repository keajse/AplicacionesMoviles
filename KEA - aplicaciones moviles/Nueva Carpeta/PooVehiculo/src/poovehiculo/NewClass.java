/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poovehiculo;

/**
 *
 * @author 401
 */
public class NewClass {
    
    public static void main(String[] args) {
    
    int serie = 1;
		boolean sumar=true;
		int cont;
		String cadena="Serie: ";
		
		System.out.println("Indique cuantos numeros de la serie quiere ver: " );
		
		Scanner sc = new Scanner (System.in);
		cont=sc.nextInt();
		
		do{
			
			cadena=cadena.concat(String.valueOf(serie) + "  ");	
			cont --;	
			if(sumar==true){		
				serie+=4;
			}else{		
				serie-=2;
			}
			
			sumar=!sumar;
		}while(cont>0);
		
		System.out.println(cadena);
    
}
