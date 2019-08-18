package structure_of_data;

public class DuckConcret2 extends Duck{
	
	//Create Constructor
	public DuckConcret2 () {
		this.setFlybehavior(new FlyNoWay());
	}

}
