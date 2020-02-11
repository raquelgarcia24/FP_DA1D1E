package rutinas;

import java.util.Scanner;

public class Ejercicio3 {
//Crea una función en java que reciba dos números reales y devuelva su suma.
	
	public static void main(String[] args) {
		
    Scanner sc= new Scanner (System.in);
    
    int num1, num2;
    
    System.out.println("introduzca 2 numeros");
	num1=sc.nextInt();
	num2=sc.nextInt();
	
	suma(num1,num2);
	}
	public static void suma(int x, int y) {
	int suma= (x+y);
	
	System.out.println(suma);
	
	}

}
