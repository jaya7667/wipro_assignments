package Array_session;
public class TwoDPatten {
	public static void main(String[] args) {
		int[][] a = new int[4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				a[i][j] = j+1;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
