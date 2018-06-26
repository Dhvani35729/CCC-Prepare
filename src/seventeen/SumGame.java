package seventeen;

import java.util.ArrayList;
import java.util.Scanner;

public class SumGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int numGames = input.nextInt();
		
		ArrayList<Integer> swiftScore = new ArrayList<Integer>();
		ArrayList<Integer> sempahorScore = new ArrayList<Integer>();
		
		for(int i = 0; i < numGames; i++){
			
			int next = input.nextInt();
			swiftScore.add(next);
			
			
		}
		for(int i = 0; i < numGames; i++){
			
			int nextTwo = input.nextInt();
			sempahorScore.add(nextTwo);
			
			
		}
		
	//System.out.println(swiftScore);
		// System.out.println(sempahorScore);
		
		ArrayList<Integer> swiftSum = new ArrayList<Integer>();
		ArrayList<Integer> sempahorSum = new ArrayList<Integer>();
		
		int index = -1;
		for(int i = 0; i < swiftScore.size(); i++){
			
			if(swiftScore.get(i) == sempahorScore.get(i)){
				index = i+1;
			}
			
			if(i == 1){
				
			int sum = swiftScore.get(i) + swiftScore.get(i-1);
			int sumTwo = sempahorScore.get(i) + sempahorScore.get(i-1);
					swiftSum.add(sum);
					sempahorSum.add(sumTwo);
			}
			else if(i > 1){
				swiftSum.add(swiftSum.get(i-2) + swiftScore.get(i));
				sempahorSum.add(sempahorSum.get(i-2) + sempahorScore.get(i));
				
			}
			
			
		}
		
		if(numGames == 1){
			if(index == 1){
				System.out.println(index);
				System.exit(0);
			}
		}
		
		if(index == swiftScore.size()){
			System.out.println(index);
			System.exit(0);
		}
		
		// System.out.println(swiftSum);
		 // System.out.println(sempahorSum);
		
		int indexNew = -1;
		for(int i = 0; i < swiftSum.size(); i++){
			
			if(swiftSum.get(i) == sempahorSum.get(i)){
				indexNew = i + 2;
			}
			
			
		}
		//System.out.println(indexNew);
		// System.out.println(index);
		
		if(indexNew != -1){
				System.out.println(indexNew);
				System.exit(0);
		}
		if(indexNew == -1 && index != -1){
			System.out.println(index);
			System.exit(0);
		}
		
		if(indexNew == -1 || index == -1){
			System.out.println(0);
		}
		
		

	}

}
