package ejercicio2;
import java.util.Scanner;
public class AppCompeticion {

	public static void main(String[] args) {
		int o;
		Scanner sc = new Scanner(System.in);
		Competicion c = new Competicion();
		String[] num = {"D111", "D222", "D333", "D444", "D555"};
		String[] marcas = {"M_2020", "M_2021", "M_2022"};
		double[][] part =  {
				{12.45, 13.05, 13.09},
				{13.09, 12.09, 13.99},
				{12.95, 12.33, 12.12},
				{13.12, 13.15, 13.13},
				{13.33, 13.03, 12.99}
			};
		c.visualizar(num, marcas, part);
		do {
			System.out.println("Seleccione opción:"
					+"\n1.Mostrar dorsal y mejor marca de todos los participantes"
					+"\n2.Consultar media de las 3 marcas de un participante"
					+"\n3.Finalizar programa");
			o=sc.nextInt();
			switch(o) {
			case 1:
				c.mejorMarca(num, part);
				break;
			case 2:
				c.mediaMarcas(num, part);
				break;
			case 3:
				System.out.println("Gracias por su visita");
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
			
		}while(o!=3);

	}

}
