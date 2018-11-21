/*

In this little assignment you are given a string of space separated numbers,
and have to return the highest and lowest number.

*/

import java.util.Random;

public class HighAndLow{
	public static void main(String[] args){
	
		highAndLow("6 0 10 -5 1");
	
	}
	
	//Manually determine highest and lowest in array
	public static void highAndLow(String nums){
		
		//Split numbers into array
		String[] tokens = nums.split(" ");
		int[] values = new int[tokens.length];
		
		for(int i = 0; i < values.length; i++){
			values[i] = Integer.parseInt(tokens[i]);
		}
		
		//Set high and low values
		int high = 0;
		int low = values[0];
		
		//Determine high and low values in array
		for(int i = 0; i < values.length; i++){
			if(values[i] < low)
				low = values[i];
			if(values[i] > high)
				high = values[i];
		}
		
		//Print our highest and lowest numbers
		System.out.println(high + " " + low);
		
		
	}
	
}