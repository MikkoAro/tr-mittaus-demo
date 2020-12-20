package com.tyoturvallisuus;

import java.util.ArrayList;

public class ObservationNote extends ObservationCategory{
	 String category;
	 Integer posObs;
	 Integer negObs;
	 ArrayList<String> comments = new ArrayList<String>();
	
	ObservationNote(int buttonId){
		super();
		category = getObservationType(buttonId);
		posObs = 0;
		negObs = 0;
	}
	
	public void addObservationNoteComment(String comment) {
		comments.add(comment);
	}
	
	public static int size() {
		return 4;
	}
}