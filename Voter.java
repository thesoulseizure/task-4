package Task4;

import java.util.Scanner;
// creating a voter class with attributes
public class Voter {
	int voterId;
	String name;
	int age;
	
	// creating parameterized constructor to throw exception
	public Voter(int voterId, String name, int age) throws Exception {
		super();
		this.voterId = voterId;
		this.name = name;
		this.age = age;
		  try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Voterid :");   
			   @SuppressWarnings("unused")
			int a = sc.nextInt();  
			   System.out.println("Enter the name :");  
			   @SuppressWarnings("unused")
			String b = sc.next();   
			   System.out.println("Enter the age :");  
			   int c = sc.nextInt();
			try {
				if(c < 18) 
				throw new Exception("Invalid age for voter");
				 System.out.println("You are eligible to vote !");
			}catch (Exception e){ 
				System.out.println(e.getMessage());
			}
		}
	}


	   public static void main(String[] args){ 
				int a = 0;
				String b = null;
				int c = 0;	
				try {
					@SuppressWarnings("unused")
					Voter v = new Voter(a, b , c);
				} catch (Exception e) {
					e.printStackTrace();
				}
	   }
}
