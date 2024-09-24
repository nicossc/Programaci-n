package ejerciciosrandom;
import java.util.Random;
public class ArrayCuadradoCubo {

	public static void main(String[] args) {
		int num;
		Random rd = new Random();
		int[] numeros = new int[20];
		int[] cuadrados = new int[20];
		int[] cubos = new int[20];
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = rd.nextInt(101);
		}
		for(int i=0;i<numeros.length;i++) {
			cuadrados[i] = (int) Math.pow(numeros[i], 2);
		}
		for(int i=0;i<numeros.length;i++) {
			cubos[i] = (int) Math.pow(numeros[i], 3);
		}
		System.out.print("Números: ");
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println();
		System.out.print("Cuadrados: ");
		for(int i=0;i<numeros.length;i++) {
			System.out.print(cuadrados[i]+" ");
		}
		System.out.println();
		System.out.print("Cubos: ");
		for(int i=0;i<numeros.length;i++) {
			System.out.print(cubos[i]+" ");
		}

	}

}
