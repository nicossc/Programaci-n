package Arl;
import java.util.*;
public class PersonaApp {

	public static int menu() {
		int n=0;
		boolean r=true;

		Scanner sc=new Scanner(System.in);
		System.out.print("***** MENU ******\n1.- Añadir\n2.- Borrar (por apellido)\n3.- Modificar (por apellido)\n4.- Visualizar (todas las personas)\n5.- Buscar (por apellido)\n6.- SALIR\nElegir opción:");
		do {
		try {
			n=sc.nextInt();
			if (n<1 || n>6) {
				System.out.print("ERROR! Valor fuera de limites: ");
			}else {
				r=false;
			}
		} catch (Exception e) {
			System.out.print("ERROR! Valor incorrecto: ");
			sc.nextLine();
			r=true;
		}
		}while(r);
		return n;
	}
	
	public static void mod(ArrayList<Prsona> ar) {
		Scanner sc=new Scanner(System.in);
		String ap="",nom="",apa;
		int ed=0;
		boolean r;
		char conf = 0;
		System.out.print("Introduce el apellido: ");
		apa=sc.nextLine();
	
		for (Prsona a:ar) {
			if (apa.equals(a.getAp())) {
				System.out.println(a.getNom()+" "+a.getAp()+" "+a.getYear());
				System.out.print("Deseas modificar esta persona? (S|N)");
				do {
					r=true;
				try {
					conf=Character.toUpperCase(sc.next().charAt(0));
					if(conf!='S'&&conf!='N') {
						r=false;
					}else {
						System.out.println("Valor erroneo");
					}
				} catch (Exception e) {
					System.out.println("Valor erroneo");
				}}while(r);	
				if(conf=='S') {
					
					System.out.print("Introduce el nuevo nombre: ");
					nom=sc.nextLine();
					System.out.print("Introduce el nuevo apellido: ");
					ap=sc.nextLine();
					System.out.print("Introduce la nueva edad: ");
					ed=sc.nextInt();
				ar.set(ar.indexOf(a), new Prsona(ap,nom,ed));
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ap="",nom="",apa;
		int ed=0;
		char conf = 0;
		boolean r;
		boolean con=true;
		ArrayList<Prsona> ar= new ArrayList<Prsona>();
		ar.add(new Prsona("Wayne", "John",1907));
		ar.add(new Prsona("McQueen", "Steve",1930));
		ar.add(new Prsona("Lennon", "John",1940));
		ar.add(new Prsona("Gibson", "Mel",1956));
		ar.add(new Prsona("Willis", "Bruce",1955));
		do {
		switch(menu()) {
		case 1:
			System.out.print("Introduce el nombre: ");
			nom=sc.nextLine();
			System.out.print("Introduce el apellido: ");
			ap=sc.nextLine();
			System.out.print("Introduce la edad: ");
			ed=sc.nextInt();
			ar.add(new Prsona(ap,nom,ed));
			break;
		case 2:
			System.out.print("Introduce el apellido: ");
			apa=sc.nextLine();
			for (Prsona a:ar) {
				if (apa.equals(a.getAp())) {
					ed=ar.indexOf(a);
				}
			}
			ar.remove(ed);
			break;
		case 3:
			mod(ar);
			break;
		case 4:
			for (Prsona a:ar) {
				System.out.println(a.getNom()+" "+a.getAp()+" "+a.getYear());
			}
			break;
		case 5:
			System.out.print("Introduce el apellido: ");
			apa=sc.nextLine();
			for (Prsona a:ar) {
				if (apa.equals(a.getAp())) {
					System.out.println(a.getNom()+" "+a.getAp()+" "+a.getYear());
				}
			}
			
			break;
		case 6:
			con=false;
			ar.get(0).ap();
			break;
		}
	}while(con);
	sc.close();
	}
	
}
