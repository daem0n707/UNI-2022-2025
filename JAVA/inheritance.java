import java.util.Scanner;

public class inheritance{
	public static void main(String[] args){
		Teaching teaching = new Teaching();
		Technical technical = new Technical();
		Contract contract = new Contract();
		System.out.print("\n\nENTER DETAILS FOR TEACHING STAFF MEMBER: ");
		teaching.accept();
		System.out.print("\n\nENTER DETAILS FOR TECHNICAL STAFF MEMBER :");
		technical.accept();
		System.out.print("\n\nENTER DETAILS FOR CONTRACT STAFF MEMBER: ");
		contract.accept();
		System.out.print("\n<----->TEACHING<----->");
		teaching.display();
		System.out.print("\n<----->TECHNICAL<----->");
		technical.display();
		System.out.print("\n<----->CONTRACT<----->");
		contract.display();
	}
}
// This is the main class, also called as super class
class Staff{
	private String staffid;
	private String name;
	private long phone;
	private float salary;
	public void accept()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("\nENTER STAFF ID: ");
		staffid = s.next();
		System.out.print("\nENTER NAME: ");
		name = s.next();
		System.out.print("\nENTER PHONE NUMBER: ");
		phone = s.nextLong();
		System.out.print("\nENTER SALARY: ");
		salary = s.nextFloat();
	}	
	public void display()
	{
		System.out.format("\nSTAFF ID: %s", staffid);
		System.out.format("\nNAME: %s", name);
		System.out.format("\nPHONE: %d", phone);
		System.out.format("\nSALARY: %f", salary);
	}
}

class Teaching extends Staff{
	private String domain;
	private String[] publications;
	
	public void accept()
	{
		super.accept();
		Scanner s = new Scanner(System.in);
		System.out.print("\nENTER DOMAIN: ");
		domain = s.next();
		System.out.print("\nENTER THE NUMBER OF PUBLICATIONS: ");
		int n = s.nextInt();
		publications = new String[n]; 
		for(int i=0; i<n; i++)
		{
			System.out.format("\nENTER PUBLICATIONS %d: ", i+1);
			publications[i] = s.next();
		}
	}

	public void display()
	{
		super.display();
		System.out.format("\nDOMAIN: %s", domain);
		System.out.println("\nPUBLICATIONS: ");
		for(int i=0; i<publications.length; i++)
		System.out.println(publications[i]);
	}
}

class Technical extends Staff{
	private String[] skills;
	
	public void accept()
	{
		super.accept();
		Scanner s = new Scanner(System.in);
	 	System.out.print("\nENTER NUMBER OF SKILLS: ");
		int n = s.nextInt();
		skills = new String[n];
		for(int i=0; i<n; i++)
		{
			System.out.format("\nENTER SKILL %d: ", i+1);
			skills[i] = s.next();	
		}
	}
	public void display()
	{
		super.display();
		System.out.print("\nSKILLS: ");
		for(int i=0; i<skills.length; i++)
		System.out.println(skills[i]);
	}
}

class Contract extends Staff{
	private int period;

	public void accept()
	{
		super.accept();
		Scanner s = new Scanner(System.in);
		System.out.print("\nENTER WORK PERIOD: ");
		period = s.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.format("\nWORK PERIOD: %d year(s)\n", period); 
	}
}

// Since only one terminal is used for input, Scanner object is never closed [s.close();]
// For console apps such as this one with multiple classes, use a single Scanner to read from "System.in" i.e, not not close the Scanner Object.
