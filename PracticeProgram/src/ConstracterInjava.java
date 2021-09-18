class myMainEmployee
{
	private int id;
	private String name;
	
	public myMainEmployee() { //Constractor 
		id=43;
		name="Krishna";
	}
	
	
	public void setId(int i) 
	{
		this.id= i;

	}
	
	 public int getId() 
	{
		 return id;		
		 
				
	}
	
	 public void setName(String n)
    {
		this.name=n;
	}
	 
     public String getName()
    {
    	return name;
	}
    
   
    
	
}
public class ConstracterInjava {
	public static void main(String args[]) {
		myMainEmployee me=new myMainEmployee();
		
//		me.setId(40);
//		me.setName("krushna");
		
		System.out.println(me.getId());
		System.out.println(me.getName());
		
	}

}
