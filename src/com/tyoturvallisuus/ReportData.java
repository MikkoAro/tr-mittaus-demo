package com.tyoturvallisuus;

import java.util.ArrayList;

public class ReportData{
	
	ArrayList<ObservationNote> obsNote = new ArrayList<ObservationNote>();
	private static volatile ReportData INSTANCE = null;
	
	private ReportData(){
		obsNote.add(new ObservationNote(0));
		obsNote.add(new ObservationNote(1));
		obsNote.add(new ObservationNote(2));
		obsNote.add(new ObservationNote(3));
		obsNote.add(new ObservationNote(4));
		obsNote.add(new ObservationNote(5));
		obsNote.add(new ObservationNote(6));
	}
	
	public static ReportData getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ReportData();
		}
		return INSTANCE;
	}
	
	public static ReportData reInitialize() {
		INSTANCE = new ReportData();
		return INSTANCE;
	}
	
	public void addPositiveObservation(int buttonId) {
		this.obsNote.get(buttonId).posObs++;
	}
	
	public void addNegativeObservation(int buttonId) {
		this.obsNote.get(buttonId).negObs++;
	}
	
	public void addComment(int buttonId, String comment) {
		this.obsNote.get(buttonId).addObservationNoteComment(comment);
	}
	
	public double countSummary() {
		int posObsCount = 0;
		int negObsCount = 0;
		
		for (ObservationNote obs: this.obsNote) {
			posObsCount += obs.posObs;
			negObsCount += obs.negObs;
		}
		return calculateTotal((double)posObsCount, (double)negObsCount);
	}
	
	public static double calculateTotal(double positiveCount, double negativeCount) {
		double result = 100 * positiveCount / (positiveCount + negativeCount);
		return result;
	}
	
	public void printReport() {
		System.out.println("================ TR-mittaus ================");
		for (ObservationNote row : obsNote) { 
			System.out.println(row.category + ", " + String.format("%.2f", calculateTotal((double)row.posObs, (double)row.negObs)));
			System.out.println("- Havainnot: Positiivinen " + row.posObs + ", Negatiivinen: " + row.negObs);
			if(row.comments.size() > 0) {
				for(int i = 0; i < row.comments.size(); i++) {
					System.out.println("  - " + row.comments.get(i));
				}
			}
			System.out.println("");
		} 
		System.out.println("Tulos: " + String.format("%.2f", countSummary()));
	}
}
