package database.dataobjects;


public class GroupStudentsGPA implements Comparable<Object>{
	
	
		
		private String name;
		private float gpa;
		private String group;
		
		GroupStudentsGPA(String name, float gpa)
		{
			this.name = name;
			this.gpa = gpa;
		}
		
		public String getName()
		{
			return name;
		}
		
		public float getGpa()
		{
			return gpa;
		}
		
		public String getGroup()
		{
			return group;
		}
		
		public void setGroup(String group)
		{
			this.group = group;
		}
		
		public int compareTo(Object otherStudent)
		{
			GroupStudentsGPA castedGroupStudent = (GroupStudentsGPA) otherStudent;
			
			if(this.getGpa() < castedGroupStudent.getGpa())
				return -1;
			if(this.getGpa() > castedGroupStudent.getGpa())
				return 1;
			
			return 0;
		}
		
		public String toString()
		{
			return "Name:" + name + "    GPA: " + gpa + "   Group:      " + group;
		}
	
}
