package exercise.looping;

public class LoopingEx1While {
	
	public static void main(String[] args) {
		System.out.println("Factorial of 5 is "+ factorial(5));
	}

	public static int factorial(int num){
		int factorial=1;
		int i=num;
		while(i>0) {
			factorial*=i;
			i--;
		}
		return factorial;
	}
}
