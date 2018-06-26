package seventeen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HighTideLowTide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		int numTides = input.nextInt();
	
		ArrayList<Integer> allTidesDis = new ArrayList<Integer>();
		
		for(int i = 0; i < numTides; i++){
			
			int next = input.nextInt();
			allTidesDis.add(next);
			
		}
		
		if(allTidesDis.size() == 1){
			System.out.println(allTidesDis.get(0));
			System.exit(0);
		}
		
		if(numTides % 2 == 0){
			
			ArrayList<Integer> allTidesSort = new ArrayList<Integer>(allTidesDis);
			// ArrayList<Integer> allTidesSortBac = new ArrayList<Integer>(allTidesDis);
			
			
			Collections.sort(allTidesSort);
		//	System.out.println(allTidesSort);
			
			int middle = numTides / 2;
			
			ArrayList<Integer> finalArray = new ArrayList<Integer>();
			for(int i = 0; i < allTidesSort.size() /2; i++){
				
				finalArray.add(allTidesSort.get(middle-1-i));
				finalArray.add(allTidesSort.get(middle+i));
				
			}
			
			
			for(int print : finalArray){
				if(print == finalArray.get(finalArray.size()-1)){
					System.out.print(print);
				}
				else{
				System.out.print(print + " ");
				}
				
			}
		//	System.out.println(finalArray);
			
			
		}
		else {
			
			ArrayList<Integer> allTidesSort = new ArrayList<Integer>(allTidesDis);
			// ArrayList<Integer> allTidesSortBac = new ArrayList<Integer>(allTidesDis);
			
			
			Collections.sort(allTidesSort);
		//	System.out.println(allTidesSort);
			
			int middle = numTides / 2;
			middle += 1;
		//	System.out.println(middle);
			
			ArrayList<Integer> finalArray = new ArrayList<Integer>();
			for(int i = 0; i < allTidesSort.size() /2; i++){
				
				finalArray.add(allTidesSort.get(middle-1-i));
				finalArray.add(allTidesSort.get(middle+i));
				
			}
			
			finalArray.add(allTidesSort.get(0));
			
			for(int print : finalArray){
				
				if(print == finalArray.get(finalArray.size()-1)){
					System.out.print(print);
				}
				else{
				System.out.print(print + " ");
				}
			}
			
			
		}
		
		
		
		// System.out.println(allTidesDis);
		
		
	}

}
