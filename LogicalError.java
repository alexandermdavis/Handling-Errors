
public class LogicalError {

	public static void main(String[] args) {
		
		int a = 2, b = 8, c = 6;
		
		System.out.println("Finding the largest number \n");
		
		if (a > b && a > c)
			
			System.out.println(a + " is the largest Number");
		
		else if (b > a && b > c)
		
			System.out.println(b + " is the smallest Number");

		else
			
			System.out.println(c + " is the largest Number");

//Logical errors are when the program runs but does not give an output that you want. This is due to the incorrect use of logical operators or logical issues with your implementation.
//The result here should say 8 is the largest number.
		
	}

}
