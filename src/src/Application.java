package src;
import Model.Kotik;

public class Application {
	public static void main(String[] args) {
		Kotik isCat1 = new Kotik(10,10,"�������","RRRRRRR");
		Kotik isCat2 = new Kotik();
		System.out.println("------  "+"Object add: "+Kotik.getObjectNum()+"  ------");
		System.out.println("--- "+"Comparison meow:"+isCat1.compareVoice(isCat2)+" ---");
		System.out.println("\n");
		System.out.println("---- Action ----");
		isCat1.liveAnotherDay();
		

		
	}


}
