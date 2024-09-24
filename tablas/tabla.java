package tablas;
import java.util.Scanner;
public class tabla {
	private int tabla;
	private int num=0;
	private int n;
	private boolean res;
	public tabla(int tabla, int num) {
		super();
		this.tabla = tabla;
		this.num = num;
	}
	
	public int getTabla() {
		return tabla;
	}
	public void setTabla(int tabla) {
		this.tabla = tabla;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public tabla() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String next() {
		num++;
		String next = tabla+" x "+num+" = ";
		return next;
	}
	public boolean result() {
		if(tabla*num==n)
			res=true;
		else
			res=false;
		return res;
	}
	
	@Override
	public String toString() {
		return "Tabla [tabla=" + tabla + ", num=" + num + "]";
	}

}
