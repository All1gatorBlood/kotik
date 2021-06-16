package Model;

public class Kotik {
	int hunger=10;
	int prettiness,weight;
	String name, meow;
	
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
	private void play() {
		if(hunger<0) {
			System.out.println(name+"Hungry");
			eat();
		}else {
				System.out.println(name+"playing, don't scare him");
			}
		}

	private void sleep() {
		if(hunger<0) {
			System.out.println(name+"Hungry");
			eat();
		}else {
				System.out.println(name+"sleeping, bless good");
			}

	}
	private void angry() {
		if(hunger<0) {
			System.out.println(name+"Hungry");
			eat();
		}else {
				System.out.println(name+"See, i feel fear");
			}

	}
	private void callingSatan() {
		if(hunger<0) {
			System.out.println(name+"Hungry");
			eat();
		}else {
				System.out.println(name+"draws a pentagram");
			}

	}
	private void chaseDemon() {
		if(hunger<0) {
			System.out.println(name+"Hungry");
			eat();
		}else {
				System.out.println(name+"expels the demon");
			}

	}
	
	private void eat() {
		hunger+=10;
		System.out.println(name+"not hungry anymore, dont be scared");

	}
		
}
