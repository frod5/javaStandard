package class1.ex;

public class ProductOrderMain {
	public static void main(String[] args) {
		ProductOrder product1 = new ProductOrder();
		ProductOrder product2 = new ProductOrder();
		ProductOrder product3 = new ProductOrder();

		product1.productName = "두부";
		product1.price = 2000;
		product1.quantity = 2;

		product2.productName = "김치";
		product2.price = 5000;
		product2.quantity = 1;

		product3.productName = "콜라";
		product3.price = 1500;
		product3.quantity = 2;

		ProductOrder[] productOrders = {product1, product2, product3};
		int totalCost = 0;

		for (ProductOrder productOrder : productOrders) {
			System.out.println("상품명: " + productOrder.productName + " 가격: " + productOrder.price + " 수량: " + productOrder.quantity);
			totalCost += (productOrder.price * productOrder.quantity);
		}

		System.out.println("총 결제 금액 : " + totalCost);
	}
}
