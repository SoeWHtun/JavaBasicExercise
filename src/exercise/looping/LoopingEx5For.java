package exercise.looping;

public class LoopingEx5For {

	public static void main(String[] args) {
		int num=5;
		System.out.println("Number : "+num);
		for(int i=1;i<=10;i++) {
			int total = num*i;
			System.out.println(num+" x "+i+" = "+total);
		}
}
}
