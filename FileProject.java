package myFirstProgram;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileProject {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.println("*********************");
		System.out.println("Welcome");
		System.out.println("*********************");
		while(true){	 
		System.out.println("Options");
		System.out.println("*********************");
		System.out.println("1.Retrieving the file names in an ascending order");
		System.out.println("2.Business-level operations");
		System.out.println("3.Exit");
	    System.out.print("Enter your choice: ");
	    int choice = input.nextInt();
	    System.out.println("You entered " + choice);
		switch (choice) {

	      case 1:
	        System.out.println("*********************");
	        File files = new File("/Users/for u/eclipse-workspace/simplilearn/src/myFirstProgram/");
	     	String[] listofFiles=files.list();	
			//Collections.
			int i=0;
			for (String file : listofFiles) {				
				 System.out.println(file);	
				 i=i+1;
			}
			if(i==0)
			{
				System.out.println("EMPTY");
			}
	        break;

	      case 2:
	    	int choice2;
	    	do {
	    	System.out.println("*********************");
	    	System.out.println("1.Add a file to existing directory");
	  		System.out.println("2.Delete a specified file from the existing directory list");
	  		System.out.println("3.Search a user specified file from the main directory");
	  		System.out.println("4.Back to the main context");
	  		System.out.println("*********************");
	  		System.out.println("Enter your choice");
	  		choice2=input.nextInt();
	  		
	  		switch(choice2) {
	  		case 1:
	  			System.out.println("*********************");
	  			System.out.println("Enter filename");
	  			String fileName=input.next();
	  			File f = new File("/Users/for u/eclipse-workspace/simplilearn/src/myFirstProgram/"+fileName);			 		 		 
	  			f.createNewFile();
	  			break;
	  			//continue;
	  		case 2:
	  			System.out.println("*********************");
	  			System.out.println("Enter filename");
	  			String fileName1=input.next();
	  			File f1 = new File("/Users/for u/eclipse-workspace/simplilearn/src/myFirstProgram/"+fileName1);	
	  			f1.delete();
	  			break;
	  		case 3:
	  			System.out.println("*********************");
	  			System.out.println("Enter filename");
	  			String fileName2=input.next();
	  			File f2 = new File("/Users/for u/eclipse-workspace/simplilearn/src/myFirstProgram/"+fileName2);	
	  			if(f2.exists())
	  			{
	  				System.out.println("File found");
	  			}
	  			else
	  			{
	  				System.out.println("File Not Found");
	  			}
	  			break; 
	  		case 4:	  			
	  			break;
	  		}}
	  		while(choice2!=4);
	        break;

	      // match the value of week
	      case 3:
	    	  System.out.println("*********************");
	    	  System.out.println("Exit");
	    	  System.out.println("*********************");
	    	  System.exit(0);
	        break;	      
	      default:
	    	  System.out.println("*********************");
	    	  System.out.println("INVALID CHOICE");
	        break;

	    }
		}
		
	
		
	}

}
