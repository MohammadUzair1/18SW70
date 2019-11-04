import java.util.ArrayList;;
class Task5
{
    public static int secondLargestElement(int[] a){
        ArrayList<Integer> list = new ArrayList<>();
        int m = a[0]; //it will store element present at index 0
        for(int i=0; i<a.length; i++)
        { 
            if(a[i]>m)
            {
                m = a[i];
                list.add(i);
            }//end of if
        }//end of for loop
        return (list.get(list.size()-2)); //it will return index
    }// end of method secondLargestElement
    public static void main(String[] args) {
        int[] a = {1,23,55,67,22,16};// declaration & initialization of array a of type int 
        System.out.println("Index of second largest element in the array: "+secondLargestElement(a)); // it will print index of second largest value present in array a  
    }//end of main method
}// end of class