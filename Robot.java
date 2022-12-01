package Tdpod;
import java.util.Scanner;
public class Robot {
	protected String nom="";
	private int pv=10;

	public Robot() {
		nom="bob";
		pv=10;
	}
	public Robot(String nom,int pv) {
		nom=nom;
		pv=pv;
	}
	public String getnom() {
		return nom;
	}
	public int getpv() {
		return pv;
	}
	public void setnom(String n) {
		nom=n;
	}
	public void setpv(int p) {
		pv=p;
	}
	public int Fire() {
		return 2;
	}
	public String toString() {
		return "pv du robot = "+pv+"\nNom du robot=" +nom;
	}
	public static void main(String[] args) {
		System.out.println("debut de la partie...");
		System.out.println("creation du robot");
		Robot nom=new Robot();
		System.out.println("Robot" +nom);
		nom.toString();
	}
	public String isDead() {
		if(pv==0) {
			System.out.println("le robot est mort");
		}
		return "le rebot est mort";
	}
	public String fight(String dATA) {
		
		return null;
	}
}
