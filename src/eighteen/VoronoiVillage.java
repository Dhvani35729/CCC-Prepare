package eighteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VoronoiVillage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int numVillages = input.nextInt();
		
		ArrayList<Integer> allVillages = new ArrayList<Integer>();
		
		
		for(int i = 0; i < numVillages; i++){
			
			int villageValue = input.nextInt();
			
			allVillages.add(villageValue);
			
		}
		
		
		Collections.sort(allVillages);
		// System.out.println(allVillages);
		float minSize = Float.MAX_VALUE;
		
		for(int i = 1; i < allVillages.size()-1; i++){
			
			float leftNeighbourSize = (float) (( allVillages.get(i) - allVillages.get(i-1)) / 2.0);
			float rightNeighbourSize = (float) (( allVillages.get(i+1) - allVillages.get(i)) / 2.0);
			
			float size = leftNeighbourSize + rightNeighbourSize;
		
			if(Math.abs(size) < minSize){
				minSize = Math.abs(size);
			}
			
		}
		
		System.out.printf("%.1f", Math.abs(minSize));
		
	}

}
