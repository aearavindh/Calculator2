import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		int result = Cal.add(10, 5);
		assertEquals(15, result);
	}

}
