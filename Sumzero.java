/*************************************************************************************************************************************************************************
  ******************************************************** Sum of three integers adds to Zero ****************************************************************************
  *
  * @author Immanuvel Jeeva
  * @Since  12-07-2021
  *
  ***********************************************************************************************************************************************************************/

import java.util.*;
public class Sumzero {
	public static void main(String[] args) {
	
	int Arr[] = {1, 2, 4, -3, -1, 5, 6};

		// finding elements 
		for (int i=0; i<Arr.length; i++) {

		    for (int j=i+1; j<Arr.length; j++) {

			for (int k=j+1; k<Arr.length; k++) {

			    if(Arr[i] + Arr[j] +Arr[k] == 0) {

				System.out.println("Numbers Found = "+Arr[i]+ "," +Arr[j]+ "," +Arr[k]);
			    }
			}
		    }
		}
	}
}
