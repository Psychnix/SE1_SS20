import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Sort {

	@Test
	public void test() {
		String s[] = { "A" , "B", "C", "D" };
		boolean result = Sort.isWellSorted(s);
		assertEquals(true, result);
		String s1[] = { "B" , "A", "C", "D" };
		result = Sort.isWellSorted(s1);
		assertEquals(true, result);
		String s2[]= { "A" , "A", "C", "D" };
		result = Sort.isWellSorted(s2);
		assertEquals(true, result);
		String s3[] = { "C" , "B", "A", "D" };
		result = Sort.isWellSorted(s3);
		assertEquals(false, result);
		String s4[]= { "A" , "B", "D", "C" };
		result = Sort.isWellSorted(s4);
		assertEquals(false, result);

	}

}
