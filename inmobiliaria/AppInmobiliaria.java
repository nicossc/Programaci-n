package inmobiliaria;

import javax.swing.JOptionPane;

public class AppInmobiliaria {

	public static void main(String[] args) {
		int forma, medida, valor, descuento;
		Inmobiliaria i = new Inmobiliaria();
		
		String sforma = JOptionPane.showInputDialog("Selecciona opción:  1.Cuadrado  2.Circulo");
		forma = Integer.parseInt(sforma);
		i.setForma(forma);
		String smedida = JOptionPane.showInputDialog("Introduce medidas: ");
		medida = Integer.parseInt(smedida);
		i.setMedida(medida);
		String svalor = JOptionPane.showInputDialog("Introduce el valor del metro cuadrado: ");
		valor = Integer.parseInt(svalor);
		i.setValorm2(valor);
		
		

	}

}
