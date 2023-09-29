package LibraryManagementSystem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class bookRec {
	Scanner input=new Scanner(System.in);
	List<books> bookList=new ArrayList<>();
	public void add(books std) {
		bookList.add(std);		
		}
	public void display() {
		for(books bk:bookList) {
			System.out.println("ISBN: "+bk.getIbsn()+" TITLE : "+bk.getBookname()+"\tAUTHOR : "+bk.getAuthor()+"  No.of.copies available: "+bk.getBookCopy());
		}
		}
	 public void searchByAuthorName() {
		 System.out.println("\t\t\t\tSEARCH BY AUTHOR'S NAME");
		 System.out.println("Enter Author Name:");
		 String authorName = input.nextLine();
		 int flag=0;
		 for(books bk:bookList) {
			 if(authorName.equalsIgnoreCase(bk.getAuthor())) {
				System.out.println("ISBN: "+bk.getIbsn()+" TITLE : "+bk.getBookname()+"\tAUTHOR : "+bk.getAuthor()+"  No.of.copies available: "+bk.getBookCopy());
				flag++;
			 }
		 }
			if(flag==0) {
	            System.out.println("No Book for Author "+ authorName + " Found.");
		 } 
		 
	 }
	 public void searchByTitle() {
		 System.out.println("\t\t\t\tSEARCH BY BOOK TITLE");
		 System.out.println("Enter Book Name:");
		 String BOOKname = input.nextLine();
		 int flag=0;
		 for(books bk:bookList) {
			 if(BOOKname.equalsIgnoreCase(bk.getBookname())) {
				System.out.println("ISBN: "+bk.getIbsn()+" TITLE : "+bk.getBookname()+"\tAUTHOR : "+bk.getAuthor()+"  No.of.copies available: "+bk.getBookCopy());
				flag++;
			 }
		 }
			if(flag==0) {
	            System.out.println("No Book for title "+ BOOKname + " Found.");
		 } 
		 
	 }
	 public int isAvailable(int sNo){
		 int len=bookList.size();
	        for (int i = 0; i<len; i++) {
	            if (sNo == bookList.get(i).getIbsn()) {
	                if (bookList.get(i).getBookCopy() > 0) {
	                    System.out.println( "Book is Available.");
	                    return i;
	                }
	            }
	        }
	        System.out.println("Book is Unavailable");
            return -1;
	 }
	 public books checkOutBook() {
	        System.out.println( "Enter ISBN of the Book to be Checked Out.");
	        int sNo = input.nextInt();
	        int bookIndex = isAvailable(sNo);
	        if (bookIndex != -1) {
	        	bookList.get(bookIndex).bookCopy--;
	            return bookList.get(bookIndex) ;
	        }
	        return null;
	    }
	     public books checkInBook() {
	            System.out.println( "Enter ISBN of the Book to be Checked in.");
	            int sNo = input.nextInt();
	            int bookIndex = isAvailable(sNo);
	            if (bookIndex != -1) {
	        	      bookList.get(bookIndex).bookCopy++;
	                  return bookList.get(bookIndex) ;
	              }
	           return null;
	    }
}
