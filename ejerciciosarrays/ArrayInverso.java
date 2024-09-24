package ejerciciosrandom;
import java.util.Scanner;
public class ArrayInverso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		for(int i=0;i<numeros.length;i++) {
			System.out.print("Introducir numero "+(i+1)+": ");
			numeros[i]=sc.nextInt();
		}
		//2 formas de mostrar el resultado
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[(numeros.length-(i+1))]+" ");
		}
		System.out.println();
		for(int i=numeros.length-1;i>=0;i--) {
			System.out.print(numeros[i]+" ");
		}

	}

}
