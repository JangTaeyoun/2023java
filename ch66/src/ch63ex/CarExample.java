package ch63ex;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println("car1.company :" + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car1.company :" + car2.company);
		System.out.println("car1.model :" + car2.model);
		System.out.println();

		Car car3 = new Car("자가용", "빨강");
		System.out.println("car1.company :" + car3.company);
		System.out.println("car1.model :" + car3.model);
		System.out.println("car1.color :" + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car1.company :" + car4.company);
		System.out.println("car1.model :" + car4.model);
		System.out.println("car1.color :" + car4.color);
		System.out.println("car1.maxspeed :" + car4.maxSpeed);
		System.out.println();
	}

}
