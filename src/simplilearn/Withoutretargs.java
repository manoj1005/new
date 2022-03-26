package simplilearn;

public class Withoutretargs {
	int empno;
	String empname;
	double empsalary;
	double bonus;
	public void empBonus() {
		double salary = empsalary + bonus;
		System.out.println("The total salary is = ");
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Withoutretargs manoj = new Withoutretargs();
		manoj.empno = 100;
		manoj.empname = "Manoj";
		manoj.empsalary = 20000;
		manoj.bonus = 5000;
		manoj.empBonus();
	}

}
