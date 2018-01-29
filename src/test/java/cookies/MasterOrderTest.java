package cookies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MasterOrderTest {

	@Test
	public void shouldInstantiateAMasterOrderObject() {
		MasterOrder underTest = new MasterOrder();

		assertNotNull(underTest);
	}

	@Test
	public void assertThatAnOrderHasBeenAdded() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("", 0));

		int check = underTest.listSize();

		assertEquals(1, check);
	}

	@Test
	public void assertThatTwoOrdersHaveBeenAdded() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("", 0));
		underTest.addOrder(new CookieOrder("", 0));

		int check = underTest.listSize();

		assertEquals(2, check);
	}

	@Test
	public void assertThatGetTotalBoxesIsOne() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("Tagalongs", 1));

		int check = underTest.getTotalBoxes();

		assertEquals(1, check);
	}

	@Test
	public void assertThatGetTotalBoxesIsTwo() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("Tagalongs", 1));
		underTest.addOrder(new CookieOrder("Thin Mints", 1));

		int check = underTest.getTotalBoxes();

		assertEquals(2, check);
	}

	@Test
	public void assertThatAnOrderHasBeenRemoved() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("Tagalongs", 1));
		underTest.addOrder(new CookieOrder("Thin Mints", 1));
		underTest.removeVariety("Tagalongs");

		int check = underTest.getTotalBoxes();

		assertEquals(1, check);
	}

}
