package client;

public abstract class Duck{

	private FlyBehavior flybehavior;
//	private QuackBehavior quack(){}
	
	public void swin(){}
	public void display(){}
	public void fly(){
		this.flybehavior.fly();
	}
	
	public FlyBehavior getFlybehavior() {
		return flybehavior;
	}
	public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}
	
}
