package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// creating student class with attributes
public class Student {
     int age;
	 int rollno;
	 String course;
	 String name;
// creating default constructor
	 Student(){
	  System.out.println("\nObject Created : ");
	  rollno = 0;
	  age = 0;
	  name = "No Name Assigned";
	 }

	 
	 // creating parameterized constructor
	 Student(int a,int b,String c,String d) { 
	  System.out.println("\nObject created.\n");
	  rollno = a;
	  age = b;
	  name = c;
	  course = d;
	 }
     //
	 void display(){
	  System.out.println("\nRoll no : "+rollno+"\nName : "+name+"\nAge : "+age+"\nCourse : "+course);
	 }



      public static void main(String args[]){

      try{
        int n1,a1,b1;
        char []c;
        String c1,d1;
        System.out.println("\nEnter no of students : ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n1=Integer.parseInt(br.readLine());
        Student o[]=new Student[n1];
        System.out.println("\nEnter data : ");
        for(int i=0;i<n1;i++){ 
        System.out.print("\nRoll No : ");
        a1=Integer.parseInt(br.readLine());
        System.out.print("\nAge : ");
        b1=Integer.parseInt(br.readLine());  
        if(b1>21 || b1<15)
        throw new AgeNotWithinRangeException("Age Not Valid");
        System.out.print("\nName : ");
        c1=br.readLine();
        c=c1.toCharArray();
        for(int j=0;j<c1.length();j++){
                if (! Character.isLetter(c[j]))
                    throw new NameNotValidException("\nName contains digits or special characters");
             }
       System.out.print("\nCourse : ");
               d1=br.readLine();
       o[i]=new Student(a1,b1,c1,d1);
        }
        System.out.println("\nData : \n");
        for(int i=0;i<n1;i++)
        o[i].display();
        }catch(IOException e){
        System.out.println(e);
        }catch(AgeNotWithinRangeException e){
         System.out.println(e);
          }catch(NameNotValidException e){
        System.out.println(e);
     }
}
}
