package ua.lviv.lgs.plane;

public class Plane_Control {

	public void moveUp(double mu) {

		mu = Math.random() * 20000;
		System.out.println("MoveUp "+mu+" km");

	}
     void moveDown(double md) {

		md = Math.random() * 20000;
		System.out.println("MoveDown "+md+" km");

	}

	void moveLeft(double ml) {
		ml = Math.random() * 5000;
		System.out.println("MoveLeft "+ml+" km");
	}

	void moveRight(double mr) {

		mr = Math.random() * 5000;
		System.out.println("moveRight "+mr+" km");
	}

}
