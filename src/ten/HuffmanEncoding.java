package ten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HuffmanEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> keyName = new ArrayList<String>();
		ArrayList<String> keyValue = new ArrayList<String>();

		
		Scanner input = new Scanner(System.in);
		// boolean done = false;
		
		int numComp = input.nextInt();
		for(int i = 0; i < numComp; i++) {
			
			String letter = input.next();
			String numVal = input.next();
			keyName.add(letter);
			keyValue.add(numVal);
			
		}
		
		String decode = input.next();
		
		String check = decode;
		while(check.length() > 0){
		for(int i = 0; i < keyName.size(); i++){
			
			
			int length = keyValue.get(i).length();
			//System.out.println("CHECK BEFORE" + check);
			if(check.startsWith(keyValue.get(i))){
				System.out.print(keyName.get(i));
			    check = check.substring(length);
				//System.out.println("CHECK AFTER" + check);
				//System.out.println(check);
				i = 0;
			}
			
			
		}
		}
		

		
		//System.out.println(decode);


	}

}
