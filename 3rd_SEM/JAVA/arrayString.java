import java.util.*;

public class arrayString {
	public static void main(String[] args) {
		String str; int c;
		Scanner s = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>(); 
		
		String menu = "\n~~~ ARRAY OPERATIONS ~~~" +
					  "\n[1] APPEND\n[2] POSITIONAL INSERTION\n[3] SEARCH\n[4] STRING STARTING WITH SPECIFIC CHARACTERS\n[5]DISPLAY\n[6] EXIT" +
				      "\nENTER AN OPTION: ";
		while(true)
		{
			System.out.println(menu);
			c = s.nextInt();
			switch(c)
			{
				case 1: //Append
					System.out.print("\nEnter a string: ");
					str = s.next();
					list.add(str);
					System.out.println(str + " has been added");
					break;
				case 2: //Positional Insertion
					System.out.print("\nEnter the string: ");
					str = s.next();
					System.out.print("\nEnter the position to insert: ");
					int pos = s.nextInt();
					list.add(pos, str);
					break;
				case 3://Search
					System.out.print("\nEnter element to search: ");
					str = s.next();
					int index = list.indexOf(str);
					if(index == -1)
						System.out.print("\n[!]Element does not exist");
					else
						System.out.format("\n[+] Element found at index %d", index);
				case 4://startsWith() method
					System.out.print("\nEnter the starting character: ");
					str = s.next();
					for(int i=0; i<list.size()-1; i++)
					{
						String starting = list.get(i);
						if(starting.startsWith(str)) 
						{
							System.out.format("\n%s", starting);
						}
					}
					break;
				case 5:
					System.out.print("\n");
					for(int i=0; i<list.size()-1; i++)
					{
						System.out.print(list.get(i));
					}
				default://Exit
					System.out.print("\n[!] Invalid option selected");			
			}
		}
	}

}
