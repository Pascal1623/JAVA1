
public class Car {
	int speed;
	int distance;
	String color;
	
	public Car() {
	}
	public void speedUP() {
		speed=speed+5;
	}
	public void breakDown() {
		speed=speed-10;
	}
	public int getCurrentSpeed() {
		return speed;
	}
	
	public static void main(String[] args) {
		Car dogCar=new Car();
		dogCar.speedUP();
		dogCar.speedUP();
		System.out.println(dogCar.getCurrentSpeed());
		dogCar.breakDown();
		System.out.println(dogCar.getCurrentSpeed());
	}

}
