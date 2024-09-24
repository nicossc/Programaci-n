package Facturas;

import javax.swing.JOptionPane;
import java.time.temporal.ChronoUnit;
import java.time.*;

public class AppCheckOut2 {
	
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
	public static int dias(){
		int daysDiff;
		boolean con1,con2;
		LocalDate dateAfter=null,dateBefore = null;
		do {
			con1=true;
			con2=true;
		while(con1) {
		try {
		    dateBefore = LocalDate.parse(JOptionPane.showInputDialog("Introduce la fecha de entrada (aaaa-mm-dd)"));
		    con1=false;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto");
			}}
		while(con2) {
			try {
				 dateAfter = LocalDate.parse(JOptionPane.showInputDialog("Introduce la fecha de salida (aaaa-mm-dd)"));
			    con2=false;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto");
				}}
		   
		    daysDiff = (int)ChronoUnit.DAYS.between(dateBefore, dateAfter);		    
		if(daysDiff<0){
			JOptionPane.showMessageDialog(null,"Orden de las fechas incorrectos");
		}else if(daysDiff==0) {
			JOptionPane.showMessageDialog(null,"La fecha de salida y la fecha de entrada no pueden ser iguales");
		}	
		}while(daysDiff<=0);
		return daysDiff;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alojamiento al = new Alojamiento();
		do {
		al.setCliente(JOptionPane.showInputDialog("Introduce el nombre del cliente"));
		al.setNhabitacion(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de habitacion")));
		al.setNpersonas(Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de personas alojadas")));
		al.setNdias(dias());
		if(tipo()) {
			al.setTipo("Habitacion "+hab());
		}else {
			al.setTipo("Apartamento "+ap()+" habitacion(es)");
		}
		JOptionPane.showMessageDialog(null,al.getCliente()+"\nDias de estancia: "+al.getNdias()+"\nTipo de alojamiento: "+al.getTipo()+"\nNumero de alojamiento: "+al.getNhabitacion()+"\nPersonas alojadas: "+al.getNpersonas()+"\nPrecio:"+al.calcularPrecio());
		}while(cont());
	}

}
