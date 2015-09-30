import java.util.Scanner;

public class MySelectionAlgo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Selection sort Test::");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of elements::");
		int n, i;
		n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the " + n + " elements:::");
		for (i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		MySelectionAlgo algo = new MySelectionAlgo();
		algo.doSelectionSort(arr, n);

	}

	private void doSelectionSort(int arr[], int n) {

		for (int i = 0; i < n - 2; i++) {
			int index = i;
			for (int j = i + 1; j < n - 1; j++)
				if (arr[j] < arr[index])
					index = j;
			
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;

		}
		System.out.println("Sorted elements are::");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i] + "\t");

	}

}
