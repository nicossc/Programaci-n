package salario;
import java.util.*;

import javax.swing.JOptionPane;
public class AppSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Salario s;
		s = new Salario();
		do {
		s.leer();
		
		JOptionPane.showMessageDialog(null, "Salario base del trabajador "+s.getNombre()+": "+s.salario());
		JOptionPane.showMessageDialog(null, "Salario final aplicando impuestos (si fuese necesario) para el trabajador "+s.getNombre()+": "+s.impuesto());
		}while(s.continuar());

	}

}
