package simplilearn;
import java.util.Arrays;
import java.util.Scanner;
//Array of objects

class Klm{
private	String sname;
private int sal;
private int bonus;
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
public int salary(){
	int salary = sal+bonus;
	return salary;
}

	
}
public class Arr{
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     //creation of array of objects
		Klm emp[]=new Klm[4];
		for(int i=0;i<emp.length;i++) {
			emp[i]=new Klm();
			System.out.println("enter the sname for "+ i+" employee");
			emp[i].setSname(sc.next());
			System.out.println("enter the salary for "+ i+" employee");
			emp[i].setSal(sc.nextInt());
			System.out.println("enter the bonus for "+ i+" employee");
			emp[i].setBonus(sc.nextInt());
		}
		
		//retrieving array of objects
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i].getSname()+"  "+emp[i].getSal()+"  "+emp[i].getBonus()+"  "+emp[i].salary());
		}
		int ar[]=new int[emp.length];
		String a[] = new String[emp.length];
		String p[];
		p=new String[emp.length];
		for(int i=0;i<emp.length;i++) {
			ar[i]=emp[i].salary();
			a[i]=emp[i].getSname();
			
		}
		int j =0;
		Arrays.sort(ar);
		for(int item:ar) {
			for(int i=0;i<ar.length;i++) {
				if(item ==emp[i].salary()) {
					p[j]=a[i];
					j++;
				}
			}
		}
		System.out.println("The max salary is "+p[p.length-1]+"\nThe min salary is "+p[0]);
	}
}
