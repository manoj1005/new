package simplilearn;

import java.util.Arrays;
import java.util.Scanner;

public class Dsa {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[]= {10,12,15,9,6,35,56,435,454,343,34,24,54,545};
	System.out.println("Enter a number");
	int key = sc.nextInt();
	Arrays.sort(a);
	System.out.println("Sorted array");
	for(int j:a) {
		System.out.println(j+" ");
	}
	int low =0;
	int high =a.length-1;
	int mid =0;
	while(low<=high) {
		mid=(low+high)/2;
		if(a[mid]==key) {
			System.out.println("The element found at "+(mid+1)+" position");
			break;
		}
		else if(a[mid]<key){
			low=mid+1;
			high=high;
		}
		else {
			low =0;
			high =mid-1;
		}
	
	}
}
}
