package overload;

public class Overload{
	public static double clacTriangleArea(double bottom, double height){
		double Tri = bottom * height; 
		return Tri;
	}
	public static double calcCircleArea(double radius){
		double Cir = radius * radius * 3.14;
		return Cir;
	}
	public static void main (String[] args){
		double tri = clacTriangleArea(8.5,6.5);
		double Cir = calcCircleArea(8.2);
		System.out.println("円の面積" + Cir);
		System.out.println("三角の面積" +   tri);
	}
}
