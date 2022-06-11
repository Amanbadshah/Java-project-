package Student.Mange;

public class Student {
	private int studentid;
	private String studentName;
	private String  studentAge;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	public Student(int studentid, String studentName, String studentAge) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	public Student(String studentName, String studentAge) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "studentclass [studentid=" + studentid + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ "]";
	}
	
	
	
}		
	


