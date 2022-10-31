package pattern;

public class NumberPattern {

	public static void main(String[] args) {
//      2. Write a program to print
//      1 1 1 1
//      2 2 2 2
//      3 3 3 3
//      4 4 4 4
      for(int i=0;i<4;i++){
          for(int j=0;j<4;j++){
              System.out.print(i+1);
          }
          System.out.println();
      }
	}

}
