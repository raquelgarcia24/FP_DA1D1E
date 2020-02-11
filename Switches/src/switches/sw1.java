package switches;

import java.util.Scanner;

public class sw1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
	String mes,mess;
	int dias;
	
    System.out.println("Dime un mes");
    
		mes= sc.nextLine ();
	    mes =mes.toLowerCase();
				
		switch (mes.toLowerCase()) { 
		    case "abril":
		    case "junio":
		    case "septiembre":
		    case "noviembre": 
		    dias = 30; 
		    
		break; 
		
		   case "febrero": 
			   dias = 28; 
			   
		break; 
		default: 	dias = 31; 
		break; 
		
		}
		mess=mes.substring(0,1).toUpperCase()+mes.substring(1);
		
        System.out.println("El mes de " +mess+" tiene "+dias+" dias");
	}

}
