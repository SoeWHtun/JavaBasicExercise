package exercise.looping;

public class LoopingEx1While {
	
	public static void main(String[] args) {
<<<<<<< Updated upstream
=======
		int num=5;
		System.out.println("Factorial of "+num+" is "+ factorial(num));
	}

	public static int factorial(int num){
>>>>>>> Stashed changes
		int factorial=1;
		int i=5;
		while(i>0) {
			factorial*=i;
			i--;
		}
		System.out.println("Factorial of 5 is "+factorial);
	}
}
