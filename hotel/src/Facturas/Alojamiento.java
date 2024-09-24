package Facturas;

public class Alojamiento {
private String tipo;
private int nhabitacion;
private String cliente;
private int npersonas;
private int ndias;

public Alojamiento() {
	super();
	// TODO Auto-generated constructor stub
}

public Alojamiento(String tipo, int nhabitacion, String cliente, int npersonas, int ndias) {
	super();
	this.tipo = tipo;
	this.nhabitacion = nhabitacion;
	this.cliente = cliente;
	this.npersonas = npersonas;
	this.ndias = ndias;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public int getNhabitacion() {
	return nhabitacion;
}

public void setNhabitacion(int nhabitacion) {
	this.nhabitacion = nhabitacion;
}

public String getCliente() {
	return cliente;
}

public void setCliente(String cliente) {
	this.cliente = cliente;
}

public int getNpersonas() {
	return npersonas;
}

public void setNpersonas(int npersonas) {
	this.npersonas = npersonas;
}

public int getNdias() {
	return ndias;
}

public void setNdias(int ndias) {
	this.ndias = ndias;
}

public int calcularPrecio() {
	int preciodia=0;
	switch(tipo){
	case "Habitacion Simple":
		preciodia=40;
		break;
	case "Habitacion Doble":
		preciodia=65;
		break;
	case "Apartamento 1 habitacion(es)":
		preciodia=80;
		break;
	case "Apartamento 2 habitacion(es)":
		preciodia=90;
		break;
	}
	return preciodia*ndias;
}




}
