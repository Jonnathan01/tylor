package sen;
import java.util.*;

public class Proceso {
	static Scanner leer =new Scanner(System.in);//Leer Valores de entrada
	//atributos
	static int  x,fact=1,r;
	static double sen;
	
	public static void Datos() {
		System.out.println("Ingrese Rango a evaluar");
		r=leer.nextInt();
		System.out.println("Ingrese valor");
		x=leer.nextInt();
		 	
		sen=x;// se indica que la variable sen tome el valor de x
		Math.toRadians(x);
		Math.sin(x);
	}
	public static void Fact() { //metodo con el que calculamos el factorial 
		for (int i = 2; i < r; i++) { 
			fact= fact *((i*2)-2) *((i*2)-1);
			if(i% 2==0)
				sen=sen -Math.pow(x, i* 2 -1) /fact;
			else
				sen = sen + Math.pow(x, i*2-1) /fact;
		}
		System.out.println(sen);
			
		}
	}
	


