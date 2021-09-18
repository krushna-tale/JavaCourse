package inheritance;

class Employee{
	float salary=40000.0f;
	
}
class programmer extends Employee{
	int bonus=10000;
	
			



	public static void main(String args[]) {
		programmer p1=new programmer();
		System.out.println("Salary of the programmer is"+p1.salary);
		System.out.println("Bonus of the programmer is"+p1.bonus);
		
	}

}

