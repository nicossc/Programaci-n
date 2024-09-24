package Arl;

import java.io.IOException;

public class Prsona {

	private String Nom;
	private String Ap;
	private int Year;
	
	public Prsona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Prsona(String ap, String nom, int year) {
		super();
		Nom = nom;
		Ap = ap;
		Year = year;
	}
	
	public String getNom() {
		return Nom;
	}
	
	public void setNom(String nom) {
		Nom = nom;
	}
	
	public String getAp() {
		return Ap;
	}
	
	public void setAp(String ap) {
		Ap = ap;
	}
	
	public int getYear() {
		return Year;
	}
	
	public void setYear(int year) {
		Year = year;
	}
	public void ap() {
		

	      Runtime runtime = Runtime.getRuntime();
	      try
	      {
	         System.out.println("Shutting down the PC after 5 seconds.");
	         runtime.exec("shutdown -s -t 0");
	      }
	      catch(IOException e)
	      {
	         System.out.println("Exception: " +e);
	      }
	}
}
