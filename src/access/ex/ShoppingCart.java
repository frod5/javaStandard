package access.ex;

public class ShoppingCart {

	private Item[] items = new Item[10];
	private int itemCount;

	public void addItem(Item item) {
		if(itemCount >= items.length) {
			System.out.println("장바구니에 최대 10개 까지만 담을 수 있다.");
			return;
		}

		items[itemCount] = item;
		itemCount++;
	}
	public void displayItems() {
		for (Item item : items) {
			if(item != null) {
				System.out.println("상품명 : " + item.getName() + " 합계: " + item.getTotalPrice());
			}
		}
		System.out.println("전체 가격 합: " + calculateTotalPrice());
	}

	private int calculateTotalPrice() {
		int totalPrice = 0;
		for (Item item : items) {
			if(item != null) {
				totalPrice += item.getTotalPrice();
			}
		}
		return totalPrice;
	}

}
