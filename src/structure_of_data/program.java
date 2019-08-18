package structure_of_data;

public class program {

	public static void main(String[] args) {
		
		Duck duck1 = new DuckConcret1();
		duck1.fly();
		
		Duck duck2 = new DuckConcret2();
		duck2.fly();
		
		Duck duck3 = new DuckConcret3();
		duck3.quack();
		
	}

}
