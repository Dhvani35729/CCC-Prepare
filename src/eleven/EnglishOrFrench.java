package eleven;

import java.util.ArrayList;
import java.util.Scanner;

public class EnglishOrFrench {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> allText = new ArrayList<String>();
		
		int countT = 0;
		int countS = 0;
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < num; i++){
			
			String line = input.nextLine();
			for(int j = 0; j < line.length(); j++){
				char c = line.charAt(j);
				
				if(c == 'S' || c == 's'){
					countS++;
				}
				else if(c == 'T' || c == 't'){
					countT++;
				}
				
				
			}
		  // allText.add(line);
			
			
			//	System.out.println(line);
			
		}
		
		
		if(countT == countS){
			System.out.println("French");
		}
		else if(countT > countS){
			System.out.println("English");
		}
		else{
			System.out.println("French");
		}

	}

}
