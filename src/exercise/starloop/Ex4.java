package exercise.starloop;

public class Ex4 {

	public static void main(String[] args) {
		int line = 5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=line-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=((i*2)-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
