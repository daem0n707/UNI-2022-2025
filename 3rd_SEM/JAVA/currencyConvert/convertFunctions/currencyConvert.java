package convertFunctions;
import java.util.*;

public class currencyConvert {
	int r, y, d;
	public void rtod()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter dollar: ");
		r = s.nextInt();
		d = r*81;
		System.out.format("\nRupee: %d", d);
		s.close();
	}
}
