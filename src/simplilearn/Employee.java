package simplilearn;
class Employee1 extends Person{
	private double annualsalary;
	private int startyear;
	private String insure;
	public Employee1(String name, double annualsalary, int startyear, String insure) {
		super(name);
		this.annualsalary = annualsalary;
		this.startyear = startyear;
		this.insure = insure;
	}
	@Override
	public String toString() {
		return "Employee1 [annualsalary=" + annualsalary + ", startyear=" + startyear + ", insure=" + insure + ", name="
				+ name + "]";
	}
}

public class Employee {
	public static void main(String[] args) {
		Employee1 Testemployee = new Employee1("Manoj",25000,2022,"20021D3403");
		System.out.println(Testemployee);
	}
}
