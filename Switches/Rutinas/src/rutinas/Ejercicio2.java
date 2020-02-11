/*Muestra por pantalla los resultados de las 4 operaciones básicas entre 2 números que se le pedirán al usuario, 
realizando una subrutina para cada una de dichas operaciones. 
El resultado de la operación se imprime dentro de la subrutina.*/

package rutinas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		double num1, num2;
		
		System.out.println("Introduzca 2 numeros");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		
		operacion_suma(num1,num2);
		operacion_resta(num1,num2);
		operacion_mult(num1,num2);
		operacion_div(num1,num2);
		
		sc.close();
		
	}
	public static void operacion_suma (double num1, double num2 ) {
		double suma;
		suma=num1+num2;
		System.out.println("suma "+suma);
		
		
	}
public static void operacion_resta (double num1,double num2) {
double resta;
resta=num1-num2;
System.out.println("resta "+resta);
	}
public static void operacion_mult (double num1,double num2) {
double mult;
mult=num1*num2;
System.out.println("multiplicacion "+mult);
}
public static void operacion_div (double num1,double num2) {
double div;
div=num1/num2;
System.out.println("division "+div);
}
}
