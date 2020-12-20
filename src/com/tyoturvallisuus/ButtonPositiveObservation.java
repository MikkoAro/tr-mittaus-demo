package com.tyoturvallisuus;
public class ButtonPositiveObservation extends AbstractButton{
	
	ButtonPositiveObservation(int buttonId) throws Exception {
		super(buttonId);
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
