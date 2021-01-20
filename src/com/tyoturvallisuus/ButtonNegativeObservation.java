package com.tyoturvallisuus;

public class ButtonNegativeObservation implements Button{
	
	int buttonId;

	ButtonNegativeObservation(int buttonId) throws Exception {
		if(0 <= buttonId & buttonId < observationCount) {
			this.buttonId = buttonId;
		} else {
			throw new Exception("ButtonId must be in range of Observations count");}
	}

	public void pressButton(String comment) throws Exception {
		ReportData report = ReportData.getInstance();
		
		if(comment.isEmpty()) {
			throw new Exception("You need to add comment for negative observation");
		}
		report.addNegativeObservation(buttonId);
		report.addComment(buttonId, comment);
	}

	@Override
	public void pressButton() {}

	@Override
	public void pressButtonMultipleTimes(int timesPressed) {}
}
