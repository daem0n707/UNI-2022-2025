package currency;
import java.util.*;
import java.io.File;

class file{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //Upload the whole file path in "name of the file"
        System.out.print("Enter the name of the file: ");
        String file_name = s.nextLine();
        File f = new File(file_name);
        if (f.exists())
        	System.out.println("The file " + file_name + " exists");
        else
        	System.out.println("The file " + file_name + " does not exist");
        if (f.exists()){
            if (f.canRead())
            	System.out.println("The file " + file_name + " is readable");
            else
            	System.out.println("The file " + file_name + " is not readable");
            if (f.canWrite())
            	System.out.println("The file " + file_name + " is writeable");
            else
            	System.out.println("The file " + file_name + " is not writeable");
            if (f.isDirectory())
            	System.out.println("The File " +file_name+ " is a directory");
            if (f.isFile())
            	System.out.println("The file " + file_name + " is a File");
            	System.out.println("The Length of the file: " + f.length());
        }
    }
}

