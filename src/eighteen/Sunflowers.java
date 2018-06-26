package eighteen;

import java.util.Arrays;
import java.util.Scanner;

public class Sunflowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int numFlowers = input.nextInt();
		
		int[][] garden = new int[numFlowers][numFlowers];
		
		for(int i = 0; i < numFlowers; i++){
			
			for(int j=0; j < numFlowers; j++){
				
				garden[i][j] = input.nextInt();
				
			}
			
			
		}
		
	
	while(checkIfFirstInOrder(garden) != true){
		
		garden = rotate90CounterClockWise(garden);
		
	}
	while(CheckIfPlantsRight(garden) != true){
		garden = rotate90CounterClockWise(garden);
	}
	while(checkIfPlantHeightInOrder(garden) != true){
		garden = rotate90CounterClockWise(garden);
	}
	
	for(int row = 0; row < garden.length; row++){
		for(int col=0; col < garden[row].length; col++){
			
			if(col == garden.length-1){
				// System.out.println("hi");
				System.out.print(garden[row][col]);
			}
			else{
				System.out.print(garden[row][col] + " ");
			}
			
			
			
		}
		if(row != garden.length -1){
			System.out.print("\n");
		}
		
		
	}
	

		

	}
	
	
	public static boolean CheckIfPlantsRight(int[][] arr){
		
		boolean plantsRight = true;
		
		for(int row = 0; row < arr.length; row++){
			
			// boolean rowIsGood = true;
			int firstMeasure = -1;
			
			for(int col=1; col < arr[row].length; col++){
				
				// arr[row][col]
				//System.out.println(arr[row][col]);
				if(col == 1){
					firstMeasure = arr[row][col];
				}
				else{
					
					if(arr[row][col] >= firstMeasure){
						firstMeasure = arr[row][col];
					}
					else{
						plantsRight = false;
						return plantsRight;
					}
					
				}
				
				
			}
		}
		
		
		
		return plantsRight;
	}
	
	public static boolean checkIfPlantHeightInOrder(int[][] arr){
		
		boolean plantsRight = true;
		
		for(int row = 0; row < arr.length; row++){
			
			// boolean rowIsGood = true;
			int firstMeasure = -1;
			
			for(int col=0; col < arr[row].length; col++){
				
				// garden[row][col]
				if(col == 0){
					firstMeasure = arr[col][row];
				}
				else{
					
					if(arr[col][row] >= firstMeasure){
						firstMeasure = arr[col][row];
					}
					else{
						plantsRight = false;
						return plantsRight;
					}
					
				}
				
				
			}
		}
		return plantsRight;
	}
	
	public static boolean checkIfFirstInOrder(int[][] arr){
		
		// System.out.println("called");
					// int[] firstCol = new int[garden.length];
			boolean inOrder = true;
			int toCheck = -1;
			for(int col=0; col < arr.length; col++){
						
						// garden[row][col]
						if(col == 0){
							toCheck = arr[col][0];
						}
						else{
							
							if(arr[col][0] >= toCheck){
								toCheck = arr[col][0];
							}
							else{
								inOrder = false;
								return inOrder;
							}
							
						}
			}
				//		firstCol[col] = garden[col][row];
						
					
		
		
		return inOrder;
	}
	
	public static int[][] rotate90CounterClockWise(int[][] arr){
		
		int[][] rotatedArr = new int[arr.length][arr.length];
		
		for(int row = 0; row < arr.length; row++){
			for(int col=0; col < arr[row].length; col++){
				
				// arr[row][col] 
				rotatedArr[arr.length-1 - col][row] =  arr[row][col] ;
				
			}
			
			
		}
		
		return rotatedArr;
	}

}
