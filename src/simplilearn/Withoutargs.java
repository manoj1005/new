package simplilearn;

public class Withoutargs {
	int empno;
	String empname;
	double empsalary;
	double bonus;
	public double empBonus() {
		double salary = empsalary + bonus;
		return salary;
	}
	public static void main(String[] args) {
		Withoutargs manoj = new Withoutargs();
		manoj.empno = 100;
		manoj.empname = "Manoj";
		manoj.empsalary = 20000;
		manoj.bonus = 5000;
		System.out.println("The salary is:\n"+manoj.empBonus());
	}

}
