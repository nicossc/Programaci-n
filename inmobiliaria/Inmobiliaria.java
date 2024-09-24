package inmobiliaria;

import javax.swing.JOptionPane;

public class Inmobiliaria {
	private int forma, medida, valorm2, descuento;

	public Inmobiliaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inmobiliaria(int forma, int medida, int valorm2, int descuento) {
		super();
		this.forma = forma;
		this.medida = medida;
		this.valorm2 = valorm2;
		this.descuento = descuento;
	}

	public int getForma() {
		return forma;
	}

	public void setForma(int forma) {
		this.forma = forma;
	}

	public int getMedida() {
		return medida;
	}

	public void setMedida(int medida) {
		this.medida = medida;
	}

	public int getValorm2() {
		return valorm2;
	}

	public void setValorm2(int valorm2) {
		this.valorm2 = valorm2;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	public void descuento() {
		if(medida>=120 && medida<=150)
			descuento = 5;
		else if(medida>=151 && medida<=170)
			descuento = 10;
		else if(medida>=171 && medida<=200)
			descuento = 15;
		else descuento = 0;
	}
	
	public void precio() {
		float precio = medida * valorm2;
		precio = precio - (precio * descuento / 100);
		System.out.println(precio);
	}

	@Override
	public String toString() {
		return "Inmobiliaria [forma=" + forma + ", medida=" + medida + ", valorm2=" + valorm2 + ", descuento="
				+ descuento + "]";
	}

}
