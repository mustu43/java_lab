package javaexamples;

public class static1 {
	static int a, b, c,d;  //Creating static variables
	static { 
		//block 1
		a = 15; 
		b = 25;
		c = 35;
		// assigning the values of the variables a,b.
		d = a + b + c; 	
		// adding the values of the variables a and b and storing it in c.
	}
	static {
		// As it is a static block and the variables are also static it can accessed here as well
		System.out.println("Value of a : " + a + "\nValue of b : " + b + "\nValue of c : " + c);
		System.out.println("Sum of a + b + c = " + d);
	}

	static int cube(int x) {
		return x * x * x;
		// multiplying the values of 3times to get cubic value
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = cube(2); 
		// we are calling the cube method which is static and calling without the class name.
		// The return value of the function is stored in the variable res.
		System.out.println("Cube of the given number  is : "+res);
		// we are printing the result here
		System.out.println("Checking whether the main function code will execute first or invoke all static blocks");

	}
}