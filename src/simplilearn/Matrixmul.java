package simplilearn;
import java.util.Scanner;
public class Matrixmul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the row");
		int row = sc.nextInt();
		System.out.println("Enter the size of the col");
		int col = sc.nextInt();
		int ar[][]=new int[row][col];
		int pr[][]=new int[row][col];
		int apr[][]=new int[row][col];
		for(int i =0;i<row;i++) {
			for(int j =0;j<row;j++) {
				System.out.println("Enter ar "+i+j+" details");
				ar[i][j]=sc.nextInt();
				System.out.println("Enter pr "+i+j+" details");
				pr[i][j]=sc.nextInt();
			}	
		}
		
		for(int i =0;i<row;i++) {
			for(int j =0;j<row;j++) {
				for(int k=0;k<row;k++) {
					apr[i][j] += ar[i][k]*pr[k][j];
				}
			}
		}
		for(int i =0;i<row;i++) {
			for(int j =0;j<row;j++) {
				System.out.print(apr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
