package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio6 {

	/* 
	 *  2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que cree un vector de números enteros de un
	 * tamaño aleatorio comprendido entre 100 y 500. Una vez creado lo llenará llenará con
	 * números aleatorios comprendidos entre 0 y 1000000. Después de llenar el vector 
	 * mostrará la mínima diferencia entre dos valores adyacentes. La diferencia entre dos
	 * valores adyacentes se calcula como el valor almacenado en cada posición [i] (excepto
	 * la primera) menos el valor almacenado en la posición [i-1].
	 */
		
	public static void main(String[] args) {
		int d;
		int menor=100000000;
		int valor1=0;;
		int valor2=0;;
		d=(int)(Math.random()*400+100);
		
		int [] vector = new int[d];
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*1000000);
		}
		
		for(int i=0;i<vector.length-1;i++) {
			if(vector[i]-vector[i+1]<menor) {
				menor=vector[i]-vector[i+1];
				valor1=vector[i];
				valor2=vector[i+1];
			}
		}
		
		
		System.out.println("mínima diferencia: " + menor+"de estos valores " +valor1+"-" +valor2);

	}

}
