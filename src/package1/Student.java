package package1;         //This java file is inside package named package1 inside src folder.

public class Student extends Person       //Class declaration of Student class as a child class of Person. 
{
	int rollNumber;      //int variable to store the roll Number of the student.
	int classNumber;     //int variable to store the class number of the student.
	Address addressOfStudent;      //Address Class object to store the address of student.
	
	/*
	 * We can see that the Student class is extending the Person class, So relationship between Student class and Person class 
	 * is IS-relationship.
	 * Whereas, Student class has an object of class Address as one of its property, So relationship between Student and Address 
	 * is HAS-relationship. 
	 */
	
	public Student(String nameOfPerson,String phoneNumber,int rollNumber, int classNumber, Address addressOfStudent)    //Constructor to assign the values.
	{
		super(nameOfPerson,phoneNumber);      //Passing two values to super class constructor.
		this.rollNumber = rollNumber;
		this.classNumber = classNumber;
		this.addressOfStudent = addressOfStudent;
	}
	
	public void display()      //Method to display the information of student.
	{
		System.out.println("Name of the student is "+super.nameOfPerson);        //Printing name.
		System.out.println("Roll number of the student is "+this.rollNumber);    //Printing roll number.
		System.out.println("Class number of the student is "+this.classNumber);      //Printing class number.
		System.out.println("Phone number of the student is "+super.phoneNumber);     //Printing phone number.
		System.out.println("House number of student is "+this.addressOfStudent.houseNumber);     //printing house number.
		System.out.println("City in which student live is "+this.addressOfStudent.cityName);     //Printing name of city.
		System.out.println("PINCODE of the area where the student lives is "+this.addressOfStudent.pinCode);    //Printing PINCODE.
	}
	
}    //End of class.