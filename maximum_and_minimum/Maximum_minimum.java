// Using java solve the problem below:

//Create your own array of integers
// Find the maximum and minimum of this array that you just created.
// create a variable to hod the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest




package grade;

import java.util.Arrays;

public class Toy2 {

	public static void main(String[] args) {
		 //array of 10 numbers
        int numbers[] = new int[]{32,1,53,54,32,65,63,98,43,23};
       
        //assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largest = numbers[0];
       
        for(int i=1; i< numbers.length; i++)
        {
                if(numbers[i] > largest)
                        largest = numbers[i];
                else if (numbers[i] < smallest)
                        smallest = numbers[i];
               
        }
       
        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
       
        
        int[] num1={largest};
        
        System.out.println("The largest in an array is:");
        System.out.println(largest);
int[] num2={smallest};
        
        System.out.println("The smallest in an array is:");
        System.out.println(smallest);
        /*System.out.println(Arrays.deepToString(largest));
*/}
	
}
