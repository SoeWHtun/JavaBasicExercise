package exercise.looping;

public class LoopingEx5While {
	public static void main(String[] args) {
		int num=5;
		multiplicationTable(num);
}
	public static void multiplicationTable(int n) {
		System.out.println("Number : "+n);
		int i = 1;
		while(i<=10) {
			int total = n*i;
			System.out.println(n+" x "+i+" = "+total);
			i++;
		}
	}
}
