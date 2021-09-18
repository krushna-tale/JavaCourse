package inheritance;

class Employee1{
	protected int eno;
	protected String name;
	protected float basic;

public Employee1()
{
	eno=0;name="";basic=0.0f;
	
}
public Employee1(int eno,String name,float basic) 
{
	this.eno=eno;this.name=name;this.basic=basic;
}
public void setData(int eno,String name,float basic) 
{
	this.eno=eno;this.name=name;this.basic=basic;
}
public void showData()
{
	System.out.println(" Eno "+ eno + " Name "+ name +" Basic "+ basic);
}
}
//End of base class
class salary extends Employee1
{
	protected float hra,da;
	protected float ptax,pf;
	public salary() 
	{
		super();
		hra=da=ptax=pf=0.0f;
	}
	public salary(float hra,float da,float ptax,float pf) {
		this.hra=hra;this.da=da;this.ptax=ptax;this.pf=pf;

	}
	public void setData(float hra,float da,float ptax,float pf) {
		this.hra=hra;this.da=da;this.ptax=ptax;this.pf=pf;

	}
	public void showData()
	{  
		System.out.println(" Hra="+hra+"Da="+da+"profTax ="+ptax+"Provedent Fond="+pf);
	}
}
   class Payment extends salary
   {
	private float gs,ns;
	public Payment()
	{
		super();//call salary default constructer
		gs=ns=0.0f;
	}
	public Payment(int eno,String name,float basic,float hra,float da,float ptax,float pf) 
	{
		super();
		gs=ns=0.0f;
		
	}
	public void setData(int eno,String name,float basic,float hra,float da,float ptax,float pf) 
	{
		super.setData(eno,basic,hra,da);

	}
	public void showData() 
	{
		gs=basic+hra+da;
		ns=gs-(ptax+pf);
		super.showData();
		System.out.println(" Gross Sal="+gs+"Net Sal="+ns);  
	}
	
   }
   

public class multipleInheritance {
	public static void main(String args[])
	{
		Payment p1=new Payment();
		Payment p2=new Payment(123,"krushna",10000.0f,5000.0f,8000.0f,1500.0f,1000.0f);
		
		p1.setData(124,"Sakshi",15000.0f,7000.0f,7000.0f,2000.0f,900.0f);
		p1.showData();
		p2.showData();
	}

}
