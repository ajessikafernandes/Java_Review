package client;

public class DuckConcret1 extends Duck{
	
	public DuckConcret1 (){
		this.setFlybehavior(new FlyWithWings());
	}

}
