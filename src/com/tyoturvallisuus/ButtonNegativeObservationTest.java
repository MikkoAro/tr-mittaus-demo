package com.tyoturvallisuus;

import static org.junit.Assert.*;

import org.junit.Test;

public class ButtonNegativeObservationTest {
	
	@Test
	public void ButtonNegativeObservation_ButtonIdGivenFrom0ToObservationCount_ShouldCreateButton() throws Exception {
		ButtonNegativeObservation button = new ButtonNegativeObservation(0);
		assertEquals(button, button);
	}
	
	@Test(expected = Exception.class)
	public void pressButtonString_GivenEmptyCommentMessage_ThrowsException() throws Exception  {
		ButtonNegativeObservation button = new ButtonNegativeObservation(6);
		button.pressButton("");
	}
	
	@Test
	public void pressButtonString_GiveCommentMessageString_ShouldAddToReportDataArrayList() throws Exception {
		ButtonNegativeObservation button = new ButtonNegativeObservation(6);
		button.pressButton("A43 lightning defective");
		button.pressButton("Excessive stuff on passageway");
		assertEquals("Excessive stuff on passageway", ReportData.getInstance().getObsNote(6).getComment(1));
	}
	
	@Test
	public void pressButtonString_IncrementNegObsCountByOne_ShouldIncrementNegObsCountToReportData() throws Exception {
		ButtonNegativeObservation button = new ButtonNegativeObservation(1);
		button.pressButton("A43 lightning defective");
		assertEquals(1, ReportData.getInstance().getObsNote(1).getNegObs());
	}
}
