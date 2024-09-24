package ejerciciosrandom;

public class ArraySuma {

	public static void main(String[] args) {
		int res=0;
		int[] numeros = {5, 4, 3, 7, 9, 12, 34, 56};
		for(int i=0;i<8;i++) {
			res+=numeros[i];
		}
		System.out.println("Resultado: "+res);

	}

}
