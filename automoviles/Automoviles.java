package automoviles;
import javax.swing.*;
public class Automoviles {
	private int km;
	private double precio;
	private double iva;
	public Automoviles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Automoviles(int km, double precio, double iva) {
		super();
		this.km = km;
		this.precio = precio;
		this.iva = iva;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public void leerkm() {
		String numkm = JOptionPane.showInputDialog("Introduce los kilómetros recorridos");
		km = Integer.parseInt(numkm);
	}
	public double precio() {
		if(km<=300)
			precio = 130;
		else if(km>300 && km<=100)
			precio = 130+(km-300)*5;
		else
			precio = 130+700*5+(km-1000)*10;
		return precio;
	}
	public double precioiva() {
		iva = precio + (precio*0.16);
		return iva;
	}
	@Override
	public String toString() {
		return "Automoviles [km=" + km + ", precio=" + precio + ", iva=" + iva + "]";
	}

}
