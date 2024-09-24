package salario;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Salario {
	Scanner sc = new Scanner(System.in);
	private int horas;
	private double salario;
	private double impuestos;
	private String nombre;
	public Salario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salario(int horas, double salario, double impuestos) {
		super();
		this.horas = horas;
		this.salario = salario;
		this.impuestos = impuestos;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getImpuestos() {
		return impuestos;
	}
	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double salario() {
		int horasExtras;
		if(horas>35) {
			horasExtras = horas-35;
			salario = 35*50+horasExtras*35*1.5;
		}
		else {
			salario = horas*50;
		}
		return salario;
	}
	public double impuesto() {
		if(salario<20000)
			salario = salario*20/100;
		return salario;
	}
	public int leer() {
		String nom = JOptionPane.showInputDialog("Introduce el nombre del trabajador");
		nombre = nom;
		String numhoras = JOptionPane.showInputDialog("Introduce las horas trabajadas");
		horas = Integer.parseInt(numhoras);
		return horas;
	}
	public boolean continuar() {
		String cont = JOptionPane.showInputDialog("¿Continuar? (S/N)");
		char conti = cont.charAt(0);
		conti = Character.toUpperCase(conti);
		while(conti!='S' && conti!='N') {
			cont = JOptionPane.showInputDialog("ERROR. ¿Continuar? (S/N)");
			conti = cont.charAt(0);
			conti = Character.toUpperCase(conti);
		}
		if(conti == 'S')
			return true;
		else return false;
	}
	@Override
	public String toString() {
		return "Salario [horas=" + horas + ", salario=" + salario + ", impuestos=" + impuestos + "]";
	}

}

