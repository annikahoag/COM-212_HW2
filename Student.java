import java.util.Scanner;

public class Student{
	//instance variables
	private String name;
	private int grade;

	//constructor
	public Student(){
		
	}

	//return name
	public String getName(){
		return name;
	}

	//return grade
	public int getGrade(){
		return grade;
	}

	//set name
	public void setName (String n){
		name=n;
	}

	//set grade
	public void setGrade (int g){
		grade=g;
	}

	//fill array
	public static Student[] fillArray(Student [] stuArr){
		Scanner scn = new Scanner (System.in);
		String n;
		int g;

		 for (int i=0; i< stuArr.length; i++){
		 	stuArr[i] = new Student();
			
			scn = new Scanner (System.in);
		 	System.out.println("\nPlease enter student #" + (i+1) + "'s name: ");
		 	n = scn.nextLine();
		 	stuArr[i].setName(n);

		 	scn = new Scanner (System.in);
		 	System.out.println("Please enter student #" + (i+1) + "'s grade: ");
		 	g = scn.nextInt();
		 	stuArr[i].setGrade(g);

		 }//close for loop

		return stuArr;
	}//close fillArray

	//main
	public static void main(String [] args){
		String n;
		int g;
		Student[] stuArr = new Student[5];
		Scanner scn = new Scanner(System.in);
		int numChange, newGrade;
		String newName;

		stuArr = fillArray(stuArr);

		//Other Commands:

		//1. print all Students' names
		System.out.println("\nStudent's Names: ");
		for (int i=0; i<stuArr.length; i++){
			System.out.println("#" + (i+1) + ": " + stuArr[i].getName());
		}

		//2. print all Students' grades
		System.out.println("\nStudent's Grades: ");
		for (int i=0; i<stuArr.length; i++){
			System.out.println("#" + (i+1) + ": " + stuArr[i].getGrade());
		}

		//3. print all Students' information
		System.out.println("\nAll Student's Information: ");
		for (int i=0; i<stuArr.length; i++){
			System.out.println("Student #" + (i+1) + ": Name- " + stuArr[i].getName() + ", Grade- " + stuArr[i].getGrade() + ".");
		}


		//4. change name of 1 Student
		System.out.println("\nPlease enter the number of the Student whose name you'd like to change: ");
		numChange = scn.nextInt() - 1;

		scn = new Scanner(System.in);
		System.out.println("Please enter the Student's new name: ");
		newName = scn.nextLine();

		stuArr[numChange].setName(newName);


		//5. change grade of 1 Student
		scn = new Scanner(System.in);
		System.out.println("\nPlease enter the number of the Student whose grade you'd like to change: ");
		numChange = scn.nextInt() - 1;

		scn = new Scanner(System.in);
		System.out.println("Please enter the Student's new grade: ");
		newGrade = scn.nextInt();

		stuArr[numChange].setGrade(newGrade);


		//6. print all Students' information with name and grade changes
		System.out.println("\nAll Student's Information With Changes: ");
		for (int i=0; i<stuArr.length; i++){
			System.out.println("Student #" + (i+1) + ": Name- " + stuArr[i].getName() + ", Grade- " + stuArr[i].getGrade() + ".");
		}
		

	}//close main
	

}//close Student class