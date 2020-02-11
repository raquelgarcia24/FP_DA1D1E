package rutinas;

import java.util.Scanner;

public class TablaMultipicar1 {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);

		int num;
		
		System.out.println("Introduzca un numero para hacer su tabla de multipicar");
		num=sc.nextInt();
		
		tabla(num);
	}
		
	public static void tabla(int x) {
      int multiplicacion,acum;
      
		 for (acum=1;acum<=10;acum++){
		 multiplicacion=acum*x;
		 
		 System.out.println(acum+"*"+x+"="+multiplicacion(x,acum));
		 
		 }
	}
	
		 public static int multiplicacion (int a, int b) {
			 return a*b;
		 }
	}
	       
		
	


