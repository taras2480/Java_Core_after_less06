package ua.lviv.lgs.plane;

public abstract class Plane extends Plane_Control  {

	double lenth;
	double width;
	double weight;
	

	public Plane(double lenth, double width, double weight) {
		super();
		this.lenth = lenth;
		this.width = width;
		this.weight = weight;
		
	}

	void launchingEngine(double timeToStart) {
		timeToStart = 20 +  Math.random() * 68;
		System.out.println("There are "+timeToStart+" seconds left before takeoff");

	}

	void planeTakeoff(double lenthFullTank) {
		lenthFullTank = Math.random() * 1000;
		System.out.println("The aircraft will have enough fuel per "+lenthFullTank+" km");

	}

	void landing() {
		System.out.println("The plane is landing");
	}

	
	

}
