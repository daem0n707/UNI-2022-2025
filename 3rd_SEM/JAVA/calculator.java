package labPrograms; //Chnage this to your workspace(directory) name
import java.util.*;

public class calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a, b;
		System.out.print("<---------->CALCULATOR<---------->");
		System.out.print("\n[1] Add\n[2] Subtract\n[3] Divide\n[4] Multiply\n[5] Exit");
		System.out.print("\nSelect an option: ");
		int option = s.nextInt();
		System.out.print("\nEnter A and B: ");
		a = s.nextDouble();
		b = s.nextDouble();		
		switch(option)
		{
			case 1: System.out.format("\nSum: %.2f", (a+b));
					break;
			case 2: System.out.format("\nDifference: %.2f", (a-b));
					break;
			case 3: System.out.format("\nDivision: %.2f", (a/b));
					break;
			case 4: System.out.format("\nMultiplication: %.2f", (a*b));
					break;
			default: System.out.print("\n[!] Invalid options entered.");
					break;
		}
			
		s.close();
	}

}
