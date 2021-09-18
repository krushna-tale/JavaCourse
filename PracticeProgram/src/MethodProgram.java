class Employee1
{
	int id;
	String name;
	public void printDetails()
	{
		System.out.print("  My Name is "+ name);
		System.out.println(" And  id is "+ id);
		
	}
	
	
}

public class MethodProgram {

	public static void main(String[] args) {
		Employee1 Krushna=new Employee1();      //initialize a new employee object
		Employee1 Sakshi=new Employee1();

		
		
		Krushna.id=50;
		Krushna.name="Krushna tale";          //setting attributes
		
		Sakshi.id=51;
		Sakshi.name="Sakshi tale";
		
		Krushna.printDetails();
		Sakshi.printDetails();                //Printing attributes
		
	}

}
