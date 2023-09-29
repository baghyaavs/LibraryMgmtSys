package LibraryManagementSystem;
import java.io.IOException;
import java.util.Scanner;
public class libMS {
	public static void main(String[] args) throws IOException{
		Scanner scan=new Scanner(System.in);
		Students std=new Students();
		bookRec book=new bookRec();
		int opt;
		book.add(new books("The Greatest Salesman in The World","Og Mandino    ",2300,3));
		book.add(new books("The Alchemist                     ","Paulo Coelho  ",2301,6));
		book.add(new books("The Monk Who Sold his Ferrari     ","Robin Sharma  ",2412,4));
		book.add(new books("Wings of Fire                     ","Arun Tiwari   ",1022,1));
		book.add(new books("Think and Grow Rich               ","Napoleon Hill ",1222,3));
		
		System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<BESTIL CENTRAL LIBRARY>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n\tHello,\n");	
		do {
			System.out.println("\n\t\tChoose the option given below\n\n\t\t\t1.Register new student\n\t\t\t2.Display Student list\n\t\t\t3.Display Books\n\t\t\t4.Search a book\n\t\t\t5.Check out Books\n\t\t\t6.Check in Books\n\t\t\t0.Exit");	
		    opt=scan.nextInt();
	    	switch(opt) {
	    	case 1:
	    		std.addStudents();
	    	    break;
	        case 2:
	        	std.show();
	    	    break;
	        case 3:
	    	      book.display();
	    	    break;   
	        case 4:
	    	     System.out.println("1.Search with Title\n2.Search with Author Name.");
                 int Choice = scan.nextInt();
                 switch (Choice) {
                 case 1:
            	      book.searchByTitle();
                      break;
                 case 2:
            	      book.searchByAuthorName();
                      break;
               }
                 break;
	        case 5:
	        	std.checkOutBook(book);
	        	break;
	        case 6:
	        	std.checkInBook(book);
	        	break;
	        case 0:
	    	     System.out.println("::::::::::::::::::::::::::::::::::::::::::EXIT:::::::::::::::::::::::::::::::::::::::::::::::::");
	    	     break;
	      }
	    }while(opt!=0);
	     System.out.println("\n*********************************THANK YOU!!!!!!HAVE A GOOD LEARNING**********************************");
	    scan.close();
}
}
