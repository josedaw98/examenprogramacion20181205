package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que obtenga el desglose en billetes
	 * y monedas de una cantidad exacta de euros que el usuario introducirá por teclado.
	 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
	 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
	 * por pantalla el siguiente resultado:
	 * 
	 * 		2 billetes de 200 euros.
	 * 		1 billete de 20 euros.
	 * 		1 billete de 10 euros.
	 * 		2 monedas de 2 euros.
	 * 
	 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
	 * desee hasta que decida finalizar su ejecución. 
	 * El programa comprobará que la cantidad introducida sea una cantidad positiva
	 * mayor que 0. En caso contrario mostrará un mensaje de error y volverá a pedirla.
	 */
	
	public static void main(String[] args) {
		String respuesta="";
		int cont500 ;
		int cont200 ;
		int cont100 ;
		int cont50 ;
		int cont10 ;
		int cont5 ;
		int cont2;
		int cont1 ;
		int d;
		do {
		 cont500 = 0;
		 cont200 = 0;
		 cont100 = 0;
		 cont50 = 0;
		 cont10 = 0;
		 cont5 = 0;
		 cont2= 0;
		 cont1 = 0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("escribe el numero de euros a desglosar");
		 d=sc.nextInt();
		 if(d<=0) {
			 System.out.println("ERROOR! el valor tiene que ser mayor que cero");
		 }
		}while(d<=0);
		while(d-500 >=0) {
			d=d-500;
			cont500++;
		}
		while(d-200>=0) {
			d=d-200;
			cont200++;
		}
		while(d-100>=0) {
			d=d-100;
			cont100++;
		}
		while(d-50>=0) {
			d=d-50;
			cont50++;
		}
		while(d-10>=0) {
			d=d-10;
			cont10++;
		}
		while(d-5>=0) {
			d=d-5;
			cont5++;
		}
		while(d-2>=0) {
			d=d-2;
			cont2++;
		}
		while(d-1>=0) {
			d=d-1;
			cont1++;
		}
		
		if(cont500>0) {
			System.out.println(cont500+" billetes de 500 euros");
		}
		if(cont200>0) {
			System.out.println(cont200+" billetes de 200 euros");
		}
		if(cont100>0) {
			System.out.println(cont100+" billetes de 100 euros");
		}
		
		if(cont50>0) {
			System.out.println(cont50+" billetes de 50 euros");
		}
		if(cont10>0) {
			System.out.println(cont10+" billetes de 10 euros");
		}
		if(cont5>0) {
			System.out.println(cont5+" billetes de 5 euros");
		}
		
		if(cont2>0) {
			System.out.println(cont2+" monedas billetes de 2 euros");
		}
		if(cont1>0) {
			System.out.println(cont1+" monedas de 1 euro");
		}
		
		System.out.println("quiere realizar otro desglose?");
		respuesta=sc.next();
		}while(respuesta.equalsIgnoreCase("si"));

	}

}
