package GenericsProblems;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Input Integers
		System.out.println("Enter first integer:");
		Integer I1 = sc.nextInt();
		System.out.println("Enter 2nd integer:");
		Integer I2 = sc.nextInt();
		System.out.println("Enter 3rd integer:");
		Integer I3 = sc.nextInt();
		maximumGeneric(I1, I2, I3);
		
	}
	
	public static <E extends Comparable<E>> void maximumGeneric(E N1, E N2, E N3 ) {
		E max = N1;
		if(N2.compareTo(max) > 0)
			max = N2;
		if(N3.compareTo(max) > 0)
			max = N3;
		System.out.println("Maximum: " +max);
	}

}
