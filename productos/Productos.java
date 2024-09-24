package productos;
import javax.swing.*;
public class Productos {
	private String nombre;
	private int precio;
	private char oferta;
	private int stock;
	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Productos(String nombre, int precio, char oferta, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.oferta = oferta;
		this.stock = stock;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public char getOferta() {
		return oferta;
	}
	public void setOferta(char oferta) {
		this.oferta = oferta;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int unid() {
		int unidades;
		String unid = JOptionPane.showInputDialog("Introduce el número de unidades");
		unidades = Integer.parseInt(unid);
		return unidades;
	}
	public int venta(int und) {
		if (und>stock) {
			JOptionPane.showMessageDialog(null, "Operación imposible, no hay stock suficiente");
			return 0;
		}
		else {
			int preciofinal = getPrecio()*und;
			switch(oferta) {
			case 'X':
				preciofinal -= 5;
				break;
			case 'Y':
				preciofinal -= 3;
				break;
			case 'Z':
				preciofinal -= 1;
				break;
			}
			JOptionPane.showMessageDialog(null, "Operacion disponible, el precio de la compra son "+preciofinal+" euros");
			String dinero = JOptionPane.showInputDialog("Introduce la cantidad de dinero pagado");
			int pago = Integer.parseInt(dinero);
			while(pago<preciofinal) {
				dinero = JOptionPane.showInputDialog("ERROR. Introduce un valor mayor o igual que el precio");
				pago = Integer.parseInt(dinero);
			}
			
			stock -= und;
			return (pago - preciofinal);
		}
	}
	
	public void compra(int und) {
		stock += und;
		JOptionPane.showMessageDialog(null, "Compra realizada, stock actualizado: "+stock);
	}
	
	public char continuar() {
		char cont;
		String scont = JOptionPane.showInputDialog("¿Continuar? (S/N)");
		cont = scont.charAt(0);
		cont = Character.toUpperCase(cont);
		while(cont != 'S' && cont != 'N') {
			scont = JOptionPane.showInputDialog("¿Continuar? (S/N)");
			cont = scont.charAt(0);
			cont = Character.toUpperCase(cont);
		}
		return cont;
	}
	public char nuevo() {
		char nuevo;
		String snuevo = JOptionPane.showInputDialog("¿Nuevo producto? (S/N)");
		nuevo = snuevo.charAt(0);
		nuevo = Character.toUpperCase(nuevo);
		while(nuevo != 'S' && nuevo != 'N') {
			snuevo = JOptionPane.showInputDialog("¿Nuevo producto? (S/N)");
			nuevo = snuevo.charAt(0);
			nuevo = Character.toUpperCase(nuevo);
		}
		return nuevo;
	}
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + ", oferta=" + oferta + ", stock=" + stock + "]";
	}

}
