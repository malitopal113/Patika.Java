package BoxMatch_ClassesProject;

public class Match {
	Fighter f1;
	Fighter f2;
	
	int minWeight;
	int maxWeight;
	
	Match(Fighter f1, Fighter f2 , int minWeight, int maxWeight){
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;	
	}
	
	void run () {
		if(isCheck()) {
			while (this.f1.health > 0 && this.f2.health > 0) {
				System.out.println("***New Round***");
				if(firstKick()) {
					f2.health = f1.hit(f2); 
					System.out.println(this.f2.name +" Health: " + this.f2.health );
					if (isWin()) {
						break;
					}
					f1.health = f2.hit(f1);
					System.out.println(this.f1.name +" Health: " + this.f1.health );
					if (isWin()) {
						break;
					}
				}else {
					f1.health = f2.hit(f1); 
					System.out.println(this.f1.name +" Health: " + this.f1.health );
					if (isWin()) {
						break;
					}
					f2.health = f1.hit(f2);
					System.out.println(this.f2.name +" Health: " + this.f2.health );
					if (isWin()) {
						break;
					}
				}
				
				
			}
		}else {
			System.out.println("The weights of the fighters do not match!!!");
		}
	}
	boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}
	boolean isWin() {
		if (this.f1.health == 0) {
			System.out.println("Winner: " + this.f2.name );
			return true;
		}
		if (this.f2.health == 0) {
			System.out.println("Winner: " + this.f1.name );
			return true;
		}
		return false;
	}
	// if random number is bigger than 0.5; f1(fighter1) starts, otherwise f2(fighter2) starts.
	boolean firstKick() {
		double randomNumber = Math.random() * 1;
		return randomNumber > 0.5;
	}
	
	
}
