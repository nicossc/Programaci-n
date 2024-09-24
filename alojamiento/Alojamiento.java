package alojamiento;

import javax.swing.JOptionPane;

public class Alojamiento {
	private String habitacion;
	private String nombre;
	private int numhabitacion;
	private long dias;
	public Alojamiento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alojamiento(String habitacion, String nombre, int numhabitacion, long dias) {
		super();
		this.habitacion = habitacion;
		this.nombre = nombre;
		this.numhabitacion = numhabitacion;
		this.dias = dias;
	}
	public String getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumhabitacion() {
		return numhabitacion;
	}
	public void setNumhabitacion(int numhabitacion) {
		this.numhabitacion = numhabitacion;
	}
	public long getDias() {
		return dias;
	}
	public void setDias(long dias) {
		this.dias = dias;
	}
	public String tipo_habitacion() {
		String tipo = JOptionPane.showInputDialog("Introduce el tipo de habitación. 1.Simple  2.Doble  3.Triple  4.Quad "
				+ " 5.Queen  6.King  7.Twin  8.Doble-Doble  9.Estudio");
		int hab = Integer.parseInt(tipo);
		while(hab!=1 && hab!=2 && hab!=3 && hab!=4 && hab!=5 && hab!=6 && hab!=7 && hab!=8 && hab!=9) {
			tipo = JOptionPane.showInputDialog("ERROR. Introduce un tipo de habitación válido. 1.Simple  2.Doble  3.Triple  4.Quad "
					+ " 5.Queen  6.King  7.Twin  8.Doble-Doble  9.Estudio");
			hab = Integer.parseInt(tipo);
		}
		String[] habi = {"Simple", "Doble", "Triple", "Quad", "Queen", "King", "Twin", "Doble-Doble", "Estudio"};
		for(int i = 0; i < habi.length; i++) {
			if(hab == i) {
				habitacion = habi[i-1];
			}
		}
		return habitacion;
	}
	
	public int precio() {
		int precio = 1;
		String[] habi = {"Simple", "Doble", "Triple", "Quad", "Queen", "King", "Twin", "Doble-Doble", "Estudio"};
		int[] prec = {70, 90, 110, 120, 70, 80, 90, 70, 120};
		for(int i = 0; i < habi.length; i++) {
			if(this.habitacion.equals(habi[i])) {
				precio = prec[i];
			}
		}
		return precio;
	}

}
