package com.tyoturvallisuus;

public class ButtonNegativeObservation extends AbstractButton{
	
	ButtonNegativeObservation(int buttonId) throws Exception {
		super(buttonId);
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
