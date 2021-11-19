package GenericsProblems;

import java.util.Scanner;

public class GenericClass <E> {
	
	E N1;
	E N2;
	E N3;
	
	
	public GenericClass(E i1, E i2, E i3) {
		this.N1 = i1;
		this.N1 = i2;
		this.N1 = i3;
	}
	
	public static <E extends Comparable<E>> E maximumGeneric(E i1, E i2, E i3) {
		E max = i1;
		if(i2.compareTo(max) > 0)
			max = i2;
		if(i3.compareTo(max) > 0)
			max = i3;
		System.out.println("Maximum: " +max);
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//Input Integers
		System.out.println("Enter first integer:");
		Integer I1 = sc.nextInt();
		System.out.println("Enter 2nd integer:");
		Integer I2 = sc.nextInt();
		System.out.println("Enter 3rd integer:");
		Integer I3 = sc.nextInt();
		GenericClass genericsObj ;
		new GenericClass<Integer>(I1, I2, I3);
		GenericClass.maximumGeneric(I1, I2, I3);
		
		//Input Floats
		System.out.println("Enter first float number:");
		Float F1 = sc.nextFloat();
		System.out.println("Enter 2nd float number:");
		Float F2 = sc.nextFloat();
		System.out.println("Enter 3rd float number:");
		Float F3 = sc.nextFloat();
		new GenericClass<Float>(F1,F2,F3);
		GenericClass.maximumGeneric(F1,F2,F3);
		
		//Input Strings
		System.out.println("Enter first String:");
		String S1 = sc.next();
		System.out.println("Enter 2nd String:");
		String S2 = sc.next();
		System.out.println("Enter 3rd String:");
		String S3 = sc.next();
		new GenericClass<String>(S1,S2,S3);
		GenericClass.maximumGeneric(S1,S2,S3);
	}
}
