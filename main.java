package Tdpod;

public class main {

	public static void main(String[] args) {
		System.out.println("debut de la partie...");
		System.out.println("creation du robot");
		Robot nom=new Robot();
		System.out.println("Robot" +nom);
		System.out.println("pv="+nom.getpv());
		System.out.println("nom="+nom.getnom());
		System.out.println("le robot se fait attaquer.\nIl perd 2 points de vie");
		nom.setpv(8);
		System.out.println("pv="+nom.getpv());
		System.out.println("nom="+nom.getnom());
		System.out.println("le robot se fait encore attaquer.\nIl perd encore 2 points de vie");
		nom.setpv(6);
		System.out.println("pv="+nom.getpv());
		System.out.println("nom="+nom.getnom());
		System.out.println("fin de la partie\n...............");
		

	}

}
