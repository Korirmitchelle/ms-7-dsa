// Create a ThreeSort class with a threeSort method and a main method.
// The threeSort method should contain the algorithm and the main method
// should be used for testing your algorithm. To make that easier, make the
// threeSort method static.

// Given three numbers as input, find the min, middle and max of the three.
// Return an array of the numbers in ascending order.
// Hint: to easily see your output, import java.util.Arrays
// and use the Arrays.toString(array) method to convert the Array to a string
// and then log it using System.out.println();

package grade;
import java.util.*;
import java.util.Scanner;

public class ThreeSort {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
threeSort();
	}
	
	public static void threeSort(){
	
		Scanner input = new Scanner(System.in);
	    int[] numbers = new int[3];

	    for (int i = 0; i < numbers.length; i++)
	    {
	        System.out.println("Please enter number");
	        numbers[i] = input.nextInt();
	    }
	    System.out.println("The maximum number is "+numbers[2]);
	    System.out.println("The middle number is "+numbers[1]);
	    System.out.println("The minimum number is "+numbers[0]);
	    System.out.println("The resulting array is:");
System.out.println(Arrays.toString(numbers));
	}
}

/*solution*/
**java
package arrays;
import java.util.*;
/**
 *
 * @author benard
 */
public class ThreeSort{
    public static int[]threeSort (int[] a){
        Arrays.sort(a);
        return a;
    }

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        int[] A = {900,200,300};
        threeSort(A);
        for (int num : A) {
   System.out.println("sorted array = " + num);
        // TODO code application logic here
    }
System.out.println("minimun = "+A[0]);
System.out.println("middle = "+A[1]);
System.out.println("maximum = "+A[2]); 
}
}


