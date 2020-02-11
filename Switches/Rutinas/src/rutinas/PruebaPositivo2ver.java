package rutinas;



public class PruebaPositivo2ver {

	public static void main(String[] args) {

		for (int i=5; i>=-5; i--) 
			
		
			if (esPositivo(i)) // esto siempre es if ->true, entoces va al otro public static a la parte que pone true
				
				System.out.println(i+" es positivo");
		   else 
			System.out.println(i+" es negativo");
	}
	
	    public static boolean esPositivo(int x) {

	    	if (x<0) return false;
	        
	    	else return true; //no funciona con x>0 poruq el compilador piensa que imaginate que es otra cosa que no es mayor que 0
	    	                  //por eso hay que poner else
	}

}
