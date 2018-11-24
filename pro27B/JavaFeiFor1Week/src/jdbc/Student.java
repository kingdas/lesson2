package jdbc;

public class Student {

	private int Sid;
	private String Sname;
	private int Sage;	
	private String Ssex;	
	
	
	
	public int getSid() {
		return Sid;
	}




	public void setSid(int sid) {
		Sid = sid;
	}




	public String getSname() {
		return Sname;
	}




	public void setSname(String sname) {
		Sname = sname;
	}




	public int getSage() {
		return Sage;
	}




	public void setSage(int sage) {
		Sage = sage;
	}




	public String getSsex() {
		return Ssex;
	}




	public void setSsex(String ssex) {
		Ssex = ssex;
	}




	public Student() {
		super();
	}




	public Student(String sname, int sage, String ssex) {
		super();
		Sname = sname;
		Sage = sage;
		Ssex = ssex;
	}




	public Student(int sid, String sname, int sage, String ssex) {
		super();
		Sid = sid;
		Sname = sname;
		Sage = sage;
		Ssex = ssex;
	}




	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Sage=" + Sage
				+ ", Ssex=" + Ssex + "]";
	}
	
	
	
	
}
