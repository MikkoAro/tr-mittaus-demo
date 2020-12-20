package com.tyoturvallisuus;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObservationCategoryTest {

	@Test
	public void ObservationCategory_GenerateEnumMapOfObservations_ShouldInitializeObservationTypesMap() {
		new ObservationCategory();
		assertEquals(true, !ObservationCategory.map.isEmpty());
	}

	@Test
	public void getObservationType_GetObservationTypeByIndex_ShouldReturnObservationCategory() {
		new ObservationCategory();
		assertEquals("Työskentely", ObservationCategory.getObservationType(0));
	}
}
