package ten;

import java.util.ArrayList;
import java.util.Scanner;


public class BetterComputerPurchase {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int numCompuer = input.nextInt();
		if(numCompuer == 0){
			return;
		}
		else if(numCompuer == 1){
			String name = input.next();
			System.out.println(name);
			return;
		}
		
		int maxScore = -1;
		String maxName = null;
		int maxScoreTwo = -1;
		String maxNameTwo = null;
		for(int i=0; i<numCompuer; i++){
			String name = input.next();
			int ram = input.nextInt();
			int cpu = input.nextInt();
			int disk = input.nextInt();
			int score = (2 * (ram) + (3 * (cpu)) + (disk));
			if(score > maxScore){
				maxScoreTwo = maxScore;
				maxNameTwo = maxName;
				maxScore = score;
				maxName = name;
				
				//break;
			}
			else if(score > maxScoreTwo){
				maxScoreTwo = score;
				maxNameTwo = name;
			}
			// hMap.put(score, name);
		
		}	
		
		if(maxScore != maxScoreTwo){
			System.out.println(maxName);
			System.out.println(maxNameTwo);
		}
		else{
			if(maxName.compareTo(maxNameTwo) == -1){
				System.out.println(maxName);
				System.out.println(maxNameTwo);
			}
			else if(maxName.compareTo(maxNameTwo) == 1){
				System.out.println(maxNameTwo);
				System.out.println(maxName);
			}
			else{
				System.out.println(maxName);
				System.out.println(maxNameTwo);
			}
			
		}
		
		
	}

}
