package exercise.looping;

public class LoopingEx6While {

	public static void main(String[] args) {
		int num=9876;
		System.out.println("Number of digit : "+countDigit(num));
} 
	public static int countDigit(int n) {
		int total=0;
		int i=n;
		while(i>0) {
			total+=1;
			i/=10;
		}
		return total;
	}
}
