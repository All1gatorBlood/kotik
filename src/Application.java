
import Model.Kotik;

public class Application {
	public static void main(String[] args) {
		Kotik isCat1 = new Kotik(10,10,"Mjakishek","RRR");
		Kotik isCat2 = new Kotik();
		isCat2.setKotik(10, "Unk", 10, "RRR");
		System.out.println("------  "+"Object add: "+Kotik.getObjectNum()+"  ------");
		System.out.println("--- "+"Comparison meow:"+isCat1.compareVoice(isCat2)+" ---");
		System.out.println(System.lineSeparator());
		System.out.println("---- Action Object 1 ----");
		isCat1.liveAnotherDay();
		System.out.println(System.lineSeparator());
		System.out.println("---- Action Object 2 ----");
		isCat2.liveAnotherDay();
	}
}