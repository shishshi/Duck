package Duck;

public class RubberDuck extends Duck{
	public RubberDuck(){
		 quackBehavior = new Squeak();
	     flyBehavior = new FlyNoWay();
	}
    
}
