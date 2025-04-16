package vaibhav;
import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	private String name;
	private int rollNumber;
	private char grade;
	public Student(String name,int rollNumber,char grade)
	{
	this.name=name;
	this.rollNumber=rollNumber;
	this.grade=grade;
		
	}
	public Student(String newName, String string, int i, char c) 
	{
		
	}
	public String getName()
	{
		return name;
	}

	public int getRollNumber() 
	{
		return rollNumber;
	}
	
	public char getGrade() 
	{
		return grade;
	}
}
class StudentManagementSystem
{
private ArrayList<Student> students=new ArrayList<>();
public void addStudent(Student student)
{
students.add(student);
}
public void removeStudent(int rollNumber)
{
	
students.removeIf(student->student.getRollNumber()==rollNumber);
}
public Student searchStudent(int rollNumber)
{
return students.stream()
		.filter(student->student.getRollNumber()==rollNumber)
		.findFirst()
		.orElse(null);
		
}
public void displayAllStudents()
{
	

System.out.println("All Students");
for(Student student:students)
{
System.out.println("Name:"+student.getName()+",Roll No:"+student.getRollNumber() +",Grade:"+student.getGrade());	
}

}
}

class StudentInterface
{
private StudentManagementSystem studentManagementSystem=new StudentManagementSystem();	
private Scanner sc=new Scanner(System.in);
public void addNewStudent() {
	System.out.println("Enter student name:");
	String name=sc.nextLine();
	System.out.println("Enter student roll no:");
	int rollNumber=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter student Grade:");
	char grade=sc.next().charAt(0);
	Student newStudent=new Student(name,rollNumber,grade);
	studentManagementSystem.addStudent(newStudent);
	System.out.println("Student added successfully");
	
}
public void editStudentInfo()
{
System.out.println("Enter the roll number of student to edit:");
int rollNumber=sc.nextInt();
sc.nextLine();
Student existingStudent=studentManagementSystem.searchStudent(rollNumber);
if(existingStudent!=null)
{
System.out.println("Student found! Current information:");
System.out.println("Name:"+existingStudent.getName()+",Roll number:"+existingStudent.getRollNumber()+",Grade:"+existingStudent.getGrade());
System.out.println("Enter new name(press enter to keep current):");
String newName=sc.nextLine();
if(!newName.isEmpty())
{
	existingStudent=new Student(newName,existingStudent.getName(),existingStudent.getRollNumber(),existingStudent.getGrade());	

}
System.out.println("Enter new grade(press enter to keep current):");
String newGrade=sc.nextLine();
if(!newGrade.isEmpty())
{
	existingStudent=new Student(newName,existingStudent.getRollNumber(),existingStudent.getGrade());	

}



System.out.println("Students information updated successfully!");
}
else {
 System.out.println("Student not found!");
}

}
public void searchForStudent()
{
System.out.println("Enter the roll number student to search:");
int rollNumber=sc.nextInt();
sc.nextLine();
Student student=studentManagementSystem.searchStudent(rollNumber);
if(student!=null)
{
System.out.println("Student found!");
System.out.println("Name:"+student.getName()+",Roll No:"+student.getRollNumber() +",Grade:"+student.getGrade());

}
else
{
	System.out.println("Student not found!");
}
}

public void displayAllStudents()
{
	studentManagementSystem.displayAllStudents();	

}
}

public class studentM {

	public static void main(String[] args) {
		StudentInterface studentInterface=new StudentInterface();
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.println("Student Management System");
			System.out.println("1.Add new Student");
			
			System.out.println("2. edit existing student information");
			System.out.println("3.search for student");
			System.out.println("4.Display all students");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice:");
			int choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice)
			{
			case 1:
				studentInterface.addNewStudent();
				break;
				
			case 2:
				studentInterface.editStudentInfo();
				break;
			case 3:
				studentInterface.searchForStudent();
				break;
			case 4:
				studentInterface.displayAllStudents();
				break;
			case 5:
				System.out.println("Exiting the application,Goodbye");
				System.exit(0);
				default:
					System.out.println("Invalid choice.please enter valid option");
			}
			
		}
	}
	}
=cd C:\Users\YourName\your-repo-name
=notepad README.md
# my git workflow
=git add README.md
=git commit -m "C0: Add <h1> tag to README.md
	
=echo "Initial content" > notes.txt
=git add notes.txt
=git commit -m "C1: Create a new txt file"
C2 – Modify the .txt file
=echo "Additional content added." >> notes.txt
=git add notes.txt
=git commit -m "C2:Modify txt file"
=git push origin main
🔹 b) iss53 branch → C3: Create index.html and update README.md
=git checkout -b iss53
C3 – Create index.html and update README.md
echo "<!DOCTYPE html><html><body><h1>ISS53 Page</h1></body></html>" > index.html
notepad README.md
=git add index.html README.md
=git commit -m "C3: Create index.html and update README.md in iss53 branch"
=git push -u origin iss53
🔹 c) hotfix branch → C4: Update txt file
=git checkout main
=git checkout -b hotfix
C4 – Update the notes.txt file
=echo "Hotfix update to txt file." >> notes.txt
=git add notes.txt
=git commit -m "C4: Update txt file in hotfix branch"
=git push -u origin hotfix
🔹 d) Merge hotfix into main and delete it
=git checkout main
=git merge hotfix

=git branch -d hotfix
=git push origin --delete hotfix
=git diff HEAD~2 HEAD~1 notes.txt

=git diff main iss53
🔹 e) Merge iss53 into main and delete it

=git checkout main 
=git merge iss53

=git branch -d iss53
=git push origin --delete iss53

=git push origin main

