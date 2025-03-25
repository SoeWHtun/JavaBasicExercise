package exercise.looping;

public class LoopingEx3For {
	
	public static void main(String[] args) {
		int d1=0;
		int d2=1;
		fabonacciSequence(d1,d2);	
	}
	public static void fabonacciSequence(int n1,int n2) {
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<=3;i++) {
			int total = n1 + n2;
			n1=n2;
			n2=total;
			System.out.print(total+" ");
		}
	}
}
