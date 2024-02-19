package extends1.ex;

public class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("상품이름 : " + name + ", 가격: " + price);
	}
}
