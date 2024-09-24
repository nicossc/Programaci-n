package suma;
import java.util.*;
import javax.swing.*;
public class Suma {
	Scanner sc = new Scanner(System.in);
	private double n1;
	private double n2;
	public Suma() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Suma(double n1, double n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public double sumar() {
		return this.n1+this.n2;
	}
	
	public double restar() {
		return this.n1-this.n2;
	}
	
	public double multiplicar() {
		return this.n1*this.n2;
	}
	
	public double dividir() {
		return this.n1/this.n2;
	}
	
	public double resto() {
		return this.n1%this.n2;
	}
	
	public double potencia() {
		return Math.pow(this.n1, this.n2);
	}
	
	public double raiz(double n) {
		return Math.sqrt(n);
	}
	
	public double leer() {
		double l;
		String texto = JOptionPane.showInputDialog("Introducir número: ");
		l = Double.parseDouble(texto);
		return l;
	}
	
	public void visualizar() {
		JOptionPane.showMessageDialog(null, "Programa Calculadora");
	}
	
	public String leerCalculo() {
		String oper;
		oper = JOptionPane.showInputDialog("Introduce la operación que quieres hacer (A.Sumar B.Restar C.Multiplicar D.Dividir E.Resto."
			+ " F.Potencia G.Raíces cuadradas");
		/*while(oper!="A" && oper!="B" && oper!="C" && oper!="D" && oper!="E" && oper!="F" && oper!="G") {
			oper = JOptionPane.showInputDialog("Introduce la operación que quieres hacer (A.Sumar B.Restar C.Multiplicar D.Dividir E.Resto."
					+ " F.Potencia G.Raíces cuadradas");
		}*/
		return oper;
	}
	
	@Override
	public String toString() {
		return "Suma [n1=" + n1 + ", n2=" + n2 + "]";
	}

}
