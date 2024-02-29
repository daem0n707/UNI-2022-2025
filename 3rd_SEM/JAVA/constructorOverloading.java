public class constructorOverloading{
    public static void main(String[] args){
        //Creating new objects for all three cases
        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box();
        Box box3 = new Box(5);
        //Since the same object 'Box' is used with different number of arguments, it is called as constuctor overloading
        double vol;
        
        //Passing arguments into volume function from box1 object
        vol = box1.volume();
        System.out.print("\nVolume of the box 1  is " + vol);

        //Passing arguments into volume function from box2 object
        vol = box2.volume();
        System.out.print("\nVolume of box 2 is " + vol);
        
        //Passing arguments into volume function from box3 object
        vol = box3.volume();
        System.out.print("\nVolume of box 3 is " + vol);
        
        //Passing string into volume function and arguments from box3 object
        //The string 'Cube' is passed into volume function because, box3 calculates volume of cube
        //With the same logic, 'Cuboid' would be passed if box1 object was used instead of box3
        vol = box3.volume("Cube");
        System.out.print("\nVolume of box 3 is " + vol + "\n");
   }
}

class Box
{
    double width, length, height;

    //Defining all three cases of Box object to accept arguments
    //Here the constuctor name is 'Box' which is same as the name of the class
    Box()
    {
        width = length = height = 0;
    }
    Box(double w, double h, double l)
    {
        width = w;
        height = h;
        length = l;
    }
    Box(double len)
    {
        width = height = length = len;
    }

    //Function to calculate volume
    double volume()
    {
        return width*length*height;
    }
    double volume(String str)
    {
        System.out.print("\nThe object is a " + str);
        return height*width*length;
    }
    double volume(double l, double h, double w)
    {
        return width*height*length;
    }
}

