package simplilearn;
interface calcu{
	abstract int add(int a,int b);
}
interface calcu2{
	abstract int mul(int a,int b);
	void f(int a);
}
class Calcok implements calcu,calcu2{

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		return a*b;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		return a+b;
	}

	@Override
	public void f(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
	
}
public class Interface1 {
	public static void main(String[] args) {
		Calcok p = new Calcok();
		p.add(23,32);
		p.mul(8,5);
		p.f(4);
	}
}
