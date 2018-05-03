package behavioral.template;

public class StoreOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Ring up items at the counter");

	}

	@Override
	public void doPayment() {
		System.out.println("Process in person payment");

	}

	@Override
	public void doReceipt() {
		System.out.println("Print receipt");

	}

	@Override
	public void doDelivery() {
		System.out.println("Bag items at counter");

	}

}
