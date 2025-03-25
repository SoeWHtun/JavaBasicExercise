package exercise.starloop;

public class Ex3While {

	public static void main(String[] args) {
		int line = 5;
		int i=1;
		while(i<=5 ) {
			int j=1;
			while( j<=line-i) {
				System.out.print(" ");
				j++;
			}
			int s=1;
			while( s<=i) {
				System.out.print("*");
				s++;
			}
			
			System.out.println();
			i++;
		}
	}

}
