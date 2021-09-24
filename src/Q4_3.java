public class Q4_3 {
	
	
	public static class Circle {
		int radius;
		String name;
		
		
		public Circle() { //인자없는 생성자
		radius = 1; name = "";
		}
		
		public Circle(int r, String n) { //인자 2개 생성자
		radius = r; name = n;
		}
		
		public double getArea() {
		return 3.14*radius*radius;
		}	
	}
	
	
		public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		Circle donut = new Circle();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		}
		
		
		
}
