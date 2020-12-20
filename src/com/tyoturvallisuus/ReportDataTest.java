package com.tyoturvallisuus;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReportDataTest {
	
	@Test
	public void ReportData_Initialize_ShouldInitializeObsNoteList() {
		ReportData report = ReportData.getInstance();
		assertEquals(true, !report.obsNote.isEmpty());
	}

	@Test
	public void addPositiveObservation_IncrementPositiveObsesrvationByOne_ShouldIncrementPosObsCountToReportData() {
		ReportData report = ReportData.reInitialize();
		report.addPositiveObservation(0);
		assertEquals(1, report.obsNote.get(0).posObs.intValue());
	}

	@Test
	public void addNegativeObservation_IncrementNegativeObsesrvationByOne_ShouldIncrementNegObsCountToReportData() {
		ReportData report = ReportData.reInitialize();
		report.addNegativeObservation(1);
		assertEquals(1, report.obsNote.get(1).negObs.intValue());
	}

	@Test
	public void addComment_AddCommentById_AddCommentByIdToReportData() {
		ReportData report = ReportData.reInitialize();
		report.addComment(2, "Testi comment");
		assertEquals("Testi comment", report.obsNote.get(2).comments.get(0));
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
