package exercise.looping;

public class LoopingEx6While {

	public static void main(String[] args) {
		int num=9876;
		int total=0;
		int i=num;
		while(i>0) {
			total+=1;
			i/=10;
		}
		System.out.println("Number of digit : "+total);
} 
}
