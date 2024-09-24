package ejerciciosrandom;
import java.util.Scanner;
public class ArrayNota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float media=0;
		int[] notas = new int[4];
		for(int i=0;i<notas.length;i++) {
			System.out.print("Introduce la nota del examen "+(i+1)+": ");
			notas[i] = sc.nextInt();
		}
		for(int i=0;i<notas.length;i++) {
			media+=notas[i];
		}
		media/=notas.length;
		System.out.println("Media: "+media);

	}

}
