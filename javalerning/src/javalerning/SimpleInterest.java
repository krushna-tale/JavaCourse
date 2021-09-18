package javalerning;

public class SimpleInterest {
	public static void main(String args[]){
		int yrs,rate,pa;
		yrs=5;rate=10;pa=10000;
		float intr;
		intr=(pa*rate*yrs)/100;
		System.out.println("Total interest is="+ intr);
		float total=pa+intr;
		System.out.println("Total ammount to pay"+total);
		float emi=total/(yrs*12);
		System.out.println("The EMI is per month"+emi);
	}

}
