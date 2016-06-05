package test;

import Duck.Duck;
import Duck.MallardDuck;
import Duck.RedheadDuck;
import Duck.RubberDuck;

public class test {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		System.out.print("MallardDuck:");
		mallardDuck.performQuack();
		mallardDuck.performFly();
		
		
		Duck rubberDuck = new RubberDuck();
		System.out.print("RubberDuck:");
		rubberDuck.performQuack();
		rubberDuck.performFly();
		
		
		Duck redheadDuck = new RedheadDuck();
		System.out.print("ReaheadDuck:");
		redheadDuck.performQuack();	
		redheadDuck.performFly();
	}
}
