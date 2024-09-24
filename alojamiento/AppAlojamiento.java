package alojamiento;

import javax.swing.JOptionPane;

public class AppAlojamiento {

	public static void main(String[] args) {
		String nombre, habitacion;
		int numhab, i=0, numarray, array;
		long dias, precio = 0;
		char cont;
		Alojamiento a = new Alojamiento();
		Alojamiento hotel[]=new Alojamiento[100];
		
		do{
			nombre = JOptionPane.showInputDialog("Introduce el nombre del cliente");
			a.setNombre(nombre);
		
			String snumhab = JOptionPane.showInputDialog("Introduce el número de habitación");
			numhab = Integer.parseInt(snumhab);
			a.setNumhabitacion(numhab);
		
			String sdias = JOptionPane.showInputDialog("Introduce el número de días");
			dias = Integer.parseInt(sdias);
			a.setDias(dias);
			
			habitacion=a.tipo_habitacion();
			
			hotel[i]=new Alojamiento(habitacion,nombre,numhab,dias);
			
			i++;
			String scont = JOptionPane.showInputDialog("¿Nuevo cliente? (S/N)");
			cont = scont.charAt(0);
			cont = Character.toUpperCase(cont);
			while(cont!='S' && cont!='N') {
				scont = JOptionPane.showInputDialog("ERROR. ¿Nuevo cliente? (S/N)");
				cont = scont.charAt(0);
				cont = Character.toUpperCase(cont);
			}
		}while(cont=='S');
		
		do{
			array = 0;
			String sarray = JOptionPane.showInputDialog("Introduce el número de habitación");
			numarray = Integer.parseInt(sarray);
			for(int j = 1; j < i; j++) {
				if(numarray == hotel[j].getNumhabitacion()) {
					array = j;
				}
			}
			precio = hotel[array].precio();
			JOptionPane.showMessageDialog(null, "Cliente: "+hotel[array].getNombre()
					+"\nTipo de habitación: "+hotel[array].getHabitacion()
					+"\nNúmero de habitación: "+hotel[array].getNumhabitacion()
					+"\nDías de estancia: "+hotel[array].getDias()
					+"\nPrecio por día: "+precio
					+"\nPrecio final: "+(precio*hotel[array].getDias()));
			String scont = JOptionPane.showInputDialog("¿Imprimir nueva factura? (S/N)");
			cont = scont.charAt(0);
			cont = Character.toUpperCase(cont);
			while(cont!='S' && cont!='N') {
				scont = JOptionPane.showInputDialog("ERROR. ¿Imprimir nueva factura? (S/N)");
				cont = scont.charAt(0);
				cont = Character.toUpperCase(cont);
			}
		}while(cont=='S');
		
	}

}
