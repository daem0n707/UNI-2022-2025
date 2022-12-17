package UNI; //Change this to your workspace(directory) name
import java.util.*;

public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, flag=0;
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		if(n == 0 | n == 1)
		System.out.format("%d is not a prime number\n", n);
		else
		{
			for(int i=2; i<=n/2; i++)
			{
				if(n%i == 0)
					flag = 1;
			}	
			if(flag == 0)
				System.out.format("%d is prime\n", n);
			else
				System.out.format("%d is not prime.\n", n);
		}
		sc.close();

	}

}
