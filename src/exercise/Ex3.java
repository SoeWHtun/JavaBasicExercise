package exercise;

public class Ex3 {

	public static void main(String[] args) {
		double radius = 8.5;
		double circleArea = calculateCircleArea(radius);
		System.out.println("Circle Area : "+circleArea);

	}
   public static double calculateCircleArea(double r) {
	   double area = 3.14 * (Math.pow(r, 2));
	   return area;
   }
}
