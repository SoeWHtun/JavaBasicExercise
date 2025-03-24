package exercise.looping;

public class LoopingEx3For {
	
	public static void main(String[] args) {
		int d1=0;
		System.out.println(d1);
		int d2=1;
		System.out.println(d2);
		for(int i=0;i<=3;i++) {
			int total = d1 + d2;
			d1=d2;
			d2=total;
			System.out.println(total);
		}
		
	}
}
