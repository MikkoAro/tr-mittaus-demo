package Util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObservationCategoryReaderTest {

	@Test
	public void getObservationCodes_CallFunctionToReadProperties_ShouldReturnReadArrayList() {
		ObservationCategoryReader ocr = new ObservationCategoryReader();
		assertEquals(true, !ocr.getObservationCodes().isEmpty());
	}
}
