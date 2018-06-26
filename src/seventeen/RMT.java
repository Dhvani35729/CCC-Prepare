package seventeen;

import java.text.spi.NumberFormatProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int numSubStations = input.nextInt();
		int numSubLines = input.nextInt();
		int numOperations = input.nextInt();
		
		ArrayList<Integer> rails = new ArrayList<Integer>();
		ArrayList<Integer> pop = new ArrayList<Integer>();
		
		ArrayList<Integer> toPrint = new ArrayList<Integer>();
		
		ArrayList<Integer> routes = new ArrayList<Integer>();
		ArrayList<Integer> routesWithoutInd = new ArrayList<Integer>();
		
		//int numCool = 0;
		for(int i = 0; i < numSubStations; i++){
			
			int add = input.nextInt();
			if(!rails.contains(add)){
			//	numCool++;
				
				
				routes.add(i);
				routesWithoutInd.add(add);
				
			}
			else {
				
				int pIndex = -1;
				for(int w = 0; w < routesWithoutInd.size(); w++){
					
					if(routesWithoutInd.get(w) == add){
						pIndex = w;
					}
					 // pIndex = routesWithoutInd.indexOf(add);
				}
				
				
				routesWithoutInd.add(pIndex+1, add);
				routes.add(pIndex+1, i);
			}
			
			rails.add(add);
		
			
			
		}
		//System.out.println(numCool);
		
		
		
		
		for(int i = 0; i < numSubStations; i++){
			
			pop.add(input.nextInt());
			
		}
		ArrayList<Integer> movedPop = new ArrayList<Integer>(pop);
		
		input.nextLine();
		
		for(int i = 0; i < numOperations; i++){
			
			String get = input.nextLine();
			// System.out.println(get);
			
			String[] splitArray = get.split(" ");
			ArrayList<Integer> operations = new ArrayList<Integer>();
			for(int j = 0; j < splitArray.length; j++) {
				operations.add(Integer.parseInt(splitArray[j]));
			}
			
			if(operations.get(0) == 1){
				int start = operations.get(1);
				int end = operations.get(2);
				int sum = 0;
				for(int l = start; l <= end; l++){
					
					sum += movedPop.get(l-1);
				
				}
				toPrint.add(sum);
				
			}
			else {
				
				int operateTrailNum = operations.get(1);
				
				// move ppl
				int firstInd = -1;
				int lastInd = -1;
				for(int o = 0; o < routes.size(); o++){
					
					if(firstInd == -1){
						if(routesWithoutInd.get(o) == operateTrailNum){
							firstInd = o;
						}
						
						
					}
					else{
						if(lastInd == -1){
							
						if(routesWithoutInd.get(o) != operateTrailNum){
							lastInd = o-1;
						}
						
						}
					}
					
					
				}
				
				
				
				if(firstInd != -1 && lastInd == -1){
					lastInd = routesWithoutInd.size()-1;
				}
				
				// move now
				
				// swapInd
				
				// System.out.println(firstInd + "FIRST");
				// System.out.println(lastInd + " LAST");
					
			
				//	System.out.println(movedPop + "BEFORE MOVE");
					int fixedFirstInd = firstInd;
					while(firstInd < lastInd){
				//		System.out.println("ROUTES " + routes);
					//	int temp = pop.get(routes.get(firstInd+1));
					//	System.out.println("TEMP = " + temp);
					//	pop.set(routes.get(firstInd+1), pop.get(routes.get(firstInd)));
						movedPop.set(routes.get(firstInd+1), pop.get(routes.get(firstInd)));
						// pop.set(routes.get(firstInd), temp);
						// System.out.println(firstInd + "FIRST");
						//System.out.println(temp);
						firstInd++;
					}
				//	System.out.println(movedPop + "AFTER MOVE");
					
					if(firstInd == lastInd){
						
						movedPop.set(routes.get(fixedFirstInd), pop.get(routes.get(lastInd)));
						
						
					}
					
					for(int y = 0; y < pop.size(); y++){
						pop.set(y, movedPop.get(y));
						
					}
				
				//	System.out.println(movedPop + "AFTER MOVE");
					
					
				
				
				
				
				
				
			}
			
	//	System.out.println(operations);
			
		}
		
	//	System.out.println(rails);
		// System.out.println(pop);
	//	System.out.println(routes);
		// System.out.println(routesWithoutInd);
		for(int print : toPrint){
			System.out.println(print);
		}

		
	}

}
