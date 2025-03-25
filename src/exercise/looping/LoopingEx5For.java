package exercise.looping;

public class LoopingEx5For {

	public static void main(String[] args) {
		int num=5;
		multiplicationTable(num);
}
	public static void multiplicationTable(int n) {
		System.out.println("Number : "+n);
		for(int i=1;i<=10;i++) {
			int total = n*i;
			System.out.println(n+" x "+i+" = "+total);
		}
	}
}
