// program created by Krushna tale
// Date 18-12-2022
import java.util.*;
public class oddEven
{
// Function for the check number is even or odd 
public static int findNumberType(int num)
        {

            if(num%2==0)
                System.out.print("The given number is even number");
            else
                System.out.print("The given number is odd number ");
            
        return 0;
         }

         //end function

         //main body start
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);// Input from the person
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();

        findNumberType(num);//calling function and send value num


     
    }

    

}