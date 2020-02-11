package rutinas;

import java.util.Scanner;

public class EjemploPrimos {

	public static void main(String[] args) {
		
    Scanner sc= new Scanner (System.in);
    
		int num, i;
		
		System.out.println("degame un numero para ver si es primo o no");
		num=sc.nextInt();
		
		
		
	      if (esPrimo(num))//condicion que sea verdadero
	      System.out.println("el numero es primo");
			 
	      else
		  System.out.println("el numero no es primo");
		 
		
	}
	
	public static boolean esPrimo (int x) {
	
	
	for (int i=2; i< x; i++) {//contador de uno en uno, numero menor que el contador poruqe por si mismo se divide y el contador 
		                       //empieza en 2 porque por 1 si se divide hay q ponerlo en orden
		if ((x%i)==0) {
			return false;//no es primo
		}
	}
	return true;
				
		}
      }
