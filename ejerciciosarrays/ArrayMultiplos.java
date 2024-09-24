package ejerciciosrandom;

import java.util.Random;
import java.util.Scanner;

public class ArrayMultiplos {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] numeros = new int[20];
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = rd.nextInt(401);
		}
		System.out.print("Números: ");
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i]+" ");
		}
		System.out.println();
		System.out.print("¿Mostrar múltiplos de 2 o de 5?");
		num = sc.nextInt();
		while(num!=2 && num!=5) {
			System.out.print("¿Mostrar múltiplos de 2 o de 5?");
			num = sc.nextInt();
		}
		if(num==2) {
			System.out.print("Números: ");
			for(int i=0;i<numeros.length;i++) {
				if(numeros[i]%2==0) {
					System.out.print("["+numeros[i]+"] ");
				}
				else
					System.out.print(numeros[i]+" ");
			}
		}
		else {
			System.out.print("Números: ");
			for(int i=0;i<numeros.length;i++) {
				if(numeros[i]%5==0) {
					System.out.print("["+numeros[i]+"] ");
				}
				else
					System.out.print(numeros[i]+" ");
			}
		}

	}

}
