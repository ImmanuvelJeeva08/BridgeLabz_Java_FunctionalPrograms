/************************************************************************************************************************************************************************
  ****************************************************** Read integers from user and store then print it ****************************************************************
  *
  * @author Immanuvel Jeeva
  * @Since  12-07-2021
  *
  ***********************************************************************************************************************************************************************/

import java.util.Scanner;

public class TwoDimenstionalArray {
    
    public static void main(String args[]){
        
       // Get elements
 
       System.out.print("Enter 2D array size : ");
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       int columns=sc.nextInt();
       
       System.out.println("Enter array elements : ");    
        
       int twoD[][]=new int[rows][columns];
	
	// store elements using for loop        
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
         }
        System.out.print("\nData you entered : \n");
        for(int []x:twoD){
            for(int y:x){
            System.out.print(y+"        ");
            }
            System.out.println();
        }
        
    }  
    
}
