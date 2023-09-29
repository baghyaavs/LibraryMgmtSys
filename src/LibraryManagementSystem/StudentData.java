package LibraryManagementSystem;
public class StudentData {
	private String name;
	private String dept;
	private String batch;
	private int regNo;
	public String libId;
	public int booklended;
	books borrowedBooks[]=new books[3];
	//creating a parameterised constructor
	StudentData(String n,String d,String b,int regNo,String libId,int lended) {
		this.name=n;
		this.dept=d;
		this.batch=b;
		this.regNo=regNo;
		this.libId=libId;
		this.booklended=lended;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getLibId() {
		return libId;
	}
	public void setLibId(String libId) {
		this.libId = libId;
	}
	public int getBooklended() {
		return booklended;
	}
	public void setBooklended(int booklended) {
		this.booklended = booklended;
	}
	
}
