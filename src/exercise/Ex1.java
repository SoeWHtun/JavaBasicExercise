package exercise;

public class Ex1 {

	public static void main(String[] args) {
		double width = 11.5;
		double height = 5.5;
		double rectangleArea = calculateRectangleArea(width,height);
		System.out.println("Rectangle Area : "+ rectangleArea);
		
       
	}
    public static double calculateRectangleArea(double w, double h) {
    	double area = w * h;
    	return area;
    }
}
