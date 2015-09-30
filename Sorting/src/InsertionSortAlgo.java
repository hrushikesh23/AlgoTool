import java.util.Scanner;

public class InsertionSortAlgo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Insertion sort test::\n");
		int n, i;
		System.out.println("Enter the no of elements::\n");
		n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the " + n + " elements\n");
		for (i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		InsertionSortAlgo algo = new InsertionSortAlgo();
		algo.doInsertionSort(arr);
	}

	private void doInsertionSort(int arr[]) {

		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		System.out.println("sorted array is::");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+"\n");
	}

}
