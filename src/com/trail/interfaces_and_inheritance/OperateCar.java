package com.trail.interfaces_and_inheritance;

public interface OperateCar {
	
	// constants are implicitly public static final
	String SOME_CONSTANT = "some value";
	
	enum Direction {
		RIGHT, LEFT
	}
	
	// abstract methods are implicitly public
	int turn(Direction direction);
	int changeLanes(Direction direction, double startSpeed, double endSpeed);
	int signalTurn(Direction direction, boolean signalOn);
	int getRadarFront(double distanceToCar, double speedOfCar);
	int getRadarRear(double distanceToCar, double speedOfCar);
	
	// default methods are defined with a `default` modifier
	default void someDefaultMethod() {
		
	}
	
	// static methods are defined with `static` keyword
	static void someStaticMehtod() {
		
	}
	
	// 
}

class OperateBmw implements OperateCar{

	@Override
	public int turn(Direction direction) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeLanes(Direction direction, double startSpeed, double endSpeed) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int signalTurn(Direction direction, boolean signalOn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadarFront(double distanceToCar, double speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRadarRear(double distanceToCar, double speedOfCar) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}