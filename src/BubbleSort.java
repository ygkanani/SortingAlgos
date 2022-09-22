
public class BubbleSort {
	
	void bubbleSort(int arr[]) {
		int n = arr.length;
//		Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					// swap smaller arr[j+1] with bigger arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort ob = new BubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Input array:");
		ob.printArray(arr);
		ob.bubbleSort(arr);
		System.out.println("Sorted array:");
		ob.printArray(arr);
	}

}
