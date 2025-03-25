package exercise.looping;

public class LoopingEx7While {

	public static void main(String[] args) {
		int num=10;
		System.out.println("Sum of even numbers : "+sumEven(num));
		System.out.println("Sum of odd numbers : "+ sumOdd(num));
	}
	public static int sumEven(int n1) {
		int evenTotal=0;
		int i=0;
		while(i<=n1) {
			evenTotal+=i;
			i+=2;
		}
		return evenTotal;
	}
	public static int sumOdd(int n2) {
		int oddTotal=0;
		int j=1;
		while(j<=n2) {
			oddTotal+=j;
			j+=2;
		}
		return oddTotal;
	}
}
