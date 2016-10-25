package task2;

import java.util.Scanner;
import java.util.Stack;

public class Task2 {

	public static void main(String[] args) {
		     String sequence;
			 Scanner scanner = new Scanner(System.in);	
			 System.out.println("Please enter new sequence of any brackets: ");
			 sequence  = scanner.nextLine();
			 
			 System.out.println(task2Method(sequence));
			 scanner.close();

			}
			
		public static boolean task2Method(String st) {
			Stack<String> status = new Stack<String>();
			String takenValue;
			String receivedValue;
			
			for(int i=0; i < st.length(); i++) {
				if (String.valueOf(st.charAt(i)).equals("(")  || String.valueOf(st.charAt(i)).equals("{") || String.valueOf(st.charAt(i)).equals("[")){
					
					status.push(String.valueOf(st.charAt(i)));
					
				} else {
					
					takenValue = status.pop();
					receivedValue = String.valueOf(st.charAt(i));	
					
				         	if (receivedValue.equals(")")) {	         		
				         		if (!takenValue.equals("("))          return false; 
				         	}
				         		else 
				         	        if (receivedValue.equals("}")) {	         		
					         		     if (!takenValue.equals("{")) return false; 
					         	} 
					             else 
				         	        if (receivedValue.equals("]")) {	         		
					         		     if (!takenValue.equals("[")) return false;
					                                                	
				                                                 }
			                              }
				}
			
			if(status.isEmpty()){
				return true;
			} else return false;
			
		}

	}

