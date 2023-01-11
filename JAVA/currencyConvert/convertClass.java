package currencyConvert;
import java.util.Scanner;

class convertClass
{
    public void dtor()
    {
        Scanner s = new Scanner(System.in);
        int d;
        System.out.print("\nEnter amount in dollar: ");
        d = s.nextInt();
        float r = d*84;
        System.out.format("\n$%d = %.2f rupees", r);
        s.close();
    }
}
