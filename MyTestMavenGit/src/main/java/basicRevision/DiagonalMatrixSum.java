package basicRevision;

public class DiagonalMatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 10 }, { 2, 9 } };
		int sum = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (i == j)
					sum = sum + a[i][j];
			}
		}
		System.out.println(sum);
	}

}
