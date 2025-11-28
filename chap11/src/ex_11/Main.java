package ex_11;

public class Main {
	public static void main(String[] args) {
		Book b = new Book("無名の本", 1200, "赤", "isbn");

		System.out.println(b.getName());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
		System.out.println(b.getIsbn());

		Computer c = new Computer("MX-5090-i713", 350000, "赤", "MSI" );
		System.out.println(c.getName());
		System.out.println(c.getPrice());
		System.out.println(c.getColor());
		System.out.println(c.getMakerName());


	}
}
