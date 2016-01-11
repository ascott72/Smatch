package database.dataobjects;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BethsTestingArea {
	

		public static void main(String[] args)
		{
			Scanner kb = new Scanner(System.in);
			int numberOfGroups = 0;
			int numberPerGroup = 0;
			
			LinkedList<GroupStudentsGPA> students = new LinkedList<GroupStudentsGPA>();

			students = readInFile(students);
			System.out.print("Total number of Student from File:   ");
			System.out.println(students.size());
			
			
			
			int choice; 
		    do{
		    	System.out.println("Please choose how you would like to group the students from the list below:");
		    	// displays the menu
		    	
		    	System.out.println("1 Group by GPA ");    //prompts user to choose 1, 2 or 3
		    	System.out.println("2 Default Group ");
		    	System.out.println("3 Just Group. Surprise me!!! ");
		    	System.out.println("-1 to Exit: ");      //Exit
		    	choice = kb.nextInt();    // choice from the user
		    	
		    	switch(choice)   //choice from the user enters the switch statement
		    	{	
		    	case 1: //Prompts user to enter the number of students for each group
		    			System.out.print("\nSort Groups by GPA ");
		    			System.out.print("\nPlease enter the number of per group: ");
						numberPerGroup = kb.nextInt();
		    			break;
		    	case 2: //Prompts the use r for a string to search for
				    	System.out.print("\nSort Groups by default method ");
		    			System.out.print("\nPlease enter the number of per group: ");
						numberPerGroup = kb.nextInt();
		    			break;
		    			
		    	case 3:	System.out.print("\nSort Groups by default method ");
		    			System.out.print("\nPlease enter the number of per group: ");
    					numberPerGroup = kb.nextInt();
		    		   break;
		    	}
		    		
		    }while(choice==1 || choice==2 || choice==3);//to exit loop
	
			PriorityQueue<GroupStudentsGPA> theQueue = new PriorityQueue<GroupStudentsGPA>(students);
			
			//System.out.print("\nPlease enter the number of per group: ");
		//	numberPerGroup = kb.nextInt();
			
			System.out.print("\nHow would you like to group the students? ");
			
			numberOfGroups = (int) Math.ceil((float) students.size() / numberPerGroup);
			
			//public int getGroupbyGPA()
			LinkedList<GroupStudentsGPA> groups[] = new LinkedList[numberOfGroups];
			
			for(int i = 0; i < numberOfGroups; i++)
			{
				groups[i] = new LinkedList<GroupStudentsGPA>();
			}
			
			//complicated for loop to make sure that the groups are serpentine
			
			int indexOfInsertion = 0;
			
			GroupStudentsGPA theStudentToAdd = null;
			while(!theQueue.isEmpty())
			{
				while(indexOfInsertion < numberOfGroups && !theQueue.isEmpty())
				{
					theStudentToAdd = theQueue.remove();
					groups[indexOfInsertion++].push(theStudentToAdd);
					theStudentToAdd.setGroup(Integer.toString(indexOfInsertion-1));
				//	System.out.println(indexOfInsertion-1);
				}
				while(indexOfInsertion > 0 && !theQueue.isEmpty())
				{
					theStudentToAdd = theQueue.remove();
					groups[--indexOfInsertion].push(theStudentToAdd);
					theStudentToAdd.setGroup(Integer.toString(indexOfInsertion));
					//System.out.println(indexOfInsertion);
				}
			}
			
			///test averages
			float gpaTotal = 0;
			for(int i = 1; i < groups.length; i++)
			{
				gpaTotal = 0;
				for(int j = 0; j < groups[i].size(); j++)
				{
					gpaTotal += groups[i].get(j).getGpa(); 
				}
				
				System.out.println("Group:   " + i + "    " + gpaTotal/groups[i].size() + "         Number in group:   " + groups[i].size());
			
				
			}
			printResults(groups);
		}
		public static LinkedList<GroupStudentsGPA> readInFile(LinkedList<GroupStudentsGPA> students)
		{
			String theLine = null;
			String fileName =  "names.txt";
			File theFile =new File(fileName);
			try
			{
				Scanner theScanner = new Scanner(theFile);
			
			while(theScanner.hasNextLine())
			{
				theLine = theScanner.nextLine();
				String[] theTokens = theLine.split(";");
				students.add(new GroupStudentsGPA(theTokens[0], Float.parseFloat(theTokens[1])));
			}
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
			return students; 
		}
		
		public static void printResults(LinkedList<GroupStudentsGPA>[] groups)
		{
			float gpaTotal = 0;
			try
			{
				File theFile = new File("results.txt");
				PrintWriter writer = new PrintWriter(theFile);
				
				for(int i = 1; i < groups.length; i++)
				{
					gpaTotal = 0;
					writer.println("Group Number: " + i);
					for(int j = 1; j < groups[i].size(); j++)
					{
						writer.println(groups[i].get(j));
						gpaTotal += groups[i].get(j).getGpa(); 
					}
					
					writer.println("Average GPA for Group: " +  gpaTotal/groups[i].size());
				}
				writer.close();
				
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		
		}
		

	}

