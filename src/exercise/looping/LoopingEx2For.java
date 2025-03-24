package exercise.looping;

public class LoopingEx2For {
	
	public static void main(String[] args) {
		int total=0;
		System.out.println("Number from 1 to 100 :");
		for(int i=1;i<=100;i++) {
	           System.out.println(i);
	           total+=i;
			}
		System.out.println("Sum of number from 1 to 100 : "+total);
	}
}
