package simplilearn;
class Student1{
	private int sid;
	private String course;
	private double fee;
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", course=" + course + ", fee=" + fee + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double assignFee(double fine) {
		double totalFee = fee +fine;
		return totalFee;
	}
}
public class Student {
	public static void main(String[] args) {
		Student1 p = new Student1();
		p.setCourse("Master's");
		p.setFee(75);
		p.setSid(1001);
		System.out.println("The total fee is\n"+p.assignFee(5));
		System.out.println(p);
	}

}
