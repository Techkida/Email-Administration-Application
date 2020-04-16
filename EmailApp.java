package EmailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = null,last = null;
		System.out.println("Enter Worker's First And Last Name: ");
		Scanner sc=new Scanner(System.in);
		first=sc.nextLine();
		last=sc.nextLine();
		Email eml = new Email(first,last);
		System.out.println(eml.showInfo());
		
	}

}
