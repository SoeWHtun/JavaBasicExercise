package exercise.looping;

public class LoopinEx2While {
	
	public static void main(String[] args) {
		int num=100;
		sumTotal(num);
	}
	public static void sumTotal(int n) {
		int total=0;
		System.out.print("Number from 1 to "+n+" : ");
		int i=1;
		while(i<=n) {
			System.out.print(i+" ");
			total+=i;
			i++;
		}System.out.println("");
		System.out.println("Sum of number from 1 to "+n+" : "+total);
	}

}
