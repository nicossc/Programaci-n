package ejerciciosrandom;

public class EjemploMetodos {
	
	public static void modificarArray (int b [ ]) {
		for ( int j = 0; j < b.length; j++ )
			b [ j ] = 2 ;
		}
	
	public static void main(String[] args) {
		int a[ ] = {0, 1, 2, 3, 4 } ;
		for ( int i = 0; i < a.length; i++ )
			System.out.print(a[i] + " ");
		modificarArray ( a ) ;
		System.out.println();
		for ( int i = 0; i < a.length; i++ )
			System.out.print(a[i] + " ");
		// despues de llamar a = {2, 2, 2, 2, 2 }
	
	}
}

