package Model;

public class Kotik {
	private int hunger=10;
	private int prettiness,weight;
	private String name, meow;
	private static int objectNum=0;
	
	
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
	
	public static int getObjectNum() {
		return objectNum;
	}

	public static void setObjectNum(int objectNum) {
		Kotik.objectNum = objectNum;
	}

	//методы
	public void liveAnotherDay() {
	for(int i =0;i<23;i++) {
		int random = (int)(Math.random()*5+1);
		switch(random) {
		case 1:play(); break;
		case 2:sleep(); break;
		case 3:angry(); break;
		case 4:callingSatan(); break;
		case 5:chaseDemon(); break;
		}

	}

	}
	public boolean play() {
		if(hunger<0) {
			System.out.println(name+" Hungry");
			eat();
			return false;
		}else {
				System.out.println(name+" playing, don't scare him");
				hunger--;
				return true;
			}
		}

	public boolean sleep() {
		if(hunger<0) {
			System.out.println(name+" Hungry");
			eat(5,"meat");
			return false;
		}else {
				System.out.println(name+" sleeping, bless good");
				hunger--;
				return true;
			}

	}
	public boolean angry() {
		if(hunger<0) {
			System.out.println(name+" Hungry");
			eat();
			return false;
		}else {
				System.out.println(name+" See, i feel fear");
				hunger--;
				return true;
			}

	}
	public boolean callingSatan() {
		if(hunger<0) {
			System.out.println(name+" Hungry");
			eat();
			return false;
		}else {
				System.out.println(name+" draws a pentagram");
				hunger--;
				return true;
			}

	}
	public boolean chaseDemon() {
		if(hunger<0) {
			System.out.println(name+" Hungry");
			eat(5);
			return false;
			
		}else {
				System.out.println(name+" expels the demon");
				hunger--;
				return true;
			}

	}
	
	public boolean eat(int z) {
		hunger+=z;
		System.out.println(name+" Fed up "+z);
		return true;

	}
	public boolean eat(int z, String food) {
		hunger+=z;
		food="fish";
		System.out.println(name+" eat "+food+", fed up "+z);
		return true;

	}
	public boolean eat() {
		eat(10, "meat");
		return true;
	
	}

	//Construct
	public Kotik(int prettiness, int weight, String name, String meow) {
		super();
		this.prettiness = prettiness;
		this.weight = weight;
		this.name = name;
		this.meow = meow;
		objectNum++;
	}
	public Kotik() {
		name="Unk";
		meow="Ssss";
		objectNum++;
	}
	public boolean compareVoice(Kotik cat) {
		if (meow.equalsIgnoreCase(cat.meow)){
			System.out.println("meow equals");
			return true;
		} else {
			return false;
		}
	}
		
}
