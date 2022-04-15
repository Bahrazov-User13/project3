package Laba_4;

public class BubbleSort {
	public static int[] bubbleSort(int[] array) {
		int[] sort_array = new int[7];
		for (int i=0; i<7; i++) {
			sort_array[i] = array[i];
		}
		int buf;
		for (int j=0; j<sort_array.length-1; j=j+1) {
			for (int i = 0; i < sort_array.length-1; i=i+1) {
				if(sort_array [i] > sort_array [i+1]) {
					buf = sort_array[i];
					sort_array[i] = sort_array[i+1];
					sort_array [i+1] = buf;	
				}
			}
		}
		return sort_array;
	}
}
