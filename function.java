// Program for Simple function 
// program created by Krushna tale
// Date 18-12-2022
import java.util.*;
class function
{

public static void printMyName(String name){

    System.out.print("Helloo " );
     System.out.print(name );
     System.out.println(" How are you .. " );

    return;
}

    public static void main(String args[])
    {

Scanner sc = new Scanner(System.in);
System.out.println("Enter your name :");
String name=sc.next();

printMyName(name);
       

    }
}