package com.tyoturvallisuus;

import java.util.ArrayList;

public class ObservationNote extends ObservationCategory{
	
	 private String category;
	 private Integer posObs;
	 private Integer negObs;
	 private ArrayList<String> comments = new ArrayList<String>();
	
	ObservationNote(int buttonId){
		super();
		category = getObservationType(buttonId);
		posObs = 0;
		negObs = 0;
	}
	
	public int getPosObs() {
		return this.posObs;
	}
	
	public int getNegObs() {
		return this.negObs;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public ArrayList<String> getComments(){
		return this.comments;
	}
	
	public String getComment(int position){
		return this.comments.get(position);
	}
	
	public void increasePosObs() {
		this.posObs++;
	}
	
	public void increaseNegObs() {
		this.negObs++;
	}
	
	public void addObservationNoteComment(String comment) {
		comments.add(comment);
	}
	
	public static int size() {
		return 4;
	}
}