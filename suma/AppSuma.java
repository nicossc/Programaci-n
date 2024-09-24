package suma;
import java.util.Scanner;
import javax.swing.*;
public class AppSuma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		String o;
		String res;
		char letrares;
		double resultado;
		Suma s;
		s = new Suma();
		s.visualizar();
		
		do {
			n1=s.leer();
			n2=s.leer();
			s.setN1(n1);
			s.setN2(n2);
			o = s.leerCalculo();
			switch(o) {
			case "A":
				JOptionPane.showMessageDialog(null, s.getN1()+" + "+s.getN2()+" = "+s.sumar());
				break;
			case "B":
				JOptionPane.showMessageDialog(null, s.getN1()+" - "+s.getN2()+" = "+s.restar());
				break;
			case "C":
				JOptionPane.showMessageDialog(null, s.getN1()+" * "+s.getN2()+" = "+s.multiplicar());
				break;
			case "D":
				JOptionPane.showMessageDialog(null, s.getN1()+" / "+s.getN2()+" = "+s.dividir());
				break;
			case "E":
				JOptionPane.showMessageDialog(null, "El resto de la división "+s.getN1()+" / "+s.getN2()+" = "+s.resto());
				break;
			case "F":
				JOptionPane.showMessageDialog(null, s.getN1()+" ^ "+s.getN2()+" = "+s.potencia());
				break;
			case "G":
				JOptionPane.showMessageDialog(null, "Raíz cuadrada de "+s.getN1()+" = "+s.raiz(s.getN1()));
				JOptionPane.showMessageDialog(null, "Raíz cuadrada de "+s.getN1()+" = "+s.raiz(s.getN2()));
				break;
			}
			
			res = JOptionPane.showInputDialog("¿Quieres realizar otra operación? (S/N): ");
			letrares = res.charAt(0);
			letrares = Character.toUpperCase(letrares);
			while ((letrares != 'S') && (letrares != 'N')) {
				res= JOptionPane.showInputDialog("Error teclea (S/N): ");
				letrares = res.charAt(0);
				letrares = Character.toUpperCase(letrares);
			 }
			
		}while (letrares == 'S');
		 JOptionPane.showMessageDialog(null, "Fin Programa");
	}

}