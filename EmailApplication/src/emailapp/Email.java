package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companyName = "Company.com";

	// Constructor to receive the first name and last name

	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		

		// Call a method asking for the department - returns the derpartment
		this.department = setDepartment();
		
		// call a method that return random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		// Combine elements to generate
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
		
	}
	
	// Get and Set the mailbox capacity
		public int getMailboxCapacity() {
			return mailboxCapacity;
		}
		
		public void setMailboxCapacity(int mailboxCapacity) {
			this.mailboxCapacity = mailboxCapacity;
		}

		// Change the password
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		

		// Get and Set the alternate email
		public String getAlternateEmail() {
			return alternateEmail;
		}

		public void setAlternateEmail(String alternateEmail) {
			this.alternateEmail = alternateEmail;
		}

	// ask for the department
	private String setDepartment() {
		System.out.print("NEW WORKER: "+ firstName+". "+"DERPARTMENTS CODES:" + "\n1 for Sales" + "\n2 for Development" + "\n3 for Accounting"
				+ "\n0 for none" + "\n Enter deparment code:");
		Scanner in = new Scanner(System.in);
		int depChice = in.nextInt();
		if (depChice == 1) {
			return "Sales";
		} else if (depChice == 2) {
			return "Development";
		} else if (depChice == 3) {
			return "Accounting";
		} else {
			return "";
		}
	}

	// Generate a random password
	private String randomPassword(int length) {
		String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * setPassword.length());
			password[i] = setPassword.charAt(rand);
		}
		return new String(password);

	}
	
	// To show The information 
	public void showInfo() {
		System.out.println("DISPLAY NAME: "+ firstName +" "+ lastName
				+"\nCOMPANY EMAIL: "+ email
				+"\nMAILBOX CAPACITY: "+ mailboxCapacity+"mb");
	}

	

}
