package simplilearn;
class Animal{
	void animalname() {
	System.out.println("animaleats");
	}
}
class Child extends Animal{
	void dogname() {
	System.out.println("dogbarks");
	}
}
class Subchild extends Animal{
	void s() {
		System.out.println("masdsf");
	}
}
public class Inher {
	public static void main(String[] args) {
		Child p =new Child();
		p.animalname();
		p.dogname();
		Subchild k = new Subchild();
		k.s();
}
}
