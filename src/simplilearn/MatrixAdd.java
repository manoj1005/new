package simplilearn;
import java.util.Scanner;
public class MatrixAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row");
		int row = sc.nextInt();
		System.out.println("Enter the size of col");
		int col = sc.nextInt();
		int ar[][] = new int[row][col];
		int pr[][] = new int[row][col];
		int apr[][] = new int[row][col];
		for(int i =0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.println("Enter ar"+i+j);
				ar[i][j]=sc.nextInt();
				System.out.println("Enter pr"+i+j);
				pr[i][j]=sc.nextInt();
			}
		}
		for(int i =0;i<row;i++) {
			for(int j =0;j<col;j++) {
				apr[i][j]=ar[i][j]+pr[i][j];
			}
		}
		System.out.println("apr");
		for(int i =0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.print(apr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
