import java.util.Scanner;

public class MyBubbleSortAlgo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bubble sort Test::");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of elements::");
		int n, i;
		n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the " + n + " elements::");
		for (i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		MyBubbleSortAlgo algo = new MyBubbleSortAlgo();
		algo.doBubbleSort(arr, n);

	}

	private void doBubbleSort(int arr[], int n) {

		int temp;
		for (int k = 0; k < n - 1; k++) {
			for (int i = 0; i < n-k-1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.println("Sorted elements are::");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i] + "\t");
	}
}