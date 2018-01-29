package cookies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CookieOrderTest {

	@Test
	public void shouldInstantiateACookieOrderObject() {
		CookieOrder underTest = new CookieOrder();

		assertNotNull(underTest);
	}

	@Test
	public void shouldInstantiateACookieObjectWithVarietyAndBoxes() {
		CookieOrder underTest = new CookieOrder("Thin Mints", 2);

		String variety = underTest.getVariety();
		int boxes = underTest.getNumBoxes();

		assertEquals("Thin Mints", variety);
		assertEquals(2, boxes);
	}

	@Test
	public void shouldModifyQuantity() {
		CookieOrder underTest = new CookieOrder("Thin Mints", 2);

		underTest.setNumBoxes(3);
		int boxes = underTest.getNumBoxes();

		assertEquals(3, boxes);
	}

}
