
public class additionOfTwoNumber
{
	 public int addNumber(int a,int b)
     {
    	 int sum=a+b;
    	 return sum;
     }

	public static void main(String[] args) 
	{
		int num1=24;
		int num2=24;
		
		additionOfTwoNumber obj =  new additionOfTwoNumber();
		int result=obj.addNumber(num1,num2);
		System.out.print("sum is :"+result);
	}

}
