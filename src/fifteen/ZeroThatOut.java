package fifteen;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeroThatOut {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int numInput = input.nextInt();
		int finalSum = 0;
		
		ArrayList<Integer> all_nums = new ArrayList<Integer>();
		
		int newNumber = -1;
		for(int x = 0; x < numInput; x++){
			// int beforeNum = newNumber;
		    newNumber = input.nextInt();
			//System.out.println(newNumber);
		    if(newNumber != 0){
			all_nums.add(newNumber);
		    }
		    else{
		    	all_nums.remove(all_nums.size()-1);
		    }
			
		}
		
		for(int toAdd : all_nums){
			finalSum += toAdd;
		}
		
		System.out.print(finalSum);
	}
	
	
}
