package exercise.looping;

public class LoopinEx2While {
	
	public static void main(String[] args) {
		int total=0;
		System.out.println("Number from 1 to 100 :");
		int i=1;
		while(i<=100) {
			System.out.println(i);
			total+=i;
			i++;
		}
		System.out.println("Sum of number from 1 to 100 : "+total);
	}

}
