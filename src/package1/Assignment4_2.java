package package1;      //This java file is inside package named package1 inside src folder.

public class Assignment4_2      //Class declaration containing main method.
{

	public static void main(String[] args)      //main function declaration. and because it is static, program execution starts from main function.
	{
		String cityName="Vizianagaram";      //Assigning cityName variable as "Vizianagaram".
		
		Address addressOfStudent=new Address(206,cityName,535217);
		// Creating the object of Address class inside which we have passed three parameters, first is house number,second is city name, third is PINCODE.
		
		Student firstStudent=new Student("Tejeswar B","8123614295",8,201818,addressOfStudent);
		/*
		 * Creating the object of Student class inside which we have passed five parameters, first is name of student, second is phone number,third is
		 * roll number, fourth is class number,fifth is object reference of class Address. 
		 */
		
		//Displaying the information of the Student.
		firstStudent.display();
		
		//AS WE KNOW THAT
		/*
		 * We can see that the Student class is extending the Person class, So relationship between Student class and Person class 
		 * is IS-relationship.
		 * Whereas, Student class has an object of class Address as one of its property, So relationship between Student and Address 
		 * is HAS-relationship. 
		 */
		
		/*
		 * As my point of view, both IS-relationship and HAS-relationship are used in different different aspects and they both are useful 
		 * in their places but IS-relationship is better because as we can see here, this relationship is re-usable.
		 */
	}      //End of main method. 
}   //End of class.
