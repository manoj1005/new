package simplilearn;

public class Withreturn {
	int empno;
	String empname;
	double empsalary;
	public double empBonus(double bonus) {
		double salary = empsalary + bonus;
		return salary;
	}
	public static void main(String[] args) {
		Withreturn manoj = new Withreturn();
		manoj.empno = 100;
		manoj.empname = "Manoj";
		manoj.empsalary = 20000;
		System.out.println("The salary is:");
		System.out.println(manoj.empBonus(5000));
	}

}
