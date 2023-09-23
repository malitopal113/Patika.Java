package BoxMatch_ClassesProject;

public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	int dodge;
	int chance;
	
	Fighter(String name, int damage, int health, int weight,int dodge){
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		if (dodge >= 0 && dodge <= 100) {
			this.dodge = dodge;
		} else {
			this.dodge = 0;
		}
	}
	int hit(Fighter foe) {
		System.out.println(this.name + " dealt "+this.damage +" to " + foe.name);
		if (foe.isDodge()) {
			System.out.println(foe.name + " blocked the incoming shot.");
			System.out.println("----------------------");
			return foe.health;
		}
		if(foe.health - this.damage < 0) {
			return 0;
		}
		return foe.health - this.damage; 
	}
	boolean isDodge() {
		double randomNumber = Math.random() * 100;
		return randomNumber <= this.dodge;
	}
}
