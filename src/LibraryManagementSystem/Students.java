package LibraryManagementSystem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Students {
	Scanner input=new Scanner(System.in);
	List<StudentData> studentsList=new ArrayList<StudentData>(2);
	books borrowedBooks[]=new books[3];
	public void addStudents() throws IOException {
		for(int i=0;i<2;i++) {
			System.out.println("Name  :");	
			String name=input.next();
			System.out.println("Department :");	
			String dept=input.next();
			System.out.println("Batch  :");	
			String batch=input.next();
			System.out.println("University Reg.No:");	
			int regNo=input.nextInt();	
			String libId=name+regNo;
			System.out.println("Books lended  :");	
			int booklended=input.nextInt();
			System.out.println("Library Id :"+libId);	
			StudentData i1=new StudentData(name,dept,batch,regNo,libId,booklended);
		    studentsList.add(i1);
	     }
	}
	public void show() {
		 for(StudentData a:studentsList) {
		     System.out.println("LIBRARY ID :"+a.getLibId()+" NAME :"+a.getName()+" DEPARTMENT :"+a.getDept()+" BATCH : "+a.getBatch()+" BOOKS TAKEN FROM LIBRARY : "+a.getBooklended());	
	     }
	}
	 public int isStudent(){
		   int length=studentsList.size();
	        System.out.println("Enter Library ID:");
	        String lID = input.next();
	        for (int i=0;i<length;i++) {	
	            if (lID.equalsIgnoreCase(studentsList.get(i).getLibId())) {
	                return i ;
	            }
	        }
	        System.out.println("Student is not Registered.");
	        System.out.println("Get Registered First.");
	        return -1;
	    }
	 public void checkOutBook(bookRec book){
	        int studentIndex = this.isStudent();
	        if (studentIndex != -1) {
	            book.display();
	            books b = book.checkOutBook();
	            if (b != null) {
	            	System.out.println("checking out");	
	                if (studentsList.get(studentIndex).getBooklended()<3) {
	                	System.out.println("checking out");
	                    System.out.println("adding book");
	                    //studentsList.get(studentIndex).borrowedBooks[studentsList.get(studentIndex).booklended]=b;
	                    studentsList.get(studentIndex).booklended++;
	                    return;
	                }
	                else {
	                    System.out.println("Student Can not Borrow more than 3 Books.");
	                    return;
	                }
	            }
	            System.out.println("Book is not Available.");
	        }
	 }
	 public void checkInBook(bookRec book){
	        int studentIndex = this.isStudent();
	        if (studentIndex != -1) {
	        	System.out.println("checking in");
	        	 books b = book.checkInBook();
	        	 if (b != null) {
		                if (studentsList.get(studentIndex).booklended<=9) {
		                    System.out.println("adding book to the library");
		                   // studentsList.get(studentIndex).borrowedBooks[studentsList.get(studentIndex).booklended]=b;
		                    studentsList.get(studentIndex).booklended--;
		                    return;
		                }
		                else {
		                    System.out.println("IBSN of the book doesn't match");
		                    return;
		                }
	            }
	        }
	 }}
