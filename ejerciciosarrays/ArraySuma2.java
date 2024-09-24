package ejerciciosrandom;

public class ArraySuma2 {

	public static void main(String[] args) {
		int p=0, im=0;
		int[] numeros = {5, 4, 3, 7, 9, 12, 34, 56};
		for(int i=0;i<numeros.length;i++) {
			if(i%2==0)
				p+=numeros[i];
			else
				im+=numeros[i];
		}
		System.out.println("Suma pares: "+p);
		System.out.println("Suma impares: "+im);
	}

}
