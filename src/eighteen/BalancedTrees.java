package eighteen;

import java.util.Scanner;

public class BalancedTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int bigWeight = input.nextInt();
		
		
		int numPerfTrees = 1;
		
		for(int i = bigWeight/2; i >= 1; i--){
		
			// System.out.println(i);
			int currNum = i;
			int sum = currNum + currNum;
			System.out.println(sum);
			while(sum <= bigWeight){
				numPerfTrees += 1;
				
			
				
				if(sum < bigWeight){
					
			
				
			//	int newCurrNum = bigWeight/2;
				// int newSum = sum + (newCurrNum - 1);	
			 int newSum = sum;
			 int numNums = sum / currNum;
			 
				for(int j = bigWeight/2; j >= 1; j--){
										  
						for(int k = 0; k < numNums; k++){
							newSum += j;
						}
						
					
						if(newSum <= bigWeight){
							numPerfTrees += 1;
						}
						else{
							newSum = sum;
						}
					}
				
				}
				
				sum += currNum;
				
				
				
			}
		
			
			
			
			
			
		}
		
		System.out.println(numPerfTrees);
		
		

	}

}
