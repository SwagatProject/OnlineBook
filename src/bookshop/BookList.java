package bookshop;

import java.util.Scanner;

class BookList {
	void list() {

		String books[] = { "001  PONNIYIN SELVAN", "002  SILAPATHIGARAM", "003  MANIMEGALAI","004  KAMBARAMAYANAM" };
		System.out.println("HERE YOUR BOOKS!!!!!!");

		for (int i = 0; i <= 3; i++) {
			System.out.print(books[i] +  "\n");
		}


	}

	void MakeConfrimation(){
		Scanner con = new Scanner(System.in);
		System.out.println("PLEASE CONFIRM YOUR ORDER!(Y/N)");
		String c = con.nextLine();

		payment(c);
	}

	void Details(int num) {


		if( num==001) {

			System.out.println("Book ID   : 001");
			System.out.println("Book Name : PONNIYIN SELVAN");
			System.out.println("Price     : Rs.500");
			System.out.println("Offers    : NULL");
			MakeConfrimation();
		}

		else	if( num==002) {

			System.out.println("Book ID    : 002");
			System.out.println("Book Name  : SILAPATHIGARAM ");
			System.out.println("Price      : Rs.800");
			System.out.println("Offers     : NULL");

			MakeConfrimation();

		}

		else	if( num==003) {

			System.out.println("Book ID    : 003");
			System.out.println("Book Name  : MANIMEGALAI ");
			System.out.println("Price      : Rs.1000");
			System.out.println("Offers     : NULL");


			MakeConfrimation();	
		}


		else	if( num==004) {

			System.out.println("Book ID    : 004");
			System.out.println("Book Name  : KAMBARAMAYANA ");
			System.out.println("Price      : Rs.450");
			System.out.println("Offers     : NULL");

			MakeConfrimation();

		}
		else {
			System.out.println("Invalid number Try again");


		}



	} 
	void payment(String c) {

		if(c.equals("Y")){
			System.out.println("THANK YOU FOR YOUR ORDER!!!!");

		}
		else {
			list();
		}
	}


}


