import java.util.Random; // importing class Random 
class Task1
{
    public static void main(String[] args) {
        Random r = new Random(); // creating an object of class 'Random'
        int[] arr = new int[100]; //declaration & initialization of array of type int 
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = r.nextInt(); // inserting random numbers in array
        }
    }//end of main method
    
}// end of class 