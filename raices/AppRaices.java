package raices;

public class AppRaices {

	public static void main(String[] args) {
		int a, b, c;
		char cont;
		Raices r;
		r = new Raices();
		
		do {
		a=r.leerdatos();
		r.setA(a);
		b=r.leerdatos();
		r.setB(b);
		c=r.leerdatos();
		r.setC(c);
		
		System.out.println("Discriminante = "+r.disc());
		
		if(r.disc()>0) {
			System.out.println("Hay 2 ra�ces para esta ecuaci�n");
			System.out.println("Primera Ra�z: "+r.raizpos());
			System.out.println("Segunda Ra�z: "+r.raizneg());
		}
		else if(r.disc()==0)
			System.out.println("Hay 2 ra�ces iguales para esta ecuaci�n: "+r.raizpos()+" y "+r.raizneg());
		else
			System.out.println("Esta ecuaci�n no tiene ra�ces reales");
		
		cont = r.leercont();
		
		}while(cont=='S');

	}

}
