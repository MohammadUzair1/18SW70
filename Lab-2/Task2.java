class Task2
{
    public static void main(String[] args) // main method
    {
        int[] arr1 = {1,2,3,4,5,6,7}; //initialization of array arr1 of type int
        int[] arr2 = {1,2,3,4,5,6,7}; //initialization of array arr2 of type int
        int count=0;
        if(arr1.length==arr2.length) //checking whether length of arr1 & arr2 are equal or not
        {
            for(int i=0; i<arr1.length; i++) // loop for going through all elements of arr1
            {
                if(arr1[i]==arr2[i]) //checking whether arr1 & arr2 are equal 
                {
                    count++; //if arrays are same then counter will increase by value 1
                }// end of if condition
            }// end of for loop
            if(count==arr1.length) 
            {
                System.out.println("Arrays are equal");
            }// end of if condition
            else
            {
                System.out.println("Arrays are not equal");
            }//else
        }
        else{ // if length of both arrays are not same 
            System.out.println("Arrays are not equal"); 
        }// else
    }//end of main method
}//end of class