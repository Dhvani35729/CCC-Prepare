package twelve;

import java.util.ArrayList;
import java.util.Scanner;

public class AromaticNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		String numWork = input.next();
		
		// System.out.println(numWork);
		
		ArrayList<Integer> normNum = new ArrayList<Integer>();
		ArrayList<Integer> romanNum = new ArrayList<Integer>();
		ArrayList<Integer> multiplyNum = new ArrayList<Integer>();
		
		for(int i = 0; i < numWork.length(); i = i + 2){
			
			String toAdd = numWork.substring(i, i+2);
			char first = toAdd.charAt(0);
			char second = toAdd.charAt(1);
			
			normNum.add(Character.getNumericValue(first));
			romanNum.add(romanToNum(second));
			
			
		}
		
		ArrayList<Integer> operation = new ArrayList<Integer>();
		operation.add(0);
		
		// System.out.println(normNum);
		// System.out.println(romanNum);
		
		for(int i = 0; i < romanNum.size(); i++){
			
			multiplyNum.add(normNum.get(i) * romanNum.get(i));
			
			if(i >= 2){
				int secondC = romanNum.get(i);
				int firstC = romanNum.get(i-1);
				if(secondC <= firstC){
					operation.add(0);
				}
				else {
					operation.add(1);
				}
				
			}
			
		}
		
	//	
		
		operation.add(0);
		
		int sum = 0;
		// System.out.println(operation);
		
		for(int i = 0; i < multiplyNum.size(); i++){
			
			int first = multiplyNum.get(i);
			int op = operation.get(i);
			if(op == 0){
				sum += first;
				
			}
			else{
				sum -= first;
			}

			
			
		}
		
		System.out.println(sum);
		
		
		// ar num
		// ar romam
		// ar operation
		
		
		

	}
	
	private static int romanToNum(char roman){
		
		
		
		if(roman == 'I'){
			return 1;
			
		}
		else if(roman == 'V'){
			return 5;
			
		}
		else if(roman == 'X'){
			return 10;
			
		}
		else if(roman == 'L'){
			return 50;
	
		}
		else if(roman == 'C'){
			return 100;
	
		}
		else if(roman == 'D'){
			return 500;
			
		}
		else if(roman == 'M'){
			return 1000;
			
		}
		else{
			return -1;
		}
		
	}
	

}
