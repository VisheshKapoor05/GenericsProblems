package GenericsProblems;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first integer:");
		Integer N1 = sc.nextInt();
		
		System.out.println("Enter 2nd integer:");
		Integer N2 = sc.nextInt();
		
		System.out.println("Enter 3rd integer:");
		Integer N3 = sc.nextInt();
		
		maximumInteger(N1, N2, N3);
		
	}
	
	public static void maximumInteger(Integer N1, Integer N2, Integer N3 ) {
		Integer max = N1;
		if(N2.compareTo(max) > 0)
			max = N2;
		if(N3.compareTo(max) > 0)
			max = N3;
		System.out.println("Maximum integer: " +max);
	}

}
