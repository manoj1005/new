package simplilearn;
interface Play1{
	abstract String p1();
}
interface Veena{
	abstract String p2();	
}
interface Saxophone{
	abstract String p3();
}
class test implements Play1,Veena,Saxophone{

	@Override
	public String p3() {
		// TODO Auto-generated method stub
		String r3="Re Re Re";
		return r3;
	}

	@Override
	public String p2() {
		// TODO Auto-generated method stub
		String r2 = "Pe pe pe";
		return r2;
	}

	@Override
	public String p1() {
		// TODO Auto-generated method stub
		String r1 = "Ta ta ta";
		return r1;
	}
	
}
public class Play {
	public static void main(String[] args) {
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		
	}
}
