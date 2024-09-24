package hotel;

import javax.swing.JOptionPane;
import java.time.LocalDate;
public class AppHotel {

	public static void main(String[] args) {
		LocalDate date1, date2;
		String nombre;
		int habitacion, numhab, personas;
		long dias, precio;
		Hotel h = new Hotel();
		
		String shabitacion = JOptionPane.showInputDialog("Introduce el tipo de alojamiento. 1.Habitación   2.Apartamento");
		habitacion = Integer.parseInt(shabitacion);
		while(habitacion!=1 && habitacion !=2) {
			shabitacion = JOptionPane.showInputDialog("ERROR. Introduce un tipo de alojamiento válido. 1.Habitación  2.Apartamento");
			habitacion = Integer.parseInt(shabitacion);
		}
		if(habitacion==1)
			h.setHabitacion("Habitacion");
		else
			h.setHabitacion("Apartamento");
		
		nombre = JOptionPane.showInputDialog("Introduce el nombre del cliente");
		h.setNombre(nombre);
		
		String snumhab = JOptionPane.showInputDialog("Introduce el número de habitación");
		numhab = Integer.parseInt(snumhab);
		h.setNumhabitacion(numhab);
		
		String spersonas = JOptionPane.showInputDialog("Introduce el número de personas que se alojaran");
		personas = Integer.parseInt(spersonas);
		h.setPersonas(personas);
		
		String dateString1 = JOptionPane.showInputDialog("Introduce la fecha de entrada (yyyy-mm-dd)");
	    date1 = LocalDate.parse(dateString1);
	    
	    String dateString2 = JOptionPane.showInputDialog("Introduce la fecha de salida (yyyy-mm-dd)");
	    date2 = LocalDate.parse(dateString2);
	    
	    dias = java.time.temporal.ChronoUnit.DAYS.between(date1,date2);
	    
	    h.setDias(dias);
		
		precio = h.calcularPrecio();
		
		JOptionPane.showMessageDialog(null, "El precio del alojamiento es: "+precio);

	}

}
