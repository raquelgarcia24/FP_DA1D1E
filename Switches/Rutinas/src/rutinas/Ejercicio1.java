package rutinas;


/*Crea una subrutina en java a la que se le pase un número N que se le pedirá al usuario 
y muestre por pantalla la frase “Módulo ejecutándose” N veces.*/


import java.util.Scanner;


public class Ejercicio1 {

	
public static void main(String[] args) {
		 
	Scanner sc = new Scanner (System.in);
	
		 int num;
        
         
		System.out.println("introduzca un numero");
		num= sc.nextInt();
		
		imprimirNveces (num);
}


		public static void imprimirNveces (int num) {
       
			for (int acum = 1; acum <= num ; acum++) {
				System.out.println("modulo ejecutandose "+num+ " veces");
		
			}
		
		
		
		
		
		
		
		
		
		
	}

}
