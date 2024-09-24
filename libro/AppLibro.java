package libro;

public class AppLibro {

	public static void main(String[] args) {
		int l;
		char c;
		Libro libro1, libro2;
		libro1 = new Libro("El Quijote", "Cervantes", 1, 0);
		libro2 = new Libro("Problemas de Java", "Jose María Pérez", 4, 2);
		
		System.out.println(libro1.toString());
		
		if(libro1.devolucion())
			System.out.println("Se ha devuelto el libro "+libro1.getTitulo());
		else
			System.out.println("No se puede devolver el libro "+libro1.getTitulo());
		
		if(libro1.prestamo())
			System.out.println("Se ha prestado el libro "+libro1.getTitulo());
		else
			System.out.println("No se puede prestar el libro "+libro1.getTitulo());
		
		if(libro1.devolucion())
			System.out.println("Se ha devuelto el libro "+libro1.getTitulo());
		else
			System.out.println("No se puede devolver el libro "+libro1.getTitulo());
		
		System.out.println(libro1.toString());
		
		System.out.println(libro2.toString());
		
		if(libro2.devolucion())
			System.out.println("Se ha devuelto el libro "+libro2.getTitulo());
		else
			System.out.println("No se puede devolver el libro "+libro2.getTitulo());
		
		if(libro2.prestamo())
			System.out.println("Se ha prestado el libro "+libro2.getTitulo());
		else
			System.out.println("No se puede prestar el libro "+libro2.getTitulo());
		
		if(libro2.prestamo())
			System.out.println("Se ha prestado el libro "+libro2.getTitulo());
		else
			System.out.println("No se puede prestar el libro "+libro2.getTitulo());
		
		System.out.println(libro2.toString());
	}

}
