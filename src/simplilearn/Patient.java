package simplilearn;

public class Patient {
	String Patientname;
	double computeBMI(double weight,double height) {
		return weight/(height*height);
	}
	public static void main(String[] args) {
		Patient patient = new Patient();
		System.out.println(patient.Patientname = "Kiran");
		System.out.println("BMI is:"+patient.computeBMI(55, 1.5));
		System.out.println(patient.Patientname = "Swamy");
		System.out.println("BMI is:"+patient.computeBMI(75, 1.68));
	}

}
