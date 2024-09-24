package adivinarNumero;
import java.util.*;
public class AppAdivinarNumero {

	public static void main(String[] args) {
		int num, rd;
		AdivinarNumero a;
		a = new AdivinarNumero();
		a.leerMaxMin();
		rd = a.generaNumeroAleatorio();
		
		System.out.println("Se ha generado un número aleatorio entre "+a.getMin()+" y "+a.getMax()+", intenta adivinarlo");
		num=a.leer();
		while(num!=rd) {
			System.out.println(a.respuesta());
			num=a.leer();
		}
		System.out.println(a.respuesta());

	}

}
