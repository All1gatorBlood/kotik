package Model;

public class Kotik {
	private int hunger=10;
	private int prettiness,weight;
	private String name, meow;
	private int objectC=0;
	
	
	//get and set
	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getPrettiness() {
		return prettiness;
	}

	public void setPrettiness(int prettiness) {
		this.prettiness = prettiness;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMeow() {
		return meow;
	}

	public void setMeow(String meow) {
		this.meow = meow;
	}

	public int getObjectC() {
		return objectC;
	}

	public void setObjectC(int objectC) {
		this.objectC = objectC;
	}

	//Construct
	public Kotik(int prettiness, int weight, String name, String meow) {
		super();
		this.prettiness = prettiness;
		this.weight = weight;
		this.name = name;
		this.meow = meow;
		objectC++;
	}
	
	
	//методы
	private void liveAnotherDay() {
	for(int i =0;i<23;i++) {
		int random = (int)Math.random()*5+1;
		switch(random) {
		case 1:play(); break;
		case 2:sleep(); break;
		case 3:angry(); break;
		case 4:callingSatan(); break;
		case 5:chaseDemon(); break;
		}

	}

	}
	public void play() {
		if(hunger<0) {
			System.out.println(name+"Hungry");
			eat();
		}else {
				System.out.println(name+"playing, don't scare him");
				hunger--;
			}
		}

	public void sleep() {
		if(hunger<0) {
			System.out.println(name+"Hungry");
			eat();
		}else {
				System.out.println(name+"sleeping, bless good");
				hunger--;
			}

	}
	public void angry() {
		if(hunger<0) {
			System.out.println(name+"Hungry");
			eat();
		}else {
				System.out.println(name+"See, i feel fear");
				hunger--;
			}

	}
	public void callingSatan() {
		if(hunger<0) {
			System.out.println(name+"Hungry");
			eat();
		}else {
				System.out.println(name+"draws a pentagram");
				hunger--;
			}

	}
	public void chaseDemon() {
		if(hunger<0) {
			System.out.println(name+"Hungry");
			eat();
		}else {
				System.out.println(name+"expels the demon");
				hunger--;
			}

	}
	
	public void eat() {
		hunger+=10;
		System.out.println(name+"not hungry anymore, dont be scared");

	}
		
}
