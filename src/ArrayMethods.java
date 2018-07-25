import java.util.Arrays;

public class ArrayMethods {
	
	public static void main(String[] args) {
		int[] arr = {6, 54, 3, 22, 1};
		
		//parallel arrays allow us to maintain an associated list
		//of different types
		//should have the same length, and reference the same index locations
		String[] names = {"Alex", "Brandon", "Michelle"};
		int[] jerseyNums = {22, 81, 1};
		
		for(int i = 0; i <= names.length - 1; i++ )  {
			
			System.out.println("Name: " + names[i] + " Jersey #: " + jerseyNums[i]);
		}
		
		
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.fill(arr,  100);
		System.out.println(Arrays.toString(arr));//fills entire array with same result
		
		Arrays.fill(arr, 1, 3, 202);//fills index between a range thats not inclusive
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {6, 54, 3, 22, 1};
		int[] arr3 = {6, 54, 3, 22, 1};
		System.out.println(Arrays.equals(arr2, arr3));//will return true
		System.out.println(Arrays.equals(arr, arr2));//will return false because we made modifications
		
		int[] arr4 = {3, 4, 5, 6};
		int[] arr5 = arr4;//dont do this -- this is bad will change original value 
		
		System.out.println("Array 4: " + Arrays.toString(arr4));
		System.out.println("Array 5: " + Arrays.toString(arr5));
		arr5[2] = 160;
		System.out.println("Array 4: " + Arrays.toString(arr4));
		System.out.println("Array 5: " + Arrays.toString(arr5));
		
		//to overcome reference pointer/copy issues we will use methods
		int[] arr6 = Arrays.copyOf(arr4, arr4.length)};

}
