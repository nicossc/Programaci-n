package matrices;
import java.util.Scanner;
public class PruebaMatrices {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		char cont;
		int[][] a = new int[3][2];
		System.out.println("Lectura de elementos de la matriz: ");
		cargar(a);
		System.out.println("valores introducidos:");
		visualizar(a);
		maxmin(a);
		sumafilas(a);
		do {
			consultar(a);
			System.out.println();
			System.out.print("¿Nueva consulta? (S/N): ");
			cont = sc.next().charAt(0);
			cont = Character.toUpperCase(cont);
			while(cont!='S' && cont!='N') {
				System.out.print("ERROR. ¿Nueva consulta? (S/N): ");
				cont = sc.next().charAt(0);
				cont = Character.toUpperCase(cont);
			}
		}while(cont=='S');
		 
	}
	
	public static void cargar(int[][] a) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		for (i = 0; i < 3; i++) {
			 for (j = 0; j < 2; j++) {
			 System.out.print("a[" + i + "][" + j + "]= ");
			 a[i][j] = sc.nextInt();
			 }
		}
	}
	
	public static void visualizar(int [][] a) {
		int i,j;
		for (i = 0; i < a.length; i++) {
			 for (j = 0; j < a[i].length; j++) {
				 System.out.print(a[i][j] + " ");
			 }
			 System.out.println();
		}
	}
	
	public static void consultar(int[][] a) {
		Scanner sc = new Scanner(System.in);
		int c,f;
		System.out.print("Introduce el número de la fila: ");
		f = sc.nextInt();
		while(f>2) {
			System.out.print("ERROR. Introduce una fila válida: ");
			f = sc.nextInt();
		}
		System.out.print("Introduce el número de la columna: ");
		c = sc.nextInt();
		while(c>1) {
			System.out.print("ERROR. Introduce una columna válida: ");
			c = sc.nextInt();
		}
		System.out.print("El valor en la fila "+f+" columna "+c+" es "+a[f][c]);
	}
	
	public static void maxmin(int[][] a) {
		int i,j,max=0,min=999,cmax=0,cmin=0,fmax=0,fmin=0;
		for (i = 0; i < a.length; i++) {
			 for (j = 0; j < a[i].length; j++) {
				 if(a[i][j]>max) {
					 max=a[i][j];
					 cmax = j;
					 fmax = i;
				 }
				 if(a[i][j]<min) {
					 min=a[i][j];
					 cmin = j;
					 fmin = i;
				 }
			 }
		}
		System.out.println("Valor máximo: "+max+". Posición: a["+fmax+"]["+cmax+"]");
		System.out.println("Valor mínimo: "+min+". Posición: a["+fmin+"]["+cmin+"]");
	}
	
	public static void sumafilas(int[][] a) {
		int i,j,s;
		int[] suma = new int[3];
		System.out.print("Suma de las filas: ");
		for (i = 0; i < a.length; i++) {
			s=0;
			 for (j = 0; j < a[i].length; j++) {
				 s+=a[i][j];
			 }
			 suma[i] = s;
			 System.out.print("["+suma[i]+"]");
		}
		System.out.println();
	}
}
