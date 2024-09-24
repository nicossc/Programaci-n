package libro;
import java.util.*;
public class AppLibro2 {

	public static void main(String[] args) {
		int o;
		char c;
		Scanner sc = new Scanner(System.in);
		Libro libro;
		libro = new Libro();
		
		do {
			System.out.print("Introducir título: ");
			libro.setTitulo(sc.nextLine());
			sc.nextLine();
			System.out.print("Introducir autor: ");
			libro.setAutor(sc.nextLine());
			System.out.print("Introduce el número de ejemplares: ");
			libro.setNumEjemplares(sc.nextInt());
			System.out.print("Introduce el número de prestados: ");
			libro.setNumPrestados(sc.nextInt());
		
			System.out.println(libro.toString());
			do {
				System.out.println("1.Prestar 2.Devolver 3.Fin");
				o = sc.nextInt();
				while(o!=1 && o!=2 && o!=3) {
					System.out.println("ERROR. 1.Prestar 2.Devolver 3.Fin");
					o = sc.nextInt();
				}
				switch(o) {
				case 1:
					if(libro.prestamo())
						System.out.println("Se ha prestado el libro "+libro.getTitulo());
					else
						System.out.println("No se puede prestar el libro "+libro.getTitulo());
					break;
				case 2:
					if(libro.devolucion())
						System.out.println("Se ha devuelto el libro "+libro.getTitulo());
					else
						System.out.println("No se puede devolver el libro "+libro.getTitulo());
					break;
				case 3:
					System.out.println(libro.toString());
				}
		
			}while(o!=3);
			
			System.out.println("¿Nuevo Libro? (S/N)");
			c=sc.next().charAt(0);
			c=Character.toUpperCase(c);
			while(c!='S' && c!='N') {
				System.out.println("ERROR. ¿Nuevo Libro? (S/N)");
				c=sc.next().charAt(0);
				c=Character.toUpperCase(c);
			}
		}while(c=='S');
				
	}

}
