package com.tyoturvallisuus;

public class ButtonInitializer {
	
	Button posButton0, posButton1, posButton2, posButton3, posButton4, posButton5, posButton6;
	Button negButton0, negButton1, negButton2, negButton3, negButton4, negButton5, negButton6;
	
	ButtonInitializer() throws Exception{
		this.posButton0 = new ButtonPositiveObservation(0);
		this.posButton1 = new ButtonPositiveObservation(1);
		this.posButton2 = new ButtonPositiveObservation(2);
		this.posButton3 = new ButtonPositiveObservation(3);
		this.posButton4 = new ButtonPositiveObservation(4);
		this.posButton5 = new ButtonPositiveObservation(5);
		this.posButton6 = new ButtonPositiveObservation(6);
		this.negButton0 = new ButtonNegativeObservation(0);
		this.negButton1 = new ButtonNegativeObservation(1);
		this.negButton2 = new ButtonNegativeObservation(2);
		this.negButton3 = new ButtonNegativeObservation(3);
		this.negButton4 = new ButtonNegativeObservation(4);
		this.negButton5 = new ButtonNegativeObservation(5);
		this.negButton6 = new ButtonNegativeObservation(6);
	}
}
