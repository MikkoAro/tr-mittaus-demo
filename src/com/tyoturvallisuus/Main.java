package com.tyoturvallisuus;
public class Main {

	public static void main(String[] args) {
		
		ButtonInitializer buttons = null;
		ReportData report = ReportData.getInstance();

		try {
			buttons = new ButtonInitializer();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Make positive observations
		buttons.posButton0.pressButtonMultipleTimes(41);
		buttons.posButton1.pressButtonMultipleTimes(32);
		buttons.posButton2.pressButtonMultipleTimes(6);
		buttons.posButton3.pressButtonMultipleTimes(24);
		buttons.posButton4.pressButtonMultipleTimes(38);
		buttons.posButton5.pressButtonMultipleTimes(76);
		buttons.posButton6.pressButtonMultipleTimes(31);

		//Make negative observations
		try {
			buttons.negButton0.pressButton("Suojalasit puuttuu");
			buttons.negButton0.pressButton("LVI-ty�ntekij�lt� puuttuu kyp�r�");
			buttons.negButton1.pressButton("Jalkalista puuttuu pohjoispuolen teline 2krs.");
			buttons.negButton3.pressButton("2krs. aukkosuoja irti");
			buttons.negButton4.pressButton("Valaistus A43");
			buttons.negButton4.pressButton("Valonheitin varastettu");
			buttons.negButton5.pressButton("1krs k�yt�v� ylim��r�ist� j�tett�");
			buttons.negButton5.pressButton("Etel�puolella pihalla roskaa");
			buttons.negButton5.pressButton("Ty�piste ep�siisti putkimies");
			buttons.negButton5.pressButton("Kulkutiell� rojua B11");
			buttons.negButton6.pressButton("A02 imurointi");
		} catch (Exception e) {
			e.printStackTrace();
		}
		report.printReport();
	}
}