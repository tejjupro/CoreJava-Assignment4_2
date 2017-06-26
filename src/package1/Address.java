package package1;       //This java file is inside package named package1 inside src folder.

public class Address        //Classs declaration of Address to explain HAS-a relationship.
{
	int houseNumber;        //storing house number in an int variable.
	String cityName;        //String variable to store the name of the city.
	int pinCode;            //int variable to store the pinCode number of the house.
	
	public Address(int houseNumber,String cityName,int pinCode)         //Creating constructor to Assign the values. 
	{
		this.houseNumber=houseNumber;
		this.cityName=cityName;
		this.pinCode=pinCode;
	}
}      //End of class.