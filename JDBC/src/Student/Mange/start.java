package Student.Mange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class start {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args)throws IOException {
		System.out.println("Welcome to Student Mangement:");
		BufferedReader bd=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("PRESS 1 TO  ADD STUDENT:");
			System.out.println("PRESS 2 TO DELET STUDENT:");
			System.out.println("PRESS 3 TO DISPLAY STUDENT:");
			System.out.println("PRESS 4 TO EXIT MANAGEMENT:");
		    int a=Integer.parseInt(bd.readLine());
		    if(a==1) {
		    	System.out.println("Enter user Name:");
		    	String Name=bd.readLine();
		    	System.out.println("Enter user Age:");
		    	String Age=bd.readLine();
		    
		    	Student st=new Student(Name,Age);
		    	boolean ans=StudentDao.insertStudentToDB(st);
		    	
		    	if(ans) {
		    		System.out.println("Success fully....");	
		    	}
		    	else {
		    		System.out.println("somthing went wrong....");
		    	}
		    	
		    	
		    	
		}
		    else if(a==2) {
		    	System.out.println("Enter student id to delet:");
		    	int userId=Integer.parseInt(bd.readLine());
		    	boolean f=StudentDao.deleteStudent(userId);
		    		if(f) {
		    			System.out.println("Deleted...");
		    		}else {
		    			System.out.println("Somthing went wrong...");
		    		}
	}
		    else if(a==3) {
		    	StudentDao.showAllStudent();
		    	
		    }
		    else if(a==4) {
		    break;	
		    }
		 
		    else{
		
		}

		}
		System.out.println("Thank you...");
		}}
