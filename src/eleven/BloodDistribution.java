package eleven;

import java.util.ArrayList;
import java.util.Scanner;

public class BloodDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> blood = new ArrayList<Integer>();
		ArrayList<Integer> patients = new ArrayList<Integer>();
		
		int countBefore = 0;
		int countAfter = 0;
		int totalPatients = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 8; i++){
			blood.add(input.nextInt());
		}
		input.nextLine();
		for(int i = 0; i < 8; i++){
			patients.add(input.nextInt());
		}
		
		for(int first : patients){
			countBefore += first;
		}
		
		
		// System.out.println(blood);
		// System.out.println(patients);
		
		for(int i = 0; i < patients.size(); i++){
			
			
			if(patients.get(i) <= blood.get(i)){
				totalPatients += patients.get(i);
				blood.set(i, blood.get(i) - patients.get(i));
				patients.set(i, 0);
				// int served = blood.get(i) - patients.get(i)
				
				
			}
			else if(patients.get(i) > blood.get(i)){
				totalPatients += blood.get(i);
				patients.set(i, patients.get(i) - blood.get(i));
				blood.set(i, 0);				
			}
			
		}
		
		
		boolean done = false;
		int sum = 0;
		for(int check : patients){
			sum += check;
			
		}
		if(sum == 0){
			done = true;
			System.out.println(totalPatients);
			System.exit(0);
		}
		else{
		sum = 0;
		for(int check : blood){
			
			sum += check;
		}
		
		if(sum == 0){
			done = true;
			 System.out.println(totalPatients);
				System.exit(0);
		}
		
		else{
			
			// Still Blood and Patients left
			// System.out.println("LEFT");
			for(int i = 0; i < patients.size(); i++){
				
				if(patients.get(i) != 0){
					
					if(i == 2){
						// A-
						// Give O-
						if(blood.get(0) > 0){
							
							if(patients.get(i) <= blood.get(0)){
								totalPatients += patients.get(i);
								blood.set(0, blood.get(0) - patients.get(i));
								patients.set(i, 0);
							}
							else if(patients.get(i) > blood.get(0)){
								totalPatients += patients.get(i);
								patients.set(i, patients.get(i) - blood.get(0));
								//blood.set(0, blood.get(0) - patients.get(i));
								blood.set(0, 0);
								
							}
							
						}
						
					}
					
					if(i == 3){
						// A+
						// Give O-
						if(blood.get(0) > 0){
							
							if(patients.get(i) <= blood.get(0)){
								totalPatients += patients.get(i);
								blood.set(0, blood.get(0) - patients.get(i));
								patients.set(i, 0);
							}
							else if(patients.get(i) > blood.get(0)){
								totalPatients += patients.get(i);
								patients.set(i, patients.get(i) - blood.get(0));
								//blood.set(0, blood.get(0) - patients.get(i));
								blood.set(0, 0);
								
							}
							
						}
						if(blood.get(1) > 0){
							
							if(patients.get(i) <= blood.get(1)){
								totalPatients += patients.get(i);
								blood.set(0, blood.get(1) - patients.get(i));
								patients.set(i, 0);
							}
							else if(patients.get(i) > blood.get(1)){
								totalPatients += patients.get(i);
								patients.set(i, patients.get(i) - blood.get(1));
								//blood.set(0, blood.get(0) - patients.get(i));
								blood.set(1, 0);
								
							}
							
						}
						
						if(blood.get(2) > 0){
							
							if(patients.get(i) <= blood.get(2)){
								totalPatients += patients.get(i);
								blood.set(0, blood.get(2) - patients.get(i));
								patients.set(i, 0);
							}
							else if(patients.get(i) > blood.get(2)){
								totalPatients += patients.get(i);
								patients.set(i, patients.get(i) - blood.get(2));
								//blood.set(0, blood.get(0) - patients.get(i));
								blood.set(2, 0);
								
							}
							
						}
						
						
						
					}
					
					// B -
					if(i == 4){
						// A-
						// Give O-
						if(blood.get(0) > 0){
							
							if(patients.get(i) <= blood.get(0)){
								totalPatients += patients.get(i);
								blood.set(0, blood.get(0) - patients.get(i));
								patients.set(i, 0);
							}
							else if(patients.get(i) > blood.get(0)){
								totalPatients += patients.get(i);
								patients.set(i, patients.get(i) - blood.get(0));
								//blood.set(0, blood.get(0) - patients.get(i));
								blood.set(0, 0);
								
							}
							
						}
						
					}
					
					// B+
					
					if(i == 5){
						// A+
						// Give O-
						if(blood.get(0) > 0){
							
							if(patients.get(i) <= blood.get(0)){
								totalPatients += patients.get(i);
								blood.set(0, blood.get(0) - patients.get(i));
								patients.set(i, 0);
							}
							else if(patients.get(i) > blood.get(0)){
								totalPatients += patients.get(i);
								patients.set(i, patients.get(i) - blood.get(0));
								//blood.set(0, blood.get(0) - patients.get(i));
								blood.set(0, 0);
								
							}
							
						}
						// O+
						if(blood.get(1) > 0){
							
							if(patients.get(i) <= blood.get(1)){
								totalPatients += patients.get(i);
								blood.set(0, blood.get(1) - patients.get(i));
								patients.set(i, 0);
							}
							else if(patients.get(i) > blood.get(1)){
								totalPatients += patients.get(i);
								patients.set(i, patients.get(i) - blood.get(1));
								//blood.set(0, blood.get(0) - patients.get(i));
								blood.set(1, 0);
								
							}
							
						}
						
						// B-
						if(blood.get(4) > 0){
							
							if(patients.get(i) <= blood.get(4)){
								totalPatients += patients.get(i);
								blood.set(0, blood.get(4) - patients.get(i));
								patients.set(i, 0);
							}
							else if(patients.get(i) > blood.get(4)){
								totalPatients += patients.get(i);
								patients.set(i, patients.get(i) - blood.get(4));
								//blood.set(0, blood.get(0) - patients.get(i));
								blood.set(4, 0);
								
							}
							
						}
						
						
						
					}
					
					
					// AB -
					if(i == 6){
						// AB-
						// Give O-
						if(blood.get(0) > 0){
							
							if(patients.get(i) <= blood.get(0)){
								totalPatients += patients.get(i);
								blood.set(0, blood.get(0) - patients.get(i));
								patients.set(i, 0);
							}
							else if(patients.get(i) > blood.get(0)){
								totalPatients += patients.get(i);
								patients.set(i, patients.get(i) - blood.get(0));
								//blood.set(0, blood.get(0) - patients.get(i));
								blood.set(0, 0);
								
							}
							
						}
						
						if(blood.get(2) > 0){
							
							if(patients.get(i) <= blood.get(2)){
								totalPatients += patients.get(i);
								blood.set(0, blood.get(2) - patients.get(i));
								patients.set(i, 0);
							}
							else if(patients.get(i) > blood.get(2)){
								totalPatients += patients.get(i);
								patients.set(i, patients.get(i) - blood.get(2));
								//blood.set(0, blood.get(0) - patients.get(i));
								blood.set(2, 0);
								
							}
							
						}
						
						if(blood.get(4) > 0){
							
							if(patients.get(i) <= blood.get(4)){
								totalPatients += patients.get(i);
								blood.set(0, blood.get(4) - patients.get(i));
								patients.set(i, 0);
							}
							else if(patients.get(i) > blood.get(4)){
								totalPatients += patients.get(i);
								patients.set(i, patients.get(i) - blood.get(4));
								//blood.set(0, blood.get(0) - patients.get(i));
								blood.set(4, 0);
								
							}
							
						}
						
					}
					
					
					// AB +
					if(i == 7){
						// AB-
						// Give O-
						
						for(int k = 0; k < 7; k++){
							
							if(blood.get(k) > 0){
								
								if(patients.get(i) <= blood.get(k)){
									totalPatients += patients.get(i);
									blood.set(0, blood.get(k) - patients.get(i));
									patients.set(i, 0);
								}
								else if(patients.get(i) > blood.get(k)){
									totalPatients += patients.get(i);
									patients.set(i, patients.get(i) - blood.get(k));
									//blood.set(0, blood.get(0) - patients.get(i));
									blood.set(k, 0);
									
								}	
							}
							
						}
						
						
			
						
						
					}
					
					
					
					
					
				}
				
			}
			
			
			
		}
		
		
		
		}
		
		
		
		for(int first : patients){
			countAfter += first;
		}
	//	System.out.println(countBefore);
		
		System.out.println(countBefore - countAfter);
		// System.out.println(totalPatients);
		
		
		
	//	System.out.println(blood);
		// System.out.println(patients);
		

	}

}
