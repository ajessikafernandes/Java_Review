package structure_of_data;

public abstract class Duck{

	private FlyBehavior flybehavior;
	private QuackBehavior quackbehavior;
	
	public void swin(){}
	public void display(){}

	public void fly() {
		this.flybehavior.fly();
	}
	
	public void quack() {
		this.quackbehavior.quack();
	}
	
	public FlyBehavior getFlybehavior() {
		return flybehavior;
	}
	public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}
	public QuackBehavior getQuackBehavior() {
		return quackbehavior;
	}
	public void setQuackBehavior(QuackBehavior quack) {
		this.quackbehavior = quack;
	}
	
}
