package productos;

import javax.swing.JOptionPane;

public class AppProducto {

	public static void main(String[] args) {
		String nombre;
		int precio, stock, unidades;
		char oferta, oper;
		int vuelta;
		Productos p;
		p = new Productos();
		do {
			nombre = JOptionPane.showInputDialog("Introducir nombre del producto: ");
			p.setNombre(nombre);
			String sprecio = JOptionPane.showInputDialog("Introducir precio por unidad: ");
			precio = Integer.parseInt(sprecio);
			p.setPrecio(precio);
			String soferta = JOptionPane.showInputDialog("Introducir tipo de oferta (X, Y, Z): ");
			oferta = soferta.charAt(0);
			oferta = Character.toUpperCase(oferta);
			while(oferta != 'X' && oferta != 'Y' && oferta!='Z') {
				soferta = JOptionPane.showInputDialog("ERROR. Introducir el tipo de oferta (X, Y, Z): ");
				oferta = soferta.charAt(0);
				oferta = Character.toUpperCase(oferta);
			}
			p.setOferta(oferta);
			String sstock = JOptionPane.showInputDialog("Introducir stock: ");
			stock = Integer.parseInt(sstock);
			p.setStock(stock);
		
			do {
				String soper = JOptionPane.showInputDialog("Introduce operación (C. Compra     V. Venta)");
				oper = soper.charAt(0);
				oper = Character.toUpperCase(oper);
				while(oper != 'C' && oper != 'V') {
					soper = JOptionPane.showInputDialog("ERROR. Introduce operación válida (C. Compra     V. Venta)");
					oper = soper.charAt(0);
					oper = Character.toUpperCase(oper);
				}
				if(oper == 'C') {
					unidades = p.unid();
					p.compra(unidades);
				}
				else {
					unidades = p.unid();
					vuelta = p.venta(unidades);
					vuelta(vuelta);
				}
			
			}while(p.continuar()=='S');
			
		}while(p.nuevo()=='S');

	}

public static void vuelta(int DineroCliente){

	int B500=0, B200=0, B100=0, B50=0, B20=0, B10=0, B5=0, M2=0, M1=0;

	if(DineroCliente >= 500) {
	B500=(int) DineroCliente / 500;
	DineroCliente= DineroCliente % 500;
	JOptionPane.showMessageDialog(null, "Billetes de 500€= "+B500);
	}
	if(DineroCliente >= 200) {
	B200=(int) DineroCliente / 200;
	DineroCliente= DineroCliente % 200;
	JOptionPane.showMessageDialog(null, "Billetes de 200€= "+B200);
	}
	if(DineroCliente >= 100) {
	B100=(int) DineroCliente / 100;
	DineroCliente= DineroCliente % 100;
	JOptionPane.showMessageDialog(null, "Billetes de 100€= "+B100);
	}
	if(DineroCliente >= 50) {
	B50=(int) DineroCliente / 50;
	DineroCliente= DineroCliente % 50;
	JOptionPane.showMessageDialog(null, "Billetes de 50€= "+B50);
	}
	 if(DineroCliente >= 20) {
	B20=(int) DineroCliente / 20;
	DineroCliente= DineroCliente % 20;
	JOptionPane.showMessageDialog(null, "Billetes de 20€= "+B20);
	}
	 if(DineroCliente >= 10) {
	B10=(int) DineroCliente / 10;
	DineroCliente= DineroCliente % 10;
	JOptionPane.showMessageDialog(null, "Billetes de 10€= "+B10);
	}
	 if(DineroCliente >= 5) {
	B5=(int) DineroCliente / 5;
	DineroCliente= DineroCliente % 5;
	JOptionPane.showMessageDialog(null, "Billetes de 5€= "+B5);
	}
	 if(DineroCliente >= 2) {
	M2=(int) DineroCliente / 2;
	DineroCliente= DineroCliente % 2;
	JOptionPane.showMessageDialog(null, "Monedas de 2€= "+M2);
	}
	 if(DineroCliente >= 1) {
	M1=(int) DineroCliente / 1;
	DineroCliente= DineroCliente % 1;
	JOptionPane.showMessageDialog(null, "Monedas de 1€= "+M1);
	 }
}
}
