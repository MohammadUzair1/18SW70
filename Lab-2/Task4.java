class Task4
{
    static int sum=0; // declaration & initialization of variable sum used for adding array elements.
    public static float arrayAverage(int arr[]) // method that returns  average of an array
    {
        for(int i=0; i<arr.length; i++) 
        {
            sum+=arr[i]; //adding elements with eachother of an array
        }//end of for loop
        return sum/arr.length; //returns float type value of average of an array
    }//end of method arrayAverage
    public static void main(String[] args)  //main method
    { 
        int[] array = {1,5,6,7,4,5,8};
        System.out.println(arrayAverage(array)); // calling method arrayAverage which will return average of an array
    } // eend of main method
}//end of class