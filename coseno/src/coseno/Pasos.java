package coseno;
import java.util.*;

public class Pasos {
	static  Scanner leer= new Scanner(System.in);//Leer Valores de entrada
	 //Atributos
	 static int x;
	static  int e=1;
	static double suma,acom=0, valor=0.1d;
	 
	 
	
	public static void Datos() { //Metodo para ingresar el valor de la serie y pasar el datoingresado por el usuario a radianes
		System.out.println("Ingrese Rango a evaluar");
		x=leer.nextInt();
		double angulo =Math.toRadians(x);
		Math.cos(angulo);
		System.out.println(angulo);
	
		
		
		
	}
	public static double  MetodoT() {
	
		
		
		do {
			suma=Math.pow(-1, e) / Fact ( ) * Math.pow(x , 1 * e); //se utiliza para elevar el numero al exponente
			acom =acom + suma;
			e= e + 1;
		}while(Math.abs(suma)>valor); // se utiliza math.abs para retornar el valor absoluto de la variable suma
		
		return acom;
		
	}
	public static double Fact() {
		double fac= 0.0d;
		
		while(x != 0 ) {
			fac *= x++;
				
			
		}
			return fac;
			
	}
	
}
			
	


