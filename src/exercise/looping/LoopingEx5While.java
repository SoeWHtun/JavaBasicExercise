package exercise.looping;

public class LoopingEx5While {
	public static void main(String[] args) {
		int num=5;
		System.out.println("Number : "+num);
		int i = 1;
		while(i<=10) {
			int total = num*i;
			System.out.println(num+" x "+i+" = "+total);
			i++;
		}
}
}
