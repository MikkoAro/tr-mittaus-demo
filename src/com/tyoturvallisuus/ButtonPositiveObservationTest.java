package com.tyoturvallisuus;

import static org.junit.Assert.*;

import org.junit.Test;

public class ButtonPositiveObservationTest {

	@Test
	public void ButtonPositiveObservation_ButtonIdGivenFrom0ToObservationCount_ShouldCreateButton() throws Exception {
		ButtonPositiveObservation button = new ButtonPositiveObservation(0);
		assertEquals(button, button);
	}

	@Test
	public void pressButtonMultipleTimes_IncrementPosObsCountByOne_ShouldIncrementPosObsCountToReportData() throws Exception {
		ButtonPositiveObservation button = new ButtonPositiveObservation(2);
		button.pressButton();
		assertEquals(1, ReportData.getInstance().obsNote.get(2).posObs.intValue());
	}

	@Test
	public void pressButtonMultipleTimes_IncrementPosObsCountByGivenValue_ShouldIncrementPosObsToReportDataByGivenValueAndId() throws Exception {
		ButtonPositiveObservation button = new ButtonPositiveObservation(4);
		button.pressButtonMultipleTimes(14);
		assertEquals(14, ReportData.getInstance().obsNote.get(4).posObs.intValue());
	}
}
