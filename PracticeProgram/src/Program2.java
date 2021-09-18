
class Employee
{
	int salary;
	String name;
	
	
	public String getName() 
	{
		return name;
	}
	public int getSalary() 
	{
		return salary;
	}
	public void setName(String n) 
	{
		name=n;
	}
	
}

public class Program2 
{
	public static void main(String args[]) 
	{
		Employee Krushna=new Employee();
		
		Krushna.name="Krushna Tale";
		Krushna.salary=40000;
		
		Krushna.getSalary();
		Krushna.getName();
		
		System.out.print(" Employee name is "+Krushna.getName());
		System.out.println(" and salary is "+Krushna.getSalary());
		

		
	}

}
