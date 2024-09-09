package Task4;

import java.util.Scanner;


// creating a class to store name of weekdays in an array
public class QuestionThree{
	public static void main(String[] args){ 
		try (Scanner sc = new Scanner(System.in)) {
			int n;  
			System.out.println("Enter the day's number");  
			n = sc.nextInt();  
			String[] a={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"}; 
			try{  
				System.out.println("The required day is : "+a[n]);
				}  catch(Exception e){  
					System.out.println("the entered range is not b/w 0-6 please enter the given range");
					System.out.println(e);
			}
		}
	}

}
