package simplilearn;
class Balcheck{
	int bal=2000;
	void Balcheck(int request) throws Balinsufficient {
		if(bal>=request) {
			System.out.println("Take the money");
		}
		else {
			throw new Balinsufficient("No sufficcient balance");
		}
	}
}
public class Excep {
public static void main(String[] args) throws Balinsufficient {
	Balcheck p= new Balcheck();
	p.Balcheck(5000);
}
}
