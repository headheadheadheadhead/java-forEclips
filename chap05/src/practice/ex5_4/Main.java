package practice.ex5_4;

public class Main {
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}

	public static double calcCircleArea (double radius) {
		return radius * radius * 3.14;
	}

	public static void main (String[] args) {
		double ans1 = calcTriangleArea(10, 5);
		double ans2 = calcCircleArea (5);

		System.out.println(ans1);
		System.out.println(ans2);
	}
}
