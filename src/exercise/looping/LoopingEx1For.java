package exercise.looping;

public class LoopingEx1For {
     
	public static void main(String[] args) {
		int num=5;
		System.out.println("Factorial of "+num+" is "+ factorial(num));
	}
	public static int factorial(int num){
		int factorial=1;
		for(int i=num;i>0;i--) {
	           factorial*=i;
			}
		return factorial;
	}

}
