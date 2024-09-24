package automoviles;

import javax.swing.JOptionPane;

public class AppAutomoviles {

	public static void main(String[] args) {
		int km;
		double precio, iva;
		Automoviles a;
		a = new Automoviles();
		
		a.leerkm();
		JOptionPane.showMessageDialog(null, "El precio correspondiente equivale a "+a.precio()+" euros");
		JOptionPane.showMessageDialog(null, "El precio final tras aplicar impuestos es "+a.precioiva());

	}

}
