package exercise.looping;

public class LoopingEx4For {
	
	public static void main(String[] args) {
		int num=12345;
		System.out.println("Number : "+num);
        System.out.println("Reverse Number : "+reverseNumber(num));
}
	public static int reverseNumber(int n) {
		int reverseNum=0;
		for(int i=n;i>0;i/=10) {
			 int r=i%10;
			 reverseNum*=10;
			 reverseNum+=r;
		}   
		return reverseNum;
	}
}