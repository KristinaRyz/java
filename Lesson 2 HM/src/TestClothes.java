
public class TestClothes {

	public static void main(String[] args) {

		ChildClothes cl1 = new ChildClothes(5, "blue", "carters", 5);
		System.out.println("ChildClothes: " );
		cl1.display();

		System.out.println();

		AdaultClotes ad1 = new AdaultClotes(48, "red", "H&D", "women");
		System.out.println("AdaultClothes: " );
		ad1.display();
	}


}
