package simplilearn;

public class Introduction {
	int empno;
	String empname;
	double empsalary;
	public void empBonus(double bonus) {
		double salary = empsalary + bonus;
		System.out.println("The total salary is = ");
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Introduction manoj = new Introduction();
		manoj.empno = 100;
		manoj.empname = "Manoj";
		manoj.empsalary = 20000;
		manoj.empBonus(5000);
	}
}
