package adivinarNumero;
import java.util.*;
public class AdivinarNumero {
	Scanner sc = new Scanner(System.in);
	private int num, rd, max, min;
	private String res;

	public AdivinarNumero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdivinarNumero(int num, String res) {
		super();
		this.num = num;
		this.res = res;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int generaNumeroAleatorio(){
		rd=(int)Math.floor(Math.random()*(max-min+1)+(min));
		return rd;
	}
	public int leer() {
		System.out.println("Introduce un valor");
		num = sc.nextInt();
		return num;
	}
	public void leerMaxMin() {
		System.out.println("Introduce valor m�ximo");
		max = sc.nextInt();
		System.out.println("Introduce valor m�nimo");
		min = sc.nextInt();
		if (min>max) {
			System.out.println("ERROR. Introduce un valor m�nimo v�lido");
			min = sc.nextInt();
		}
	}
	public String respuesta() {
		if(num>rd)
			res="No has acertado, el n�mero es menor, int�ntalo de nuevo";
		else if(num<rd)
			res="No has acertado, el n�mero es mayor, int�ntalo de nuevo";
		else
			res="Has acertado el n�mero: "+num;
		return res;
	}

	@Override
	public String toString() {
		return "AdivinarNumero [num=" + num + "]";
	}

}
