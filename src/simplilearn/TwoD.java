package simplilearn;
import java.util.Arrays;
import java.util.Scanner;
public class TwoD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int row = sc.nextInt();
		System.out.println("Enter col size");
		int col = sc.nextInt();
		int Arr[][]=new int[row][col];
		System.out.println("the size of array"+Arr.length);
		for(int i =0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.println("For each "+i+","+j+" value");
				Arr[i][j]=sc.nextInt();
			}
	}
		for(int i =0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
	}
		System.out.println("Transpose matrix is");
		for(int i =0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.print(Arr[j][i]+" ");
			}
			System.out.println();
	}
	}
}
