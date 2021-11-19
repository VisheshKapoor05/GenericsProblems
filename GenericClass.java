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
		
		//Input Floats
		System.out.println("Enter first float number:");
		Float F1 = sc.nextFloat();
		System.out.println("Enter 2nd float number:");
		Float F2 = sc.nextFloat();
		System.out.println("Enter 3rd float number:");
		Float F3 = sc.nextFloat();
		new GenericClass<Float>(F1,F2,F3);
		GenericClass.maximumGeneric(F1,F2,F3);
		

	}
}
