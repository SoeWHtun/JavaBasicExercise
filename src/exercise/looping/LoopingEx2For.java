package exercise.looping;

public class LoopingEx2For {
	
	public static void main(String[] args) {
		int num =100;
		sumTotal(num);
	}
	public static void sumTotal(int n) {
		int total=0;
		System.out.print("Number from 1 to "+n+" : ");
		for(int i=1;i<=n;i++) {
	           System.out.print(i+" ");
	           total+=i;
			}System.out.println("");
		System.out.println("Sum of number from 1 to "+n+" : "+total);
	}
}
