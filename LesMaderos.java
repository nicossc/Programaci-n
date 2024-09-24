package matrices;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LesMaderos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] maderos = {"Caoba", "Cedro", "Roble", "Nogal", "Teca"};
		String[] medidas =  {"3mm", "5mm", "7mm", "10mm"};
		double[][] precios =  {
			{2.5, 3.5, 4.5, 5.5, 6.5},
			{1.5, 2.3, 3.4, 5.4, 7.2},
			{1.5, 2.3, 4.3, 4.5, 6.2},
			{3.5, 2.5, 3.5, 6.5, 4.2}
		};
		visualizar(maderos, medidas, precios);
		valorMedio(precios, maderos, medidas);
	}
	
	public static void visualizar(String[] tipos, String[] medidas, double[][] precios) {
		System.out.print("     ");
		for(int i=0;i<tipos.length;i++) {
			System.out.print(tipos[i]+" ");
		}
		System.out.println();
		for(int i=0;i<medidas.length-1;i++) {
			System.out.print(medidas[i]+"   ");
			for(int j=0;j<precios[i].length;j++) {
				System.out.print(precios[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.print(medidas[3]+"  ");
		for(int j=0;j<=precios.length;j++) {
			System.out.print(precios[3][j]+"   ");
		}
		System.out.println();
		System.out.println();
	}
	
	public static void valorMedio(double[][] precios, String[] tipos, String[] medidas) {
		DecimalFormat df = new DecimalFormat("###0.00");
		double s;
		int menor=10;
		double[] suma = new double[5];
		for (int j = 0; j < precios[0].length; j++) {
			s=0;
			 for (int i = 0; i < precios.length; i++) {
				 s+=precios[i][j];
			 }
			 suma[j] = s;
		}
		for(int i = 0; i < suma.length; i++) {
			System.out.print("Precio medio de la madera "+tipos[i]+": ");
			System.out.print(df.format(suma[i]/4));
			System.out.println();
			if((suma[i]/4)<menor) {
				menor=i;
			}
		}
		double tmp;
		for(int i = 0; i < precios.length; i++) {
			tmp = 0;
			for(int j = 0; j < precios[i].length; j++) {
				tmp += precios[i][j];
			}
			System.out.print("Precio medio del espesor "+medidas[i]+": ");
			System.out.print(df.format(tmp/5));
			System.out.println();
		}
		System.out.println();
		System.out.print("La madera con precio medio más barato es la "+tipos[menor]+" y su precio medio es: "+df.format(suma[menor]/4));
		
	}

}
