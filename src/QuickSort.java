import java.util.Arrays;
import java.util.Scanner;

class QuickSort {
	 

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of terms");
		int n = sc.nextInt();

		System.out.println("Enter the terms");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("The unsorted array is:");
		System.out.println(Arrays.toString(arr));

		quicksort(arr, 0, arr.length - 1);

		System.out.println("The sorted array is:");
		System.out.println(Arrays.toString(arr));
	}

	static void quicksort(int arr[], int start, int end) {
		if (start < end) {
			int pIndex = partition(arr, start, end);
			quicksort(arr, start, pIndex - 1);
			quicksort(arr, pIndex + 1, end);
		}
	}

	static int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				swap(arr, i, pIndex);
				pIndex++;
			}
		}
		swap(arr, pIndex, end);
		return pIndex;
	}

	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}