package cookies;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {

	List<CookieOrder> orders = new ArrayList<>();

	public void addOrder(CookieOrder theOrder) {
		orders.add(theOrder);
	}

	public int listSize() {
		return orders.size();
	}

	public int getTotalBoxes() {
		int totalBoxes = 0;
		for (CookieOrder i : orders) {
			totalBoxes += i.getNumBoxes();
		}
		return totalBoxes;
	}

	public void removeVariety(String variety) {
		for (int i = orders.size() - 1; i >= 0; i--) {
			if (orders.get(i).getVariety().equals(variety)) {
				orders.remove(i);
			}
		}
	}

	public void showOrder() {
		for (CookieOrder i : orders) {
			System.out.println(i.getVariety() + ": " + i.getNumBoxes());
		}
	}
}
