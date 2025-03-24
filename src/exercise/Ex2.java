package exercise;

public class Ex2 {

	public static void main(String[] args) {
		double base = 8.5;
		double height = 16;
		double triangleArea = calculateTriangleArea(base,height);
		System.out.println("Triangle Area : "+triangleArea);

	}
	public static double calculateTriangleArea(double b, double h) {
		double area = (b * h) / 2;
		return area;
	}

}
