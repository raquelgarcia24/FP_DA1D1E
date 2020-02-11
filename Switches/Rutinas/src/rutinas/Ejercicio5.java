package rutinas;
import java.util.Scanner;
public class Ejercicio5 {
	
/* Escribe una aplicación en java que le pida al usuario que escriba el nombre de una operación en java entre las siguientes: 
 * suma, resta, multiplicación y división.
 * En caso de introducir una distinta se le comunicará el error y se pedirá de nuevo la operación.*/
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    String operador, suma, resta, multipilicacion, division;
    
    System.out.println("introduzca el nombre de una operacion");
    operador=sc.nextLine();
    
    correcto(operador);
    
    //hay q poner aqui el syso cuando en el metodo de abajo no pones void
    
	}
	
	public static String correcto(String palabra) {
		switch (palabra.toLowerCase()) {
		
		}
    
    
    
	}

}
