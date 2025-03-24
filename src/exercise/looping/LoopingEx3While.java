package exercise.looping;

public class LoopingEx3While {

	public static void main(String[] args) {
		int d1=0;
		System.out.println(d1);
		int d2=1;
		System.out.println(d2);
		int i=0;
		while(i<=3) {
			int total = d1 + d2;
			d1=d2;
			d2=total;
			System.out.println(total);
			i++;
		}
		
	
	}

}
