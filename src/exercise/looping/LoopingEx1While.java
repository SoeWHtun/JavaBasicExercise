package exercise.looping;

public class LoopingEx1While {
	
	public static void main(String[] args) {
		int factorial=1;
		int i=5;
		while(i>0) {
			factorial*=i;
			i--;
		}
		System.out.println("Factorial of 5 is "+factorial);
	}
}
