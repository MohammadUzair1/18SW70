class Task7
{
    public static int removeDuplicate(int[] a) //method returning new length of array
    {
        int j = 0; //intialization of j variable of type int used as new length
        for(int i=0; i<a.length-1; i++)
        {
            if(a[i]!=a[i+1])
            {
                a[j++] = a[i]; //comparing two elements whether they are not same then the element will be stored
            }// end of if condition
        }//end of for
        a[j++] = a[a.length-1]; //storing last element
        for(int i=0; i<j; i++)
        {
            System.out.println(a[i]);
        }//end of for loop
        return j; //returning new length
    } //end of method removeDuplicate
    public static void main(String[] args) {
        int[] a = {20,20,20,30,40,50,50};
        System.out.println("New length of Array = "+removeDuplicate(a)); //it will print new length after removing duplicates.
    }//end of main method
}//end of class