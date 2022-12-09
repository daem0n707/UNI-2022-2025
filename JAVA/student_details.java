import java.util.Scanner;

public class student_details{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of entries: ");
            int n = sc.nextInt();
            student s[] = new student[n];
            
            for(int i=0; i<n; i++)
            {
                s[i]= new student();
                System.out.print("Enter student USN: ");
                s[i].USN = sc.next();
                System.out.print("\nEnter student name: ");
                s[i].name = sc.next();
                System.out.print("\nEnter roll no: ");
                s[i].rollno = sc.next();
                System.out.print("\nEnter phone number: ");
                s[i].phone = sc.nextLong();
            }
            System.out.println("USN\t\tNAME\tRoll no\tPHONE\t");
            for(int i=0; i<n; i++)
            {
                s[i].display();
            }
            sc.close();
    }
}

class student {
    String USN, name, rollno;
    long phone;

    void display()
    {
        System.out.println(USN+"\t"+name+"\t"+rollno+"\t"+phone);
    }
}


