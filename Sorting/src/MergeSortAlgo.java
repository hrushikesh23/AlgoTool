import java.util.Scanner;

public class MergeSortAlgo {

	private int array[];
	private int tempArray[];
	private int length;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Merge sort test\n");
		int n, i;
		System.out.println("Enter no of integer element");
		n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter" + n + "integer elements=");
		for (i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		MergeSortAlgo algo = new MergeSortAlgo();
		algo.sort(arr);
		System.out.println("\nElement after sorting::");
		for (i = 0; i < n; i++)
			System.out.println(arr[i] + " ");
		System.out.println();

	}

	public void sort(int arr[]) {
			this.array=arr;
			this.length=arr.length;
			this.tempArray= new int[length];
			doMergeSort(0,length-1);
	}
	
	private void doMergeSort(int lowerIndex,int higherIndex){
		if(lowerIndex<higherIndex){
			int middle = lowerIndex +(higherIndex - lowerIndex)/2;
			doMergeSort(lowerIndex ,middle);
			doMergeSort(middle+1, higherIndex);
			mergeParts(lowerIndex,middle,higherIndex);
		}
	}
	
	private void mergeParts(int lowerIndex,int middle,int higherIndex){
		for(int i=lowerIndex; i<=higherIndex;i++){
			tempArray[i]=array[i];			
		}
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		
		while(i<=middle && j<= higherIndex){
			if(tempArray[i]<=tempArray[j]){
				array[k] = tempArray[i];
				i++;
			} else{
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}
		
		while(i<=middle){
			array[k]=tempArray[i];
			k++;
			i++;
		}
		
		while(j<=higherIndex){
			array[k]=tempArray[j];
			k++;
			j++;
		}
		
	}
	
		
}
