package simplilearn;
class Length1{
	private int l;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "Length1 [l=" + l + "]";
	}
	
}
public class Length {
	public static void main(String[] args) {
		Length1 k =new Length1();
		k.setL(3);
		System.out.println(k);
	}

}
