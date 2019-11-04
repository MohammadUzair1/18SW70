public class Task6
{
    public static void main(String[] args) 
    {
        int temporary;
        int[][] A = {{9,4,2},{6,1,5},{10,3,7}};// declaration & initialization of 2d array of type int
        for(int i=0; i<A.length; i++) //the first two loos stores the value one by one and check condition with all elements
        {
            for(int j=0; j<A[i].length; j++)
            {
                for(int k=0; k<A.length; k++)
                {
                    for(int l=0; l<A[k].length; l++)
                    {
                        if(A[k][l]>A[i][j])
                        {
                            temporary = A[i][j];
                            A[i][j] = A[k][l];
                            A[k][l] = temporary; //swaping
                        }// end of if condition
                    }//end of for loop 4
                }//end of for loop 3
            }//end of for loop 2
        }//end of for loop 1
        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<A[i].length; j++)
            {
                System.out.println("A["+i+"]"+"["+j+"] ="+A[i][j]); //printing array
            }
        }    
    }
}