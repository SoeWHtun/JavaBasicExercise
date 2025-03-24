package exercise.looping;

public class LoopingEx1For {
     
	public static void main(String[] args) {
		int factorial=1;
		for(int i=5;i>0;i--) {
	           factorial*=i;
			}
		System.out.println("Factorial of 5 is "+factorial);
	}

}
