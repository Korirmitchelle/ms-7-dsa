// Given a number, find the next higher number using only the digits in the given number. 
//For example if the given number is 1508, the next higher number with same digits is 8510.
//yet to complete
package grade;

import java.util.Arrays;

public class Toy3 {

		static void permute(java.util.List<Integer> arr, int k){
        for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            System.out.println(java.util.Arrays.toString(arr.toArray()));
        }
    }
    public static void main(String[] args){
        Toy3.permute(java.util.Arrays.asList(8,1,5,0), 0);
    }
}
