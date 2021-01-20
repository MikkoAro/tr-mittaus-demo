package com.tyoturvallisuus;

import java.util.ArrayList;

public class ReportData{
	
	private ArrayList<ObservationNote> obsNote = new ArrayList<ObservationNote>();
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
		this.obsNote.get(buttonId).increasePosObs();;
	}
	
	public void addNegativeObservation(int buttonId) {
		this.obsNote.get(buttonId).increaseNegObs();
	}
	
	public void addComment(int buttonId, String comment) {
		this.obsNote.get(buttonId).addObservationNoteComment(comment);
	}
	
	public ArrayList<ObservationNote> getObsNote() {
		if (this.obsNote.isEmpty()) {
			return null;
		}
		return this.obsNote;
	}
	
	public ObservationNote getObsNote(int position) {
		return this.obsNote.get(position);
	}
	
	public double countSummary() {
		int posObsCount = 0;
		int negObsCount = 0;
		
		for (ObservationNote obs: this.obsNote) {
			posObsCount += obs.getPosObs();
			negObsCount += obs.getNegObs();
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
			System.out.println(row.getCategory() + ", " + String.format("%.2f", calculateTotal((double)row.getPosObs(), (double)row.getNegObs())));
			System.out.println("- Havainnot: Positiivinen " + row.getPosObs() + ", Negatiivinen: " + row.getNegObs());
			if(row.getComments().size() > 0) {
				for(int i = 0; i < row.getComments().size(); i++) {
					System.out.println("  - " + row.getComments().get(i));
				}
			}
			System.out.println("");
		} 
		System.out.println("Tulos: " + String.format("%.2f", countSummary()));
	}
}
