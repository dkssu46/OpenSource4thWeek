public class Q4_4 {
	
	public static class Book {
		String title;
		String author;
		
		
		public Book(String t) { // ���� �ϳ� ������
		title = t; author = "���ڹ̻�";
		}
		
		
		public Book(String t, String a) { // ���� �ΰ� ������
		title = t; author = a;
		}
	}
	
	
		public static void main(String [] args) {
		Book littlePrince = new Book("�����", "�������丮");
		Book loveStory = new Book("������");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
		}
}
