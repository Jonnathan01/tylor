package exponente;

import java.util.Scanner;

public class Procedimiento {
	static Scanner leer =new Scanner(System.in);//Leer Valores de entrada
	//atributos
	static int  x=0,fact=1,r=0;
	static double num, result,cal=1;
	
	public static void Datos() {
		System.out.println("Ingrese Rango a evaluar"); //ingresamos datos
		r=leer.nextInt();
		System.out.println("Ingrese valor");//ingresamos datos
		x=leer.nextInt();
		System.out.println(Fact(x));
	}
		public static double Fact(int n) {//realizamos el ciclo para aumentar el factorial
			for (int i = 0; i <=n; i++) {
				cal *=1;
				
				
			}
			return cal;//retornamos el resultado
		}
			
			
		
	}


