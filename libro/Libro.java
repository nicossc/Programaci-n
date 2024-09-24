package libro;
import java.util.*;
public class Libro {
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numPrestados;
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numPrestados = numPrestados;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumEjemplares() {
		return numEjemplares;
	}
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	public int getNumPrestados() {
		return numPrestados;
	}
	public void setNumPrestados(int numPrestados) {
		this.numPrestados = numPrestados;
	}
	public boolean prestamo() {
		if (this.numPrestados<this.numEjemplares) {
			this.numPrestados++;
			return true;
		}
		else
			return false;
	}
	public boolean devolucion() {
		if(this.numPrestados==0) {
			return false;
		}
		else {
			numPrestados--;
			return true;
		}
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numEjemplares=" + numEjemplares + ", numPrestados="
				+ numPrestados + "]";
	}

}
