package ejerciciosrandom;
import java.util.Random;
public class ArrayAleatorio {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] numeros = new int[20];
		for(int i=0;i<20;i++) {
			numeros[i] = rd.nextInt(100)+1;
		}
		for(int i=0;i<20;i++) {
			System.out.print(numeros[i]+" ");
		}

	}

}
