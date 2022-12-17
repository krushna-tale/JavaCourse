// Program for the addition and subtraction of two number 
// program created by Krushna tale
// Date 18-12-2022

import java.util.*;
public class addNumber{

    public static int subTwoNum( int num1, int num2){  //subtraction function or method
        int sub =num1 - num2;
       return sub;



    }

    public static int addTwoNum( int num1, int num2){ //addition function or method
        int sum =num1 + num2;
       return sum;



    }
    
    public static void main(String args[]){   //main method
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter First Number : ");
         int num1=sc.nextInt();
         System.out.print("Enter Second Number : ");
         int num2=sc.nextInt();

        int sum=addTwoNum(num1,num2);
         System.out.print("The addition of two number is : ");// calling addTwoNum function for addition
         System.out.println(sum);

         int sub=subTwoNum(num1,num2);
         System.out.print("The subtraction of two number is : ");  // calling subTwoNum function for the subtraction
         System.out.println(sub);





    }
    
}