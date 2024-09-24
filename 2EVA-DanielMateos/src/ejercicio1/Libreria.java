package ejercicio1;

public class Libreria {
	private String isbn;
	private int year;
	private double precio1;
	private double precio2;
	public Libreria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libreria(String isbn, int year, double precio1, double precio2) {
		super();
		this.isbn = isbn;
		this.year = year;
		this.precio1 = precio1;
		this.precio2 = precio2;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrecio1() {
		return precio1;
	}
	public void setPrecio1(double precio1) {
		this.precio1 = precio1;
	}
	public double getPrecio2() {
		return precio2;
	}
	public void setPrecio2(double precio2) {
		this.precio2 = precio2;
	}
	public void actualizar() {
		if(this.year == 2022 || this.year == 2023)
			this.precio2 += (precio2*0.1);
		else
			this.precio2 += (precio2*0.2);
		System.out.println("Precios actualizados con éxito");
	}
	public boolean consultar(int anio, boolean exist) {
		if(this.year == anio) {
			System.out.println("ISBN: "+this.isbn);
			System.out.println("Antigüedad: "+(2023-this.year));
			exist=true;
		}
		return exist;
	}

}
