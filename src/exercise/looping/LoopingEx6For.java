package exercise.looping;

public class LoopingEx6For {
 
	public static void main(String[] args) {
		int num=9876;
		int total=0;
		for(int i=num;i>0;i/=10) {
			total+=1;
		}
		System.out.println("Number of digit : "+total);
} 
}
