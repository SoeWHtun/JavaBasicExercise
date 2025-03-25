package exercise.starloop;

public class Ex3 {

	public static void main(String[] args) {
		int line = 5;
		for(int i = 1; i<=5 ; i++) {
			
			for(int j=1; j<=line-i; j++) {
				System.out.print(" ");
			}
			for(int s=1; s<=i; s++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
