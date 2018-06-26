package fifteen;

import java.util.ArrayList;
import java.util.Scanner;

public class Jerseys {
	
	public static void main(String[] args){
		
		
		Scanner input = new Scanner(System.in);
		
		int numJerseys = input.nextInt();
		int numAtheletes = input.nextInt();
		
		int total_fulfilled = 0;
		
		ArrayList<String> available_sizes = new ArrayList<String>();
		input.nextLine();
		for(int i = 0; i < numJerseys; i++){
			
			String new_size = input.nextLine();
			available_sizes.add(new_size);
		}
		
		//System.out.println(available_sizes);
		
		for(int i = 0; i < numAtheletes; i++){
			
			String new_request = input.nextLine();
			String request_size = new_request.substring(0, 1);
			int request_num = Integer.parseInt(new_request.substring(2, 3));
			//System.out.println(request_size + request_num);
			
			String size_available = available_sizes.get(request_num-1);
			
			if(size_available.equals(request_size)){
				total_fulfilled += 1;
				available_sizes.set(request_num-1, "N");
			}
			else{
				
				if(request_size.equals("S")){
					
					if(!size_available.equals("N")){
						total_fulfilled += 1;
						available_sizes.set(request_num-1, "N");
					}
					
					
				}
				else if(request_size.equals("M")){
					if(size_available.equals("L")){
						total_fulfilled += 1;
						available_sizes.set(request_num-1, "N");
					}
				}
				else{
					// Done
				}
				
				
				
			}
			
			
		}
		
		System.out.print(total_fulfilled);
		
	}
	

}
