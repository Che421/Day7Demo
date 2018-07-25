import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
		//arrays must be declared with a size
		int[] arr = new int [4];//the values by default are 0 for indexes 0-3
		
		arr[0] = 55;
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			arr[2] = 77;
			
			System.out.println(arr[i]);
			System.out.println(arr[2]);
			
		}
		String name = "John";
		String[] arr2 = {name, "Ben", "Cheo", "Camila"};
		System.out.println(arr2[0]);
		
		//declaring and assigning a size in 2 steps
		final int SIZE = 105;
		double[] arr3;
		arr3= new double[SIZE];
		
		
		//decalring and assigning a size in 1 step
		double[] arr4 = {4.5, 6.8,9.9,10.7};
		
		
		//let a user assign the size
		System.out.println("Hey! Please enter a number: ");
		int userNum = scan.nextInt();
		
		boolean arr5[] = new boolean[userNum];
		System.out.println(arr5.length);
		
		//enhanced for loop aka for each
		//the disadvantage to using this is that we don't have access to index
		for(boolean temp : arr5) {
			System.out.println(temp);
		int[] nums = {6, 7, 23, 44, 8};	
		System.out.println(sumArray(nums));
				
		}
		//can make arrays of Objects like a Robot
		//by defoult if not value added the value is null
		Robot[]robotArr = new Robot[2];
		robotArr[0] = new Robot ("Grant Chirpus", 5);
		
		for (Robot r : robotArr)  {
			System.out.println(r);
		}
		
			
		scan.close();
	}
		public static int sumArray(int[] arr)  {
			int sum = 0;
			for(int temp : arr)  {
				sum += temp;//sum = sum + temp
			}
			
						
			return sum;
			
		}

}
