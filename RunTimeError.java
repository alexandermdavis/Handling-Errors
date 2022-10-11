
public class RunTimeError {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		arr[9] = 250;
		
//The size of the array is only 5 but we are trying to assign a value at index 9. The runtime error is present at line 7.		
		
		System.out.println("Value assigned!");

	}

}
