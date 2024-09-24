package numeros;
import java.util.*;
public class AppNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Numeros n;
		n = new Numeros();
		int num;
		boolean par, mult5, perfecto;
		char cont;
		
		do {
			System.out.println("Introduce el número");
			n.setNum(sc.nextInt());
		
			System.out.println("El número "+n.getNum());
			if(n.compPar())
				System.out.println("-Es Par");
			else
				System.out.println("-Es Impar");
		
			if(n.compMult5())
				System.out.println("-Es Múltiplo de 5");
			else
				System.out.println("-No es Múltiplo de 5");
		
			if(n.compPerfecto())
				System.out.println("-Es Perfecto");
			else
				System.out.println("-No es Perfecto");
			
			System.out.println("¿Continuar? (S/N)");
			cont=sc.next().charAt(0);
			cont=Character.toUpperCase(cont);
			while(cont!='S' & cont!='N') {
				System.out.println("Introduce una opción válida (S/N)");
				cont=sc.next().charAt(0);
				cont=Character.toUpperCase(cont);
			}
			
		}while(cont=='S');
		
	}

}
