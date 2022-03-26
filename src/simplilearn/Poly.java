package simplilearn;
class Animal3{
	int weight=20;
	void sleep() {
		System.out.println("animal sleeps");
	}
}

class Dog1 extends Animal3{
	
	void sleep() {
		System.out.println("dog sleeps");
	}
	void weight() {
		weight=weight+30;
		System.out.println("dog weight" +weight);
	}
}

public class Poly{
	public static void main(String[] args) {
			Dog1 dog=new Dog1();
			dog.sleep();
			dog.weight();
	}
}
