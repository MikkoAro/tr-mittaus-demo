package com.tyoturvallisuus;

interface Button {
	
	int observationCount = ObservationCategory.getObservationCount();
	
	abstract public void pressButton();
	abstract public void pressButton(String comment) throws Exception;
	abstract public void pressButtonMultipleTimes(int timesPressed); //for testing purposes only
}
