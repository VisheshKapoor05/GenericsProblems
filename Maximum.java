package GenericsProblems;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String:");
		String N1 = sc.next();
		
		System.out.println("Enter 2nd String:");
		String N2 = sc.next();
		
		System.out.println("Enter 3rd String:");
		String N3 = sc.next();
		
		maximumGeneric(N1, N2, N3);
		
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
