package ua.lviv.lgs.plane;

public class Su27 extends Plane implements Turboacceleration,Stells,NuclearStrike {

	

	private double maxSpeed;
	private String color;
	
	
	

	

	public Su27(double lenth, double width, double weight,  double maxSpeed, String color) {
		super(lenth, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}



	@Override
	public void turboacceleration() {
		System.out.println("Speed after acceleration is "+(maxSpeed+Math.random() * 500)+" km/h");
		
	}

	@Override
	public void stells() {
		System.out.println("Plane is invisible for "+Math.random() * 10+" minutes");
		
	}

	@Override
	public void nuclearStrike() {
		System.out.println("Plane droped the bomb in quantity "+Math.round (Math.random() * 10)+" pcs");
		
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
