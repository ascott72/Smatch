package database.dataobjects;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MainGrouping {
	
	

	public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int numberOfGroups = 0;
        int numberPerGroup = 0;
        
        LinkedList<GroupStudentsGPA> students = new LinkedList<GroupStudentsGPA>();

        students = readInFile(students);
        System.out.print("Total number of Student from File:   ");
        System.out.println(students.size());
        
        PriorityQueue<GroupStudentsGPA> theQueue = new PriorityQueue<GroupStudentsGPA>(students);
        
        System.out.print("\nPlease enter the number of per group: ");
        numberPerGroup = kb.nextInt();
        
        numberOfGroups = (int) Math.ceil((float) students.size() / numberPerGroup);
        
        @SuppressWarnings("unchecked")
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
            //    System.out.println(indexOfInsertion-1);
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
        for(int i = 0; i < groups.length; i++)
        {
            gpaTotal = 0;
            for(int j = 0; j < groups[i].size(); j++)
            {
                gpaTotal += groups[i].get(j).getGpa(); 
            }
            
            System.out.println("Group:   " + (i+1) + "    " + gpaTotal/groups[i].size() + "         Number in group:   " + groups[i].size());
        
            
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
            
            for(int i = 0; i < groups.length; i++)
            {
                gpaTotal = 0;
                writer.println("Group Number: " + i);
                for(int j = 0; j < groups[i].size(); j++)
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