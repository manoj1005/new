package simplilearn;
class Company1{
	int salaryInc(int sal,int bon) {
		int salary = sal + (bon*sal)/100;
		return salary;
				
	}
}
	
class Contract extends Company1{}
class Permanent extends Company1{}
public class Company {
public static void main(String[] args) {
	Contract k = new Contract();
	Permanent y = new Permanent();
	System.out.println(k.salaryInc(60000,10));
	//contract y = new Company1();
	System.out.println(y.salaryInc(100000,20));
}
}
