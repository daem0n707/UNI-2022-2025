import java.util.*;

public class threading {

	public static void main(String[] args) {
        Number n = new Number();
        n.start();
	}
}

class Square extends Thread
{
	int x;
	Square(int n) {
		x = n;
	}
		
	public void run()
	{
		int sqr = x*x;
		System.out.format("\nSquare of %d is %d", x, sqr);
	}
}

class Cube extends Thread
{
    int x;
    Cube(int n) {
        x=n;
    }
    public void run()
    {
        int cube = x*x*x;
        System.out.format("\nCube of %d is %d\n", x, cube);
    }
}

class Number extends Thread
{
    public void run()
    {
        Random random = new Random();
        for(int i=0; i<2; i++)
        {
            int randint = random.nextInt(100);
            System.out.print("\n\nRandom number generated: " + randint);
            Square s = new Square(randint);
            s.start();
            Cube c = new Cube(randint);
            c.start();
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.print(e);
            }
        }
    }
}

