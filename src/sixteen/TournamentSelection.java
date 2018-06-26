package sixteen;

import java.util.Scanner;

public class TournamentSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int winCount = 0;
		
		for(int i = 0; i < 6; i++){
			String take = input.next();
			
			if(take.equals("W")){
				winCount++;
			}
			
		}
		
		if(winCount == 0){
			System.out.println("-1");
		}
		else if(winCount >= 1 && winCount <= 2){
			System.out.println("3");
		}
		else if(winCount >= 3 && winCount <= 4){
			System.out.println("2");
		}
		else if(winCount >= 5 && winCount <= 6){
			System.out.println("1");
		}
		
		
		

	}

}
