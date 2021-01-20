package com.tyoturvallisuus;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReportDataTest {
	@Test
	public void addPositiveObservation_IncrementPositiveObsesrvationByOne_ShouldIncrementPosObsCountToReportData() {
		ReportData report = ReportData.reInitialize();
		report.addPositiveObservation(0);
		assertEquals(1, report.getObsNote(0).getPosObs());
	}

	@Test
	public void addNegativeObservation_IncrementNegativeObsesrvationByOne_ShouldIncrementNegObsCountToReportData() {
		ReportData report = ReportData.reInitialize();
		report.addNegativeObservation(1);
		assertEquals(1, report.getObsNote(1).getNegObs());
	}

	@Test
	public void addComment_AddCommentById_AddCommentByIdToReportData() {
		ReportData report = ReportData.reInitialize();
		report.addComment(2, "Testi comment");
		assertEquals("Testi comment", report.getObsNote(2).getComment(0));
	}

	@Test
	public void countSummary_CountPercentageByPosAndNegObservations_ReturnSummaryScore() {
		ReportData report = ReportData.reInitialize();
		report.addPositiveObservation(0);
		report.addPositiveObservation(3);
		report.addPositiveObservation(6);
		report.addNegativeObservation(1);
		assertEquals("75.0", String.valueOf(report.countSummary()));
	}
}
