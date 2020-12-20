package com.tyoturvallisuus;

public abstract class AbstractButton {
	int observationCount = ObservationCategory.Observation.values().length;
	int buttonId;

	AbstractButton(int buttonId) throws Exception {
		if(0 <= buttonId & buttonId < observationCount) {
			this.buttonId = buttonId;
		} else {
			throw new Exception("ButtonId must be in range of Observations count");}
	}
	
	abstract public void pressButton();
	abstract public void pressButton(String comment) throws Exception;
	abstract public void pressButtonMultipleTimes(int timesPressed); //for testing purposes only
}
