package structure_of_data;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Can't Fly.");
	}
	
}
