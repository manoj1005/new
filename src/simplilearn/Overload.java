package simplilearn;
class Argtype{
	void Arg() {
		System.out.println();
	}
	void Arg(int a,double b) {
		System.out.println("man");
	}
	void Arg(double a,double b) {
		System.out.println("double");
	}
}
public class Overload {
	public static void main(String[] args) {
		Argtype k = new Argtype();
		k.Arg(20,30);
	}

}
