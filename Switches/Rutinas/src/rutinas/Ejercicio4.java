package rutinas;

import java.util.Scanner;

public class Ejercicio4 {
	
	//Crea una función en java que reciba un número entero y devuelva su factorial.
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		
		System.out.println("introduzca un numero entero");
		num=sc.nextInt();
		
		factorial(num);
		
		
		System.out.println(factorial(num));
	}
	

	
		   	public static int factorial(int x) {
	        int resultado = 1;//empieza en el valor 1
	        
	        for (int i = 1/*empieza a contar en 1*/; i <= x; i++) {
	            resultado *= i; //resultado= resultado *i, el primer valor es 1*1
	        }
	        return resultado;
	        
	   
	}
	
}
