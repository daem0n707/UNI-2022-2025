import java.util.Scanner;
public class roots {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double r1, r2, real, img; float a, b, c;
        System.out.print("Enter the value of a: ");
        a = s.nextInt();
        if(a==0)
        {
            System.out.print("[!] Invalid equation.");
            System.exit(0);
        }
        System.out.print("Enter the values of B and C: ");
        b = s.nextInt();
        c = s.nextInt();
        double d = (b*b)-(4*a*c);
        if(d==0)
        {
            System.out.print("[~] Roots are equal.");
            r1 = r2 = -b/(2*a);
            System.out.println("Roots are " + r1 + " and " + r2);
        }
        else if(d>0)
        {
            System.out.print("[~] Roots are real and distinct.");
            r1 = (-b+(Math.sqrt(d)))/(2*a);
            r2 = (-b-(Math.sqrt(d)))/(2*a);
            System.out.println("Roots are " + r1 + " and " + r2);
        }
        else
        {
            System.out.print("[~] Roots are imaginary.");
            real = -b/(2*a);
            img = Math.sqrt(-d/(2*a));
            System.out.format("\nRoot1: %.2f+%.2fi", real, img);
            System.out.format("\nRoot2: %.2f-%.2fi", real, img);
        }
        s.close();
    }
}