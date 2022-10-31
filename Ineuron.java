package pattern;

public class Ineuron {

	public static void main(String[] args) {
		int n=10;
		// 1.Write a program(WAP) to print INEURON using pattern programming logic.
        for(int i=0;i<n;i++){
        	 for(int j=0;j<n;j++){//this loop is for R
                 if(j==0||i==0&&j<n-1||j==n-1&&i<(n-1)/2||i-j==(n-1)/2-1||i==(n-1)/2&&j<n-1 ){
                     System.out.print("*");
                 }else{
                     System.out.print(" ");
                 }
             }
             System.out.print(" ");
             

        	for(int j=0;j<n;j++) { //this is for A
        		if(i==0&&j<n-1&&j>0||j==0&&i>0||j==n-1&&i>0||i==(n-1)/2) {
        			System.out.print("*");
        		}else {
        			System.out.print(" ");
        		}
        	}
        	System.out.print(" ");
        	
        	for(int j=0;j<n;j++) {//this is for G 
        		if(i==0||j==0||i==n-1||j==n-1&&i>=(n-1)/2||i==(n-1)/2&&j>=(n-1)/2) {
        			System.out.print("*");
        		}else {
        			System.out.print(" ");
        		}
        	}
        	System.out.print(" ");
        	for(int j=0;j<n;j++) {// this is for H
        		if(j==0||i==(n-1)/2||j==n-1) {
        			System.out.print("*");
        		}else {
        			System.out.print(" ");
        		}
        	}
        	System.out.print(" ");

            for(int j=0;j<n;j++){//this is for U
                if(j==0&&i<n-1||i==n-1&&j>0&&j<n-1 ||j==n-1&&i<n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            
            System.out.println();
      }
        
 for(int i=0;i<n;i++) {
	 for(int j=0;j<n;j++){// this loop is for I
         if(i==0 || j==(n-1)/2|| i==n-1) {
             System.out.print("*");
         }else{
             System.out.print(" ");
         }
     }
    
     for(int j=0;j<n;j++){// this is for N
         if(j==0||i==j||j==n-1){
             System.out.print("*");
         }else{
             System.out.print(" ");
         }
     }

     System.out.print("  ");

     for (int j = 0; j < n; j++) {// this is for E
         if(j==0||i==0||i==(n-1)/2||i==n-1){
             System.out.print("*");
         }else{
             System.out.print(" ");
         }
     }

     System.out.print("  ");

     for(int j=0;j<n;j++){//this is for U
         if(j==0&&i<n-1||i==n-1&&j>0&&j<n-1 ||j==n-1&&i<n-1){
             System.out.print("*");
         }else{
             System.out.print(" ");
         }
     }

     System.out.print("  ");

     for(int j=0;j<n;j++){//this loop is for R
         if(j==0||i==0&&j<n-1||j==n-1&&i<(n-1)/2||i-j==(n-1)/2-1||i==(n-1)/2&&j<n-1 ){
             System.out.print("*");
         }else{
             System.out.print(" ");
         }
     }

     System.out.print("  ");
 for (int j = 0; j < n; j++) {// this is for O
     if(j==0&&i>0&&i<n-1||i==0&&j>0&&j<n-1||j==n-1&&i>0&&i<n-1||i==n-1&&j>0&&j<n-1){
         System.out.print("*");
     }else{
         System.out.print(" ");
     }
 }
     System.out.print("  ");
 for(int j=0;j<n;j++){// this is for N
     if(j==0||i==j||j==n-1){
         System.out.print("*");
     }else{
         System.out.print(" ");
     }
 }
 System.out.println();
 }
 }

}
