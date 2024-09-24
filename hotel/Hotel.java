package hotel;

import javax.swing.JOptionPane;

public class Hotel {
	private String habitacion, nombre;
	private int numhabitacion, personas;
	private long dias;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String habitacion, String nombre, int numhabitacion, int personas, long dias) {
		super();
		this.habitacion = habitacion;
		this.nombre = nombre;
		this.numhabitacion = numhabitacion;
		this.personas = personas;
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
	public int getPersonas() {
		return personas;
	}
	public void setPersonas(int personas) {
		this.personas = personas;
	}
	public long getDias() {
		return dias;
	}
	public void setDias(long dias) {
		this.dias = dias;
	}
	
	public long calcularPrecio() {
		if(habitacion=="Habitacion") {
			String tipo = JOptionPane.showInputDialog("Introduce el tipo de habitación. 1.Simple  2.Doble");
			int hab = Integer.parseInt(tipo);
			while(hab!=1 && hab!=2) {
				tipo = JOptionPane.showInputDialog("ERROR. Introduce un tipo de habitación válido. 1.Simple  2.Doble");
				hab = Integer.parseInt(tipo);
			}
			if(hab==1)
				return 40*this.dias;
			else
				return 65*this.dias;
		}
		else {
			String tipo = JOptionPane.showInputDialog("Introduce el número de habitaciones. 1 o 2");
			int hab = Integer.parseInt(tipo);
			while(hab!=1 && hab!=2) {
				tipo = JOptionPane.showInputDialog("ERROR. Introduce un número de habitaciones válido. 1 o 2");
				hab = Integer.parseInt(tipo);
			}
			if(hab==1)
				return 80*this.dias;
			else
				return 90*this.dias;
		}
	}
	
	@Override
	public String toString() {
		return "Hotel [habitacion=" + habitacion + ", nombre=" + nombre + ", numhabitacion=" + numhabitacion + ", personas=" + personas
				+ ", dias=" + dias + "]";
	}

}
