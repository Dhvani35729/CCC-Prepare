package ten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ComputerPurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> ram = new ArrayList<Integer>();
		ArrayList<Integer> cpu = new ArrayList<Integer>();
		ArrayList<Integer> disk = new ArrayList<Integer>();
		ArrayList<Integer> score = new ArrayList<Integer>();
		
	
		
		Scanner input = new Scanner(System.in);
		// boolean done = false;
		
		int numComp = input.nextInt();
		for(int i = 0; i < numComp; i++) {
			// System.out.println(input.next());
			//break;
			String addN = input.next();
			if(!names.contains(addN)){
				names.add(addN);
				ram.add(input.nextInt());
				cpu.add(input.nextInt());
				disk.add(input.nextInt());
			}
			else{
				input.next();
				input.next();
				input.next();
			}
			
		}
		
		
		//ArrayList<String> namesSort = new ArrayList<String>(names);
		
		
		//Collections.sort(namesSort);
		
		int indexMax = -1;
		int max = 0;
		
		for(int i = 0; i < names.size(); i++){
			
			int value = (2 * (ram.get(i))) + (3 * (cpu.get(i))) + (disk.get(i));
			score.add(value);
			if(value > max){
				max = value;
				indexMax = i;
			}
			else if(max == value){
				String name = names.get(i);
				String nameBefore = names.get(indexMax);
				
				int compName = name.compareToIgnoreCase(nameBefore);
			
				if(compName < 0){
					max = value;
					indexMax = i;
				}
				else if(compName > 0){
					
				}
				else{
					max = value;
					indexMax = i;
				}
				
			}
			
			
		}
		
		System.out.println(names.get(indexMax));
	
		names.remove(indexMax);
		ram.remove(indexMax);
		cpu.remove(indexMax);
		disk.remove(indexMax);
		score = new ArrayList<Integer>();
		int indexMaxTwo = -1;
		int maxTwo = 0;
		
		for(int i = 0; i < names.size(); i++){
			
			int value = (2 * (ram.get(i))) + (3 * (cpu.get(i))) + (disk.get(i));
			score.add(value);
			if(value > maxTwo){
				maxTwo = value;
				indexMaxTwo = i;
			}
			else if(maxTwo == value){
				String name = names.get(i);
				String nameBefore = names.get(indexMaxTwo);
				
				int compName = name.compareTo(nameBefore);
			
				if(compName < 0){
					maxTwo = value;
					indexMaxTwo = i;
				}
				else if(compName > 0){
					
				}
				else{
					maxTwo = value;
					indexMaxTwo = i;
				}
				
			}
			
			
		}
		if(indexMaxTwo != -1){
		System.out.println(names.get(indexMaxTwo));
		}
	}

}
