package simplilearn;
class Animal1{
	String color="black";
	void colorOfAnimal1(){
		System.out.println(color);
	}
}
class Dog extends Animal1{
	String color="white";
	void colorOfAnimal(){
		System.out.println(color);
	}
	 void parentdisplay() {
		 super.colorOfAnimal1();
	 }	
}
class SmallDog extends Dog{
	String color="brown";
	void colorOfAnimal(){
		System.out.println(color);
	}
	void display() {
		super.colorOfAnimal();
	}
	void k() {
		super.parentdisplay();
	}
}
public class Main{
	public static void main(String[] args) {
		SmallDog dog=new SmallDog();
		dog.colorOfAnimal();
		dog.display();
		dog.k();
	}
}