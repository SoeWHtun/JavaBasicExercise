package exercise.looping;

public class LoopingEx6For {
 
	public static void main(String[] args) {
		int num=9876;
		System.out.println("Number of digit : "+countDigit(num));
} 
	public static int countDigit(int n) {
		int total=0;
		for(int i=n;i>0;i/=10) {
			total+=1;
		}
		return total;
	}
}
