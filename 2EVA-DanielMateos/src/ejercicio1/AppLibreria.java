package ejercicio1;
import java.util.Scanner;
public class AppLibreria {

	public static void main(String[] args) {
		int o=0, anio=0;
		boolean existe;
		Scanner sc = new Scanner(System.in);
		Libreria l[] = new Libreria[5];
		l[0] = new Libreria("1234N", 2022, 12.99, 15.99);
		l[1] = new Libreria("2468L", 2000, 9.99, 13.99);
		l[2] = new Libreria("1357B", 2023, 10.99, 12.99);
		l[3] = new Libreria("4321H", 1995, 13.99, 17.99);
		l[4] = new Libreria("6789P", 2004, 11.99, 15.99);
		
		do {
			System.out.println("Seleccione opción:"
					+"\n1.Actualizar precio lujo"
					+"\n2.Consultar libros de cierto año"
					+"\n3.Finalizar programa");
			o=sc.nextInt();
			switch(o) {
			case 1:
				for(int i = 0; i < l.length; i++) {
					l[i].actualizar();
				}
				break;
			case 2:
				System.out.println("Introduzca el año de publicación");
				anio = sc.nextInt();
				existe=false;
				for(int i = 0; i < l.length; i++) {
					existe=l[i].consultar(anio, existe);
				}
				if(!existe)
					System.out.println("No tenemos libros publicados ese año");
				break;
			case 3:
				System.out.println("Gracias por su visita");
				break;
			default:
				System.out.println("Opción no válida");
			}
		}while(o!=3);

	}

}
