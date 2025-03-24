package exercise.looping;

public class LoopingEx7For {

	public static void main(String[] args) {
		int num=10;
		int evenTotal=0;
		int oddTotal=0;
		for(int i=0;i<=num;i+=2) {
			evenTotal+=i;
		}
		System.out.println("Sum of even numbers : "+evenTotal);
		for(int j=1;j<=num;j+=2) {
			oddTotal+=j;
		}
		System.out.println("Sum of odd numbers : "+oddTotal);
	}

}
