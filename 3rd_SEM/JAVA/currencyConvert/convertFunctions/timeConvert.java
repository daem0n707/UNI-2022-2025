package convertFunctions;
import java.util.*;

public class timeConvert {
	int m, h;
	public void htom()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter hour: ");
		h = s.nextInt();
		m = h*60;
		System.out.format("\nHour: %d", m);
		s.close();
	}
}
