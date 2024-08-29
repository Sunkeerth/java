package dyaily_practice;
import java.util.Scanner;
abstract class bird{
	 abstract void eat();
	 abstract void fly();
}
abstract class eagle extends bird{
	void fly() {
		System.out.println("eagles fly at great hight");
		
	}
}

class seprntEagle extends eagle {
void eat() {
	System.out.println(" seprnt eagles eat the snakes:");
}
}

class glodeneagle extends eagle{
	void eat() {
		System.out.println(" gloden eagle eats the birds ");
	}
}

class poly{
	static void admit(bird ref) {
		ref.eat();
		ref.fly();
		
	}
}

public class Demofoyr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seprntEagle se=new seprntEagle();
		glodeneagle ge=new glodeneagle();
		
		
		poly.admit(se);
		poly.admit(ge);
		

	}

}
