package exercise.starloop;

public class Ex4While {

	public static void main(String[] args) {
		int line =5;
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=line-i) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=((i*2)-1)) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
