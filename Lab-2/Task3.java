import java.util.Arrays; //importing class Arrays containing multiple methods.
class Task3
{
    public static void printArray(double []arr) // method to print any array elements
    {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" , ");
        }
    }// end of method printArray
    public static void main(String[] args) {
        double[] arr1 = {1.0,3.0,7.0,9.0,5.0,11.0};  //initialization of array arr1 of type double
        double[] arr2 = {1.1,2.2,3.3,4.4,5.5,6.6}; //initialization of array arr2 of type double 
        int i = Arrays.binarySearch(arr1,0,4,3.0); // searching element in arr1 returning its index.
        System.out.println("3.o is present in arr1 with index "+i); // it will print index of searched element
        double[] arr3 = Arrays.copyOf(arr1, 5); // it will copy elements from arr1 to arr3 with new length 5.
        System.out.println("Copied elements from arr1 to arr3 are: ");
        printArray(arr3);// it will print copied elements.
        System.out.println();
        double[] arr4 = Arrays.copyOfRange(arr2, 1, 4); // it will copy elements from index 1 to 4 from arr2 to arr4.
        System.out.println("Copied elements from arr2 to arr4(from index 1 to 4) are: ");
        printArray(arr4);// it will print copied elements.
        System.out.println();
        if(Arrays.equals(arr1, arr2)) // checks whether arr1 and arr2 are equal and returs true if equal and false if unequal.
        {
            System.out.println("Arrays arr1 and arr2 are equal");
        }// end of if
        else
        {
            System.out.println("Arrays arr1 and arr2 are not equal");
        }//end of else
        Arrays.sort(arr1); //sorting the arr1
        System.out.println("Sorted arr1: ");
        printArray(arr1); // printing the sorted arr1
        System.out.println();
        System.out.println(Arrays.toString(arr2));// prints arr2 in String format
    }//end of main method
}// end of class .