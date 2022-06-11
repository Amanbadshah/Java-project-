package Game;

public class player2 extends Player1 {
	private int healt;
	private boolean armour;
	public player2(String name,String weapon,int healt,boolean armour) {
		super(name,weapon,healt);
		this.healt=healt;
		this.armour=armour;
	}
	@Override
	public void damageByGun1() {
		// TODO Auto-generated method stub
		if(armour) {
			this.healt-=20;
			if(this.healt<=0)this.healt=0;
			System.out.println("Armour is on Got hit by gun1 reduce by20"+"new healt"+this.healt);
			  
			
			
			}
		if(!armour) {
			this.healt-=30;
			if(this.healt<=0)this.healt=0;
			System.out.println("Armour is off Got hit by gun1 reduce by30"+"new healt"+this.healt);
			
		}
		if(this.healt==0) {
			System.out.println(getName()+"dead");
		}
		}
	@Override
	public void damageByGun2() {
		// TODO Auto-generated method stub
		if(armour) {
			this.healt-=40;
			if(this.healt<=0)this.healt=0;
			System.out.println("Armour is on Got hit by gun1 reduce by20"+"new healt"+this.healt);
			  
			
			
			}
		if(!armour) {
			this.healt-=50;
			if(this.healt<=0)this.healt=0;
			System.out.println("Armour is off Got hit by gun1 reduce by50"+"new healt"+this.healt);
			
		}
		if(this.healt==0) {
			System.out.println(getName()+"dead");
		}
	}
	
	

}
