package ejercicio2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Competicion {
	private int numero;
	private double marca20;
	private double marca21;
	private double marca22;
	public Competicion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Competicion(int numero, double marca20, double marca21, double marca22) {
		super();
		this.numero = numero;
		this.marca20 = marca20;
		this.marca21 = marca21;
		this.marca22 = marca22;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getMarca20() {
		return marca20;
	}
	public void setMarca20(double marca20) {
		this.marca20 = marca20;
	}
	public double getMarca21() {
		return marca21;
	}
	public void setMarca21(double marca21) {
		this.marca21 = marca21;
	}
	public double getMarca22() {
		return marca22;
	}
	public void setMarca22(double marca22) {
		this.marca22 = marca22;
	}
	public void visualizar(String[] num, String[] marcas, double[][] part) {
		System.out.print("       ");
		for(int i=0;i<marcas.length;i++) {
			System.out.print(marcas[i]+"  ");
		}
		System.out.println();
		for(int i=0;i<num.length-1;i++) {
			System.out.print(num[i]+"   ");
			for(int j=0;j<part[i].length;j++) {
				System.out.print(part[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.print(num[4]+"   ");
		for(int j=0;j<part[0].length;j++) {
			System.out.print(part[4][j]+"   ");
		}
		System.out.println();
		System.out.println();
	}
	public void mejorMarca(String[] num, double[][] part) {
		double max; 
		for(int i = 0; i < part.length; i++) {
			max = 0;
			for (int j = 0; j < part[i].length; j++) {
				 if(part[i][j]>max) {
					 max=part[i][j];
				 }
			}
			System.out.println("Mejor marca de "+num[i]+": "+max);
		}
		System.out.println();
		System.out.println();
	}
	public void mediaMarcas(String[] num, double[][] part) {
		DecimalFormat df = new DecimalFormat("###0.00");
		Scanner sc = new Scanner(System.in);
		int d;
		System.out.println("Introduce el numero del dorsal:"
				+"\n1.D111"
				+"\n2.D222"
				+"\n3.D333"
				+"\n4.D444"
				+"\n5.D555");
		d=sc.nextInt();
		while(d<1 || d>5) {
			System.out.println("Número erróneo, introduce otro");
			d=sc.nextInt();
		}
		d-=1;
		double sum=0;
		for(int j = 0; j < part[d].length; j++) {
			sum += part[d][j];
		}
			System.out.print("Marca media del dorsal "+num[d]+": ");
			System.out.print(df.format(sum/part[0].length));
			System.out.println();
			System.out.println();
	}

}
