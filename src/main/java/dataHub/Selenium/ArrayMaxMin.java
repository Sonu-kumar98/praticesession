package dataHub.Selenium;

import java.util.Scanner;

public class ArrayMaxMin {
	public int max(int a[]) {
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		return max;

	}

	public int min(int a[]) {
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		return min;

	}

	public static void main(String[] args) {
		System.out.println("Please enter size of array");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Please enter value inside the array");
		int a[] = new int[n];		
	    for(int i =0;i<n;i++) {
		 a[i]=s.nextInt();
	     }	    
		ArrayMaxMin a2 = new ArrayMaxMin();
		System.out.println(a2.max(a));
		System.out.println(a2.min(a));

	}

}
