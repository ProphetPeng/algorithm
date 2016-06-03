package com;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,8,2,3,9,5,7,19};
		quicksort(0,7,a);
		for(int i=0; i<8; i++)
			System.out.println(a[i]);
	}
	
	public static void quicksort(int l, int r, int[] arr) {
		int j=l+1;
		for(int i=l+1; i<=r; i++) {
			if(arr[i] < arr[l]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] =tmp;
				j++;
			};
		}
		int tmp = arr[j-1];
		arr[j-1] = arr[l];
		arr[l] = tmp;
	    if(l<j-2) quicksort(l, j-2, arr);
	    if(j<r) quicksort(j, r, arr);
	}

}
