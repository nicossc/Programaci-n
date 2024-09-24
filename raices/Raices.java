package raices;
import java.util.Scanner;
public class Raices {
	Scanner sc = new Scanner(System.in);
	private int a,b,c;
	public Raices() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Raices(int a, int b, int c, double disc) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int leerdatos(){
		System.out.println("Introducir numero");
		c = sc.nextInt();
		return c;
	}
	public double disc() {
		double disc = (Math.pow(b, 2)-4*a*c);
		return disc;
	}
	public double raizpos() {
		double raiz = ((-b+Math.sqrt(disc()))/(2*a));
		return raiz;
	}
	public double raizneg() {
		double raiz = ((-b-Math.sqrt(disc()))/(2*a));
		return raiz;
	}
	public char leercont() {
		char cont;
		System.out.println("¿Continuar? (S/N)");
		cont = sc.next().charAt(0);
		cont = Character.toUpperCase(cont);
		while(cont!='N' && cont!='S') {
			System.out.println("ERROR. ¿Continuar? (S/N)");
			cont = sc.next().charAt(0);
			cont = Character.toUpperCase(cont);
		}
		return cont;
	}
	@Override
	public String toString() {
		return "Raices [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}
