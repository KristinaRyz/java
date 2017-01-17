
public class MoveTest {

	public static void main(String[] args) {

		Car c = new Car("Volvo");
		Person pr = new Person("Haim");
		Ship sp = new Ship("Victoria");
		AirJet aj = new AirJet("Boeing");
		//Polimorfizm
		MoveTest.howIMove(pr,4); //vizivau cherez imya class TestMove(potomuchto static)
		MoveTest.howIMove(aj,1100);
		MoveTest.howIMove(sp,13);
		MoveTest.howIMove(c,150);
	}
 public static void howIMove(Moveable m, int speed){
	// m. a = 10; // eto konstanta kotoryu nelzya izmenit
	 
	 m.move(speed);//vizom methoda sootvetstvuuwego classa
 }
}
