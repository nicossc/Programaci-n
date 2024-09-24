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
			System.out.println("Hay 2 raíces para esta ecuación");
			System.out.println("Primera Raíz: "+r.raizpos());
			System.out.println("Segunda Raíz: "+r.raizneg());
		}
		else if(r.disc()==0)
			System.out.println("Hay 2 raíces iguales para esta ecuación: "+r.raizpos()+" y "+r.raizneg());
		else
			System.out.println("Esta ecuación no tiene raíces reales");
		
		cont = r.leercont();
		
		}while(cont=='S');

	}

}
