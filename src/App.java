import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test0 = {6, 7, 2, 4, 3, 5};
		
		System.out.println("test0:");
		print(test0);
		print(sortedSquaredArray(test0));
		

	}
	
	public static int[] sortedSquaredArray(int[] array) {
		
		int[] sortedSquares = new int[array.length];
		int left = 0;
		int right = array.length - 1;
		
		for(int i = right; i >= 0; i--) {
			int small = array[left];
			int large = array[right];
			
			if(Math.abs(small) > Math.abs(large)) {
				sortedSquares[i] = small * small;
				left++;
			} else {
				sortedSquares[i] = large * large;
				right--;
			}
		}
		Arrays.sort(sortedSquares);
		return sortedSquares;
	}
	
	public static void print(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1]);
	}

}
