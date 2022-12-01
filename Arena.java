package Tdpod;

public class Arena {
	protected String D2RD2;
	protected static String DATA;
	private int pv1,pv2;

	public Arena() {
		D2RD2="foo";
		pv1=10;
		DATA="bar";
		pv2=10;
	}
	public Arena(String D2RD2,String DATA,int pv1,int pv2) {
		DATA=DATA;
		pv1=pv1;
		D2RD2=D2RD2;
		pv2=pv2;
	}
	public String getD2RD2() {
		return D2RD2;
	}
	public int getpv1() {
		return pv2;
	}
	public String getDATA() {
		return DATA;
	}
	public int getpv2() {
		return pv2;
	}
	public void setnom1(String foo) {
		DATA=foo;
	}
	public void setnom2(String bar) {
		D2RD2=bar;
	}
	public void setpv1(int p1) {
		pv1=p1;
	}
	public void setpv2(int p2) {
		pv2=p2;
	}

	public String fight(String nom1,String nom2, int pv1,int pv2) {
		System.out.println("debut du combat......");
		if(pv1<pv2) {
			System.out.println("le robot foo a été tiré");
		}
		if(pv1==pv2) {
			System.out.println("le robot foo a évité");
		}
		if(pv1>pv2) {
			System.out.println("le robot a bar gagné");
		}
		return "le rebot foo ="+DATA+ " a été touché par le robot" +D2RD2;
	}
	public static void main(String[] args) {
		Robot D2RD2=new Robot();
		System.out.println("\"le rebot foo =\"+DATA+ \" a été touché par le robot\" +D2RD2");
		System.out.println(D2RD2.fight(DATA));
	}

}