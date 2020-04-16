package EmailApp;

import java.util.Scanner;

public class Email {
	private String FirstName, LastName,Password,Department,AlternateEmail,Email,CompanySuffix="techkida.com";
	private int EmailBoxCapacity= 500, defaultpasswordlength = 10; 
	private Scanner in;
	//Constructor to ask for First Name and Last Name
	
	public Email(String FirstName,String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		
		
		
		//call method asking for the dept and return it
		this.Department = setDepartment();
		System.out.println("Department: " +this.Department);
		
		//combine elements to generate email id
		Email = FirstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+this.Department+"."+CompanySuffix;
		//System.out.println("Your Email ID is " + Email);
		
		//call a method that return a password
		this.Password = randomPassword(defaultpasswordlength);
		System.out.println("\nYour Password is:"+this.Password);
		
		
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("\nNew Worker:"+FirstName + "\nEnter Your Department Codes \n 1 for Sales \n 2 for Development \n 3 for Accounting \n 4 for None \nEnter Department Code");
		in = new Scanner(System.in);
		int deptchoice = in.nextInt();
		if (deptchoice == 1) { return "Sales"; }
		else if (deptchoice == 2) { return "Development"; }
		else if (deptchoice == 3) { return"Accounting"; }
		else { return ""; }
			
	}
	//Generate Random Password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$*";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String (password);
	}
	//Set Mailbox Capacity
	public void setMailboxCapacity(int capacity) {
		this.EmailBoxCapacity = capacity;
	}
	//Set alternate email
	public void setAlternateMail(String AltEmail) {
		this.AlternateEmail = AltEmail;
	}
	//Change the password
	public void changePassword(String Password) {
		this.Password = Password;
	}
	
	public int getMailboxCapacity() { return EmailBoxCapacity; }
	public String getAlternateMail() { return AlternateEmail; }
	public String getPassword() { return Password; }
	
	public String showInfo() {
		return "DISPLAY INFO  "+ FirstName + " " + LastName +
			   "\nCOMPANY EMAIL  "+ Email + " " + 
				"\nMAILBOXCAPACITY  "+ EmailBoxCapacity + "mb";
			   
	}
}
