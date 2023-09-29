package LibraryManagementSystem;
public class books {
	private String Bookname;
	private String Author;
	private int ibsn;
	int bookCopy;
	//creating a parameterised constructor
	public books(String B,String A,int S,int cpy) {
		this.Bookname=B;
		this.Author=A;
		this.ibsn=S;
		this.bookCopy=cpy;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getIbsn() {
		return ibsn;
	}
	public void setIbsn(int ibsn) {
		this.ibsn = ibsn;
	}
	public int getBookCopy() {
		return bookCopy;
	}
	public void setBookCopy(int bookCopy) {
		this.bookCopy = bookCopy;
	}
	
}
