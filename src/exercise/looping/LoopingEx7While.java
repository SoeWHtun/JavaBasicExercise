package exercise.looping;

public class LoopingEx7While {

	public static void main(String[] args) {
		int num=10;
		int evenTotal=0;
		int oddTotal=0;
		int i=0;
		int j=1;
		while(i<=num) {
			evenTotal+=i;
			i+=2;
		}
		System.out.println("Sum of even numbers : "+evenTotal);
		while(j<=num) {
			oddTotal+=j;
			j+=2;
		}
		System.out.println("Sum of odd numbers : "+oddTotal);
	}
}
