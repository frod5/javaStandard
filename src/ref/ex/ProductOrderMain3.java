package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 주문의 개수를 입력하세요:");

		ProductOrder[] productOrders = new ProductOrder[scanner.nextInt()];

		scanner.nextLine();

		for (int i = 0; i < productOrders.length; i++) {
			System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
			System.out.print("상품명: ");
			String productName = scanner.nextLine();
			System.out.print("가격: ");
			int price = scanner.nextInt();
			System.out.print("수량: ");
			int quantity = scanner.nextInt();

			scanner.nextLine();
			productOrders[i] = createProductOrder(productName, price, quantity);
		}

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
