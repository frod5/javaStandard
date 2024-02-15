package ref.ex;

public class ProductOrderMain2 {
	public static void main(String[] args) {

		ProductOrder[] productOrders = {
			createProductOrder("두부", 2000, 2),
			createProductOrder("김치", 5000, 1),
			createProductOrder("콜라", 1500, 2)
		};

		printProductOrder(productOrders);
		System.out.println("총 결제 금액 : " + getTotalCost(productOrders));
	}

	static ProductOrder createProductOrder(String productName, int price, int quantity) {
		ProductOrder po = new ProductOrder();
		po.productName = productName;
		po.price = price;
		po.quantity = quantity;

		return po;
	}

	static void printProductOrder(ProductOrder[] orders) {
		for (ProductOrder po : orders) {
			System.out.println("상품명: " + po.productName + " 가격: " + po.price + " 수량: " + po.quantity);
		}
	}

	static int getTotalCost(ProductOrder[] orders) {
		int totalCost = 0;
		for (ProductOrder po : orders) {
			totalCost += po.price * po.quantity;
		}
		return totalCost;
	}
}
