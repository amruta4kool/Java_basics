package assignmentmdk;

import java.util.Arrays;
import java.util.Scanner;

public class array_reverseorder {

	public static void main(String[] args) {
		int [] array1 = new int [3] ;

		int [] array2 = new int [array1.length] ;

		 Scanner sc = new Scanner (System.in);

		System.out.println("Enter the elements of array") ;


		for (int i =0 , j = 2; i<3 ; i++,j--)

		{

		array1[i] = sc.nextInt() ;
		array2[j]=array2[j] - array1[i] ;

		}

		System.out.println("Array1 is  "+Arrays.toString(array1)) ;
		System.out.println("Copied array in reverse manner is  "+Arrays.toString(array2)) ;


		}

	

}
