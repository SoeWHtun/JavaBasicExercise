package exercise.looping;

public class LoopingEx7For {

	public static void main(String[] args) {
		int num=10;
		System.out.println("Sum of even numbers : "+sumEven(num));
		System.out.println("Sum of odd numbers : "+sumOdd(num));
	}
	public static int sumEven(int n1) {
		int evenTotal=0;
		for(int i=0;i<=n1;i+=2) {
			evenTotal+=i;
		}
		return evenTotal;
	}
	public static int sumOdd(int n2) {
		int oddTotal=0;
		for(int j=1;j<=n2;j+=2) {
			oddTotal+=j;
		}
		return oddTotal;
	}

}
