import java.util.Scanner;//importing predefined class for taking input from user
class Area1
{
    private double length;
    private double breadth;//declaration of instance variables.
    public Area1(double length, double breadth)
    {
        this.length = length; 
        this.breadth = breadth;
    }//end of constructor.
    public double returnArea()
    {
        return length*breadth; // returns the area of rectangle.
    }//end of method returnArea.
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); //creating an object of Scanner class for user input.
        System.out.println("Enter length of rectangle: ");
        double length = sc.nextDouble(); // taking input of length
        System.out.println("Breadth of rectangle: ");
        double breadth = sc.nextDouble();// taking input of breadth
        Area1 a1 = new Area1(length, breadth);
        System.out.println("Area of rectangle is: "+a1.returnArea()+" square units");    
    }// end of main method
}//end of class