package pattern;

public class VShapedPattern {

	public static void main(String[] args) {
		int n=10;
		// 4. WAP to print
		//*                 *
		//* *             * *
		//* * *         * * *
		//* * * *     * * * *
		//* * * * * * * * * *
		//* * * * * * * * * *

		        for (int i = 0; i < n; i++) {
		            for(int j=0;j<n;j++){
		                if(i==n-1||i-j>=(n-1)/2||j==0&&i>=(n-1)/2||i+j>=3*(n-1)/2||j==(n-1)&&i>=(n-1)/2){
		                    System.out.print("*");
		                }else{
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
	}

}
