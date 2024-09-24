package numeros;
import java.util.Scanner;
public class Numeros {
	private int num;
	private boolean par;
	private boolean mult5;
	private boolean perfecto;
	private int suma;
	
	public Numeros() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Numeros(int num, boolean par, boolean mult5, boolean perfecto) {
		super();
		this.num = num;
		this.par = par;
		this.mult5 = mult5;
		this.perfecto = perfecto;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isPar() {
		return par;
	}
	public void setPar(boolean par) {
		this.par = par;
	}
	public boolean isMult5() {
		return mult5;
	}
	public void setMult5(boolean mult5) {
		this.mult5 = mult5;
	}
	public boolean isPerfecto() {
		return perfecto;
	}
	public void setPerfecto(boolean perfecto) {
		this.perfecto = perfecto;
	}
	public boolean compPar() {
		if(num%2==0)
			return true;
		else
			return false;
	}
	public boolean compMult5() {
		if(num%5==0)
			return true;
		else
			return false;
	}
	public boolean compPerfecto() {
		suma=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				suma+=i;
		}
		if(num==suma)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "Numeros [num=" + num + ", par=" + par + ", mult5=" + mult5 + ", perfecto=" + perfecto + "]";
	}

}