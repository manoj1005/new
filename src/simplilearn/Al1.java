package simplilearn;

import java.util.*;

class s12{
	int sid;
	String sname;
	public s12(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}
	
}
public class Al1 {
	public static void main(String[] args) {
		s12 k =new s12(12,"manoj");
		s12 l =new s12(13,"Ram");
		HashSet<s12> p =new HashSet<s12>();
		p.add(k);
		p.add(l);
		for(s12 q:p) {
			System.out.println(q.sid+q.sname);
		}
	}
}
