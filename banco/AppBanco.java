package banco;
import java.util.Scanner;
public class AppBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banco cliente1, cliente2;
		cliente1 = new Banco("Eva Porada", "1234567890", 1000, "0", "0");
		cliente2 = new Banco("Jacinto Cinete", "0987654321", 0, "0", "0");
		
		System.out.println("Introduce la cantidad a retirar.");
		double c = sc.nextDouble();
		if(cliente1.compRetirar(c))
			System.out.println("Operación realizada con éxito. Saldo restante: "+cliente1.retirar(c));
		else
			System.out.println("Saldo insuficiente: "+cliente1.getSaldo());
		
		cliente2.ingresar(300);
		
		if(cliente2.compRetirar(500))
			System.out.println("Operación realizada con éxito. Saldo restante: "+cliente2.retirar(500));
		else
			System.out.println("Saldo insuficiente: "+cliente2.getSaldo());

	}

}
