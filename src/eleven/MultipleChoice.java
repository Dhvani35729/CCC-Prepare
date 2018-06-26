package eleven;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> student = new ArrayList<String>();
		ArrayList<String> answer = new ArrayList<String>();
		
		
		Scanner input = new Scanner(System.in);
		int totalCorrect = 0;

		
		int num = input.nextInt();
		input.nextLine();
		for(int i = 0; i < num; i++){
			student.add(input.nextLine());
			
		}
		
		for(int i = 0; i < num; i++){
			answer.add(input.nextLine());
		}
		
		for(int i = 0; i < student.size(); i++){
			
			if(student.get(i).equals(answer.get(i))){
				totalCorrect++;
			}
			
		}
		
		System.out.println(totalCorrect);
		

	}

}
