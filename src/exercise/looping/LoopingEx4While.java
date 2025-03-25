package exercise.looping;

public class LoopingEx4While {

	public static void main(String[] args) {
		int num=12345;
		System.out.println("Number : "+num);
        System.out.println("Reverse Number : "+reverseNumber(num));
}  
	public static int reverseNumber(int n) {
		int reverseNum=0;
		int i=n;
		while(i>0) {
		 int r=i%10;
		 reverseNum*=10;
		 reverseNum+=r;
		 i/=10;
	}   
		return reverseNum;
	}
}

