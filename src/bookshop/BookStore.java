package bookshop;

import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("WELCOME TO READ HABBIT BOOK SHOP!!!!!");
		
		
		BookList BL = new BookList();
		BL.list();
		
	 Scanner sc = new Scanner(System.in); 
	 System.out.println("Enter the book number you want:");
	 int num= sc.nextInt();
	 
      BL.Details(num);
      
     


	}

}

	


