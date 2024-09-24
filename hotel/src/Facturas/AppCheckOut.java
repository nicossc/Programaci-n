package Facturas;

import javax.swing.JOptionPane;

public class AppCheckOut {
	
	public static boolean cont() {
		String t=JOptionPane.showInputDialog("Deseas continuar? (S|N)");
		char con=Character.toUpperCase(t.charAt(0));
		while (con!='S' && con!='N') {
			t=JOptionPane.showInputDialog("ERROR!\nDeseas continuar? (S|N)");
			con=Character.toUpperCase(t.charAt(0));
		}
		if (con=='S') {
			return true;
		}else {
			return false;
		}
	}
	
	public static String hab() {
		String t=JOptionPane.showInputDialog("Introduce el tipo de habitacion\n1.Simple\n2.Doble");
		int m=Integer.parseInt(t);
		while (m!=1 && m!=2) {
			t=JOptionPane.showInputDialog("ERROR!\nIntroduce el tipo de habitacion\n1.Simple\n2.Doble");
			m=Integer.parseInt(t);
		}
		if (m==1) {
			return "Simple";
		}else {
			return "Doble";
		}
	}

	public static boolean tipo() {
		String t=JOptionPane.showInputDialog("Introduce el tipo de alojamiento\n1.Habitacion\n2.Apartamento");
		int m=Integer.parseInt(t);
		while (m!=1 && m!=2) {
			t=JOptionPane.showInputDialog("ERROR!\nIntroduce el tipo de alojamiento\n1.Habitacion\n2.Apartamento");
			m=Integer.parseInt(t);
		}
		if (m==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int ap() {
		String t=JOptionPane.showInputDialog("Introduce el numero de habitaciones\n1\n2");
		int m=Integer.parseInt(t);
		while (m!=1 && m!=2) {
			t=JOptionPane.showInputDialog("ERROR!\nIntroduce el numero de habitaciones\n1\n2");
			m=Integer.parseInt(t);
		}
			return m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alojamiento al = new Alojamiento();
		do {
		al.setCliente(JOptionPane.showInputDialog("Introduce el nombre del cliente"));
		al.setNhabitacion(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de habitacion")));
		al.setNpersonas(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de personas alojadas")));
		al.setNdias(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de dias")));
		if(tipo()) {
			al.setTipo("Habitacion "+hab());
		}else {
			al.setTipo("Apartamento "+ap()+" habitacion(es)");
		}
		JOptionPane.showMessageDialog(null,al.getCliente()+"\nDias de estancia: "+al.getNdias()+"\nTipo de alojamiento: "+al.getTipo()+"\nNumero de alojamiento: "+al.getNhabitacion()+"\nPersonas alojadas: "+al.getNpersonas()+"\nPrecio:"+al.calcularPrecio());
		}while(cont());
	}

}
