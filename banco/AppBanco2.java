package banco;
import java.util.Scanner;
public class AppBanco2 {

	public static void main(String[] args) {
		double c;
		int o;
		char cont;
		String pin;
		Scanner sc = new Scanner(System.in);
		Banco cliente;
		cliente = new Banco();
		do {
			System.out.print("Introducir nombre del titular: ");
			cliente.setNombre(sc.nextLine());
			sc.nextLine();
			System.out.print("Introducir número de cuenta: ");
			cliente.setNumCuenta(sc.nextLine());
			System.out.print("Introduce el saldo de la cuenta: ");
			cliente.setSaldo(sc.nextDouble());
			sc.nextLine();
			System.out.print("Introduce tu DNI: ");
			cliente.setDni(sc.nextLine());
			cliente.setPin(cliente.getContraseña(cliente.getDni()));
			System.out.println("Contraseña de la cuenta: "+cliente.getPin());
			
			System.out.println(cliente.toString());
		
			do {
				System.out.println("1.Ingresar 2.Retirar 3.Fin");
				o = sc.nextInt();
				while(o!=1 && o!=2 && o!=3) {
					System.out.println("ERROR. 1.Ingresar 2.Retirar 3.Fin");
					o = sc.nextInt();
				}
				switch(o) {
				case 1:
					System.out.println("Introducir la cantidad a ingresar");
					c = sc.nextInt();
					cliente.ingresar(c);
					System.out.println("Cantidad introducida con éxito");
					break;
				case 2:
					System.out.println("Introduce la contraseña");
					sc.nextLine();
					pin = sc.nextLine();
					if(cliente.compPin(pin)) {
						System.out.println("Introduce la cantidad a retirar");
						c = sc.nextInt();
						if(cliente.compRetirar(c))
							System.out.println("Operación realizada con éxito. Saldo restante: "+cliente.retirar(c));
						else
							System.out.println("Saldo insuficiente: "+cliente.getSaldo());
					}
					else
						System.out.println("ERROR. CONTRASEÑA INCORRECTA");
					break;
				case 3:
					System.out.println("Saldo final: "+cliente.toString());
				}
	
			}while(o!=3);
			
			System.out.println("¿Nuevo Cliente? (S/N)");
			cont=sc.next().charAt(0);
			cont=Character.toUpperCase(cont);
			while(cont!='S' && cont!='N') {
				System.out.println("ERROR. ¿Nuevo Cliente? (S/N)");
				cont=sc.next().charAt(0);
				cont=Character.toUpperCase(cont);
			}
		}while(cont=='S');

	}

}
