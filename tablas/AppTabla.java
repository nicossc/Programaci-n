package tablas;
import java.util.*;
public class AppTabla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int tabla, n, fallos=0;
		tabla t;
		t = new tabla();
		
		tabla = rd.nextInt(10)+1;
		System.out.println("Se ha seleccionado la tabla del "+tabla);
		t.setTabla(tabla);
		
		for(int i=1;i<=10;i++) {
			System.out.print(t.next());
			n=sc.nextInt();
			t.setN(n);
			if(t.result()!=true) {
				fallos++;
			}
			
		}
		
		System.out.println("Número de fallos: "+fallos);

	}

}
