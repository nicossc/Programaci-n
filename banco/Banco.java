package banco;

public class Banco {
	private String nombre;
	private String numCuenta;
	private double saldo;
	private String dni;
	private String pin;
	public Banco() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Banco(String nombre, String numCuenta, double saldo, String dni, String pin) {
		super();
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.dni = dni;
		this.pin = pin;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public double ingresar(double ingreso) {
		this.saldo = this.saldo+ingreso;
		return saldo;
	}
	public boolean compRetirar(double retirar) {
		if(this.saldo-retirar<0)
			return false;
		else
			return true;
	}
	public double retirar(double retirar) {
		this.saldo = this.saldo-retirar;
		return saldo;
	}
	public boolean compPin(String pin) {
		if(this.pin.equals(pin))
			return true;
		else
			return false;
	}
	
	public static String getContraseña(String key) {
		String pswd = "";
		
		for (int i = 0; i < key.length(); i++) {
			pswd+=(key.charAt((int)(Math.random() * key.length())));
		}
 
		return pswd;
	}
	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", numCuenta=" + numCuenta + ", saldo=" + saldo + "]";
	}

}
