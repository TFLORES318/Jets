package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	private AirField airField = new AirField();
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication jetApp = new JetsApplication();
		jetApp.launch();
	}

	public void launch() {
	System.out.println("Welcome to the Jet App!");
	displayUserMenu();
	userMenuSelection();
	
	}
	
	public void displayUserMenu() {	
		System.out.println("Please choose from the menu below:");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all cargo jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add jet to fleet");
		System.out.println("8. Remove a jet from fleet");
		System.out.println("9. Quit");
	}
	
	public void userMenuSelection() {	
	boolean startAgain = true;
	int selection = kb.nextInt();
	do {
	switch(selection) {
	case 1: 
		airField.listFleet();
		kb.nextLine();
		break;
	case 2:
		airField.flyAllJets();
		kb.nextLine();
		break;
	case 3:
		airField.viewFastestJet();
		kb.nextLine();
		break;
	case 4:
		airField.viewLongestRangeJet();
		kb.nextLine();
		break;
	case 5: 
		airField.loadAllCargoJets();
		kb.nextLine();
		break;
	case 6:
		airField.dogFight();
		kb.nextLine();
		break;
	case 7:
		addJetToFleet();
		kb.nextLine();
		break;
	case 8: 
		airField.removeJetFromFleet();
		break;
	case 9:
		System.out.println("Goodbye!");
		System.exit(0);
		startAgain = false;
		break;
	default:
		System.out.println("Selection not valid.");
		kb.next();
		startAgain = true;
		break;
	}
	kb.nextLine();
	}	while (startAgain);
		displayUserMenu();
}
	
	public void addJetToFleet() {
		String model = null;
		String name = null;
		double speed = 0;
		int range = 0;
		long price = 0;
		System.out.println("Enter in the model of your jet:");
		model = kb.next();
		System.out.println("Enter in the name of your jet:");
		name = kb.next();
		System.out.println("Enter in the mph of this jet:");
		speed = kb.nextDouble();
		System.out.println("Enter in the range of this jet:");
		range = kb.nextInt();
		System.out.println("Enter in the price of this jet:");
		price = kb.nextLong();
		JetImp newJet = new JetImp(model, name, speed, range, price);
		System.out.println(newJet+ " has been added to the fleet");
		airField.addJetToAirField(newJet);
	}
	public void removeJetFromFleetSelection() {
		//n0o0o0o0o0o make me anxiouussszzz
	}
}
