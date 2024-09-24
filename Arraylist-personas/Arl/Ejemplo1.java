package Arl;

import java.util.ArrayList;

public class Ejemplo1 {

	public static void main(String[] args) {
		ArrayList<String>  a = new ArrayList<String>();
		System.out.println("Nº de elementos: "+a.size());
		a.add("rojo");
		a.add("verde");
		a.add("azul");
		System.out.println("Nº de elementos: "+a.size());
		a.add("blanco");		
		System.out.println("Nº de elementos: "+a.size());
		System.out.println("Elemento en la posicion 0: "+a.get(0));
		System.out.println("Elemento en la posicion 3: "+a.get(3));
		for (String i:a) {
			System.out.println(i);
		}
		if (a.contains("blanco")) {
			System.out.println("Contenido de la lista despues de quitar la primera ocurrencia del color blanco");
			a.remove("blanco");
			for (String i:a) {
				System.out.println(i);
			}
		}
		a.set(2,"turquesa");
		for (String i:a) {
			System.out.println(i);
		}
	}

}
