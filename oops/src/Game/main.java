package Game;

public class main {
	public static void main(String[] args) {
		Player1 p1 = new Player1("AMAN", "SWORD", 100);
		/*
		 * System.out.println(p1.getName()); System.out.println(p1.getWeapon());
		 * System.out.println(p1.getHealth());
		 */
		/*
		 * p1.damageByGun1(); p1.damageByGun1(); p1.damageByGun2();
		 */
        player2 p2=new player2("Z", "toung", 80, false);
        p2.damageByGun2();
	}

}
