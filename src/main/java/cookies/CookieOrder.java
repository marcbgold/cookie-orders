package cookies;

public class CookieOrder {

	private String variety;
	private int numBoxes;

	public CookieOrder() {
	};

	public CookieOrder(String variety, int quantity) {
		this.variety = variety;
		this.numBoxes = quantity;
	}

	public String getVariety() {
		return variety;
	}

	public int getNumBoxes() {
		return numBoxes;
	}

	public void setNumBoxes(int newQuantity) {
		this.numBoxes = newQuantity;
	}

}
