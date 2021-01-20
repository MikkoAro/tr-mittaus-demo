package com.tyoturvallisuus;
public class ButtonPositiveObservation implements Button{
	
	int buttonId;

	ButtonPositiveObservation(int buttonId) throws Exception {
		if(0 <= buttonId & buttonId < observationCount) {
			this.buttonId = buttonId;
		} else {
			throw new Exception("ButtonId must be in range of Observations count");}
	}
	
	public void pressButton(){
		ReportData.getInstance().addPositiveObservation(buttonId);
    }
	
    public void pressButtonMultipleTimes(int timesPressed) {
    	for(int i = 0; i < timesPressed; i++) {
    		ReportData.getInstance().addPositiveObservation(buttonId);
    	}
    }

	@Override
	public void pressButton(String comment) {}
}
