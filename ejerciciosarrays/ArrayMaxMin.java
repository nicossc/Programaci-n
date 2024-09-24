package ejerciciosrandom;

import java.util.Random;
import java.util.Scanner;

public class ArrayMaxMin {

	public static void main(String[] args) {
		int max=0, min=500;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] numeros = new int[100];
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = rd.nextInt(501);
		}
		System.out.print("Números: ");
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i]+" ");
			if(numeros[i]>max)
				max=numeros[i];
			if(numeros[i]<min)
				min=numeros[i];
		}
		System.out.println();
		System.out.print("Números: ");
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]==max || numeros[i]==min)
				System.out.print("''"+numeros[i]+"'' ");
			else
				System.out.print(numeros[i]+" ");
		}

	}

}
