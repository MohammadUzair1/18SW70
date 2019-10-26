import java.util.Scanner; //importing predefined class for taking input from user
class Area
{
    private double length;
    private double breadth;//declaration of instance variables.
    public void setDim(double length, double breadth)
{
    this.length = length;
    this.breadth = breadth;
} //end of method setDim.
    public double getArea() // returns the area of the rectangle.
    {
        return length*breadth; // formula for caculating area of rectangle.
    } // end of method getArea
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in); // creating an object of Scanner class for user input.
        System.out.println("Enter length of rectangle: ");
        double length  = scnr.nextDouble(); //taking input of length
        System.out.println("Breadth of rectangle: ");
        double breadth = scnr.nextDouble();//taking input of breadth
        Area a = new Area();
        a.setDim(length, breadth);
        System.out.println("Area of rectangle :"+a.getArea()+" square units");        
    }//end of main method.
}//end of class