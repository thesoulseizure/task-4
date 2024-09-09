package Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;



// creating a HashMap
public class QuestionFour {
	
	static HashMap<String, Integer> StudentGrades = new HashMap<String, Integer>();
	static String command;
	

	public static void main (String[] args) {
		
	
		command = getCommand();
		
	
		while (!command.equalsIgnoreCase("quit")) {
			if (command.equals("new")) {
				StudentGrades = newStudent();
			}
			else if (command.equalsIgnoreCase("remove")) {
				StudentGrades = removeStudent();

			}
			else if (command.equalsIgnoreCase("print")) {
				StudentGrades = printAll();
			}
			
			else {
				System.out.println("Invalid command - please try again:");
				System.out.println("-----------------------------------");
			}
			command = getCommand();
		}	

		System.out.println("Exiting program.");
	}	
	
	public static String getCommand() {
		
	
		Scanner scnr = new Scanner(System.in);
		System.out.println("  --------------------------------------------");
		System.out.println(" | Enter 'new' to add new student and grade   |");
		System.out.println(" | Enter 'remove' to remove a student         |");
		System.out.println(" | Enter 'print' to view all student's grades |");
		System.out.println(" | Enter 'quit' to exit program               |");
		System.out.println("  --------------------------------------------");
		String command = scnr.nextLine();
		return command;
	}
	
	
	// creating a method to add a student
	public static HashMap<String, Integer> newStudent() {
		
	
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter student name: ");				
		String studentName = scnr.nextLine();
		System.out.println("Enter student grade: ");
		Integer studentGrade = scnr.nextInt();
		
	
		StudentGrades.put(studentName, studentGrade);
		System.out.println("New student " + studentName + " succesfully entered.");
		System.out.println("------------------------------------");
		return StudentGrades;
	}
    
	
	// creating a method to remove a student
	public static HashMap<String, Integer> removeStudent() {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter student name to remove: ");
		String nameToRemove = scnr.nextLine();
		if (!StudentGrades.containsKey(nameToRemove)) {
			System.out.println(nameToRemove + " not present in student records, please try again. (Enter 'print' to see current student records).");
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
		else {
			StudentGrades.remove(nameToRemove);
			System.out.println("Student " + nameToRemove + " succesfully removed.");
			System.out.println("-------------------------------------------------");
		}
		return StudentGrades;
	}
	
	
	
    // creating a method to display student grade
	public static HashMap<String, Integer> printAll() {
		
	
		Map<String, Integer> sortedMap = new TreeMap<String, Integer>(StudentGrades);
		Set<String> keySet = sortedMap.keySet();
		System.out.println("Student Grades");
		System.out.println("--------------");
		for (String key : keySet) {
			Integer value = sortedMap.get(key);
			System.out.println(key + ": " + value);
			}
		System.out.println("--------------");
		return StudentGrades;
	}
}
	




