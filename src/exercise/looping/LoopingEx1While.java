package exercise.looping;

public class LoopingEx1While {
	
	public static void main(String[] args) {
		int num=5;
		System.out.println("Factorial of "+num+" is "+ factorial(num));
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
