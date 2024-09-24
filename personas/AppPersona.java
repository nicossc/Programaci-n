package personas;

public class AppPersona {

	public static void main(String[] args) {
		Persona p1, p2;
		
		p1 = new Persona("Fernando", "Fernández Fernández", 31);
		System.out.println("Nombre: "+p1.getNombre()+" Apellidos: "+p1.getApellidos()+" Edad: "+p1.getEdad());
		p2 = new Persona("Gonzalo", "González González", 23);
		System.out.println("Nombre: "+p2.getNombre()+" Apellidos: "+p2.getApellidos()+" Edad: "+p2.getEdad());
		
		if(p1.getEdad()>p2.getEdad())
			System.out.println("Edad Mayor: "+p1.getEdad());
		else
			System.out.println("Edad Mayor: "+p2.getEdad());
		
	}

}
