package Task4;

import java.util.Scanner;
import java.util.Stack;


// creating a class to create a collection class stack
public class QuestionFive {
	static Stack<Integer> stk = new Stack<Integer>();
	  
	public static Stack<Integer> pushingElements() {
		 System.out.println("Enter the element you want to push");
		 Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			 stk.push(i);
		 return stk;
}
	 // creating a method to pop the elements
	 public static Stack<Integer> poppingElements() {
		 stk.pop();
		 return stk;
}
	 
	 // creating a method to view elements
	 public static  Stack<Integer> viewElements() {
		 System.out.println(stk);
		 return stk;
}
	 
	 // creating a method to check the stack if its empty
	 public static Stack<Integer> check(){
		 System.out.println(stk.empty());
		 return stk;
	 }
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.println("-------------------------------");
    	 System.out.println("Enter 1 to add the element");
    	 System.out.println("Enter 2 to remove the element");
    	 System.out.println("Enter 3 to view the elements of the stack");
    	 System.out.println("Enter 4 to check whether the stack is empty/not");
    	 System.out.println("-------------------------------");
    	 while(true) {
    		 int n = sc.nextInt();
    		if( n==1) {
    			stk = pushingElements();
    		}else if(n==2) {
    			stk =  poppingElements();
    		}else if(n==3) {
    			stk = viewElements();
    		}else if(n==4) {
    			stk = check();
    		}else {
    			System.out.println("Invalid Number");
    		}
    	 }
     }
}

	

