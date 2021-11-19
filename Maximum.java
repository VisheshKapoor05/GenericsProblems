package GenericsProblems;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first float number:");
		Float N1 = sc.nextFloat();
		
		System.out.println("Enter 2nd float number:");
		Float N2 = sc.nextFloat();
		
		System.out.println("Enter 3rd float number:");
		Float N3 = sc.nextFloat();
		
		maximumFloat(N1, N2, N3);
		
	}
	
	public static void maximumFloat(Float N1, Float N2, Float N3 ) {
		Float max = N1;
		if(N2.compareTo(max) > 0)
			max = N2;
		if(N3.compareTo(max) > 0)
			max = N3;
		System.out.println("Maximum Float Number: " +max);
	}

}
