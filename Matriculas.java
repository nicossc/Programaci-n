package matrices;

public class Matriculas {

	public static void main(String[] args) {
		String[] ciclos = {"DAW", "ASIR", "DAM"};
		String[] modulos = {"LMSGI", "PROG", "ENDES", "FOL", "LEUPR"};
		int[][] alumnos =  {
				{30, 10, 20, 15, 10},
				{30, 20, 10, 5, 3},
				{10, 20, 10, 20, 20},
			};
		System.out.println("El total de alumnos matriculados en el centro es de: "+totalAlumnos(alumnos));
		System.out.println();
		alumnosAsignaturas(alumnos);
		System.out.println();
		visualizarCiclos(alumnosCiclos(alumnos), ciclos);
		System.out.println();
		visualizarAsignatura(alumnosAsignaturas(alumnos), modulos, mayorAsignatura(alumnosAsignaturas(alumnos)));

	}
	
	public static int totalAlumnos(int[][] alumnos) {
		int a=0;
		for(int i = 0; i < alumnos.length; i++) {
			for(int j = 0; j < alumnos[0].length; j++) {
				a += alumnos[i][j];
			}
		}
		return a;
	}
	
	public static int[] alumnosAsignaturas(int[][] alumnos) {
		int[] datos = new int[5];
		int suma;
		for(int j = 0; j < alumnos[0].length; j++) {
			suma=0;
			for(int i = 0; i < alumnos.length; i++) {
				suma += alumnos[i][j];
			}
			datos[j] = suma;
		}
		return datos;
	}
	
	public static int mayorAsignatura(int[] datos) {
		int mayor = 0, mayorpos = 0;
		for(int i = 0; i < datos.length; i++) {
			if(datos[i] > mayor) {
				mayor = datos[i];
				mayorpos = i;
			}
		}
		return mayorpos;
	}
	
	public static void visualizarAsignatura(int[] datos, String[] modulos, int mayorpos) {
		for(int i = 0; i < datos.length; i++) {
			System.out.println("Número de alumnos de "+modulos[i]+": "+datos[i]);
		}
		System.out.println("La asignatura con mayor número de alumnos es "+modulos[mayorpos]+" con "+datos[mayorpos]+" alumnos");
	}
	
	public static int[] alumnosCiclos(int[][] alumnos) {
		int[] datos = new int[3];
		int suma;
		for(int i = 0; i < alumnos.length; i++) {
			suma=0;
			for(int j = 0; j < alumnos[0].length; j++) {
				suma += alumnos[i][j];
			}
			datos[i] = suma;
		}
		return datos;
	}
	
	public static void visualizarCiclos(int[] datos, String[] ciclos) {
		for(int i = 0; i < datos.length; i++) {
			System.out.println("Número de alumnos en "+ciclos[i]+": "+datos[i]);
		}
	}

}
