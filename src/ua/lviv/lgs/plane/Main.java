package ua.lviv.lgs.plane;

public class Main {

	public static void main(String[] args) {
		
		Su27 su27=new Su27(21.9,14.7,33000,2500,"Сamouflage");
		
		su27.launchingEngine(4);
		su27.planeTakeoff(5);
		su27.moveUp(6);
		su27.moveLeft(18);
		su27.moveDown(56);
		su27.moveRight(44);
		su27.stells();
		su27.nuclearStrike();
		su27.turboacceleration();
		su27.landing();

	}

}
