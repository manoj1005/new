package simplilearn;
abstract class calc{
	abstract int add(int a,int b);
	abstract int sub(int a,int b);
	abstract int mul(int a,int b);
}
class CalImp extends calc{

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}
public class Abstract1 {
	public static void main(String[] args) {
		CalImp k = new CalImp();
		k.add(3, 5);
	}

}
