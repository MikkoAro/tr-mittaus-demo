package com.tyoturvallisuus;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObservationCategoryTest {

	@Test
	public void getObservationType_GetObservationTypeByIndex_ShouldReturnObservationCategory() {
		new ObservationCategory();
		assertEquals("Ty�skentely", ObservationCategory.getObservationType(0));
	}
}
