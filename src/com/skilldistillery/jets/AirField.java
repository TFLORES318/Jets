package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	private List<Jet> jets = new ArrayList<>();

	public AirField() {
		fleet();
	}

	public List<Jet> fleet() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("jets.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] jetType = line.split(", ");
				String model = jetType[0];
				String name = jetType[1];
				double speed = Double.parseDouble(jetType[2]);
				int range = Integer.parseInt(jetType[3]);
				long price = Long.parseLong(jetType[4]);

				if (model.equals("CargoPlane")) {
					Jet cargoPlane = new CargoPlane(model, name, speed, range, price);
					jets.add(cargoPlane);
				} else if (model.equals("FighterJet")) {
					Jet fighterJet = new FighterJet(model, name, speed, range, price);
					jets.add(fighterJet);
				} else {
					Jet jetz = new JetImp(model, name, speed, range, price);
					jets.add(jetz);
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
		return jets;
	}

	public void listFleet() {
		for (Jet jet : jets) {
			System.out.println(jet);
		}
	}
	public void flyAllJets() {
		for (Jet jet: jets) {
			jet.fly();
		}
	}		

	public void viewFastestJet() {
		Jet jetFast = jets.get(0);
		int indexSpot = 0;
		for (indexSpot = 0; indexSpot < jets.size(); indexSpot++) {
			Jet currentJet = jets.get(indexSpot);
			if (jets.get(indexSpot) == null) {
				break;
				} else if (currentJet.getSpeed() > jetFast.getSpeed()) {
				jetFast = currentJet;
			}
		}
		System.out.println("The fastest is " + jetFast);
	}

	public void viewLongestRangeJet() {
		Jet jetLong = jets.get(0);
		int indexSpot = 0;
		for (indexSpot = 0; indexSpot < jets.size(); indexSpot++) {
			Jet currentJet = jets.get(indexSpot);
			if (jets.get(indexSpot) == null) {
				break;
			} else if (currentJet.getRange() > jetLong.getRange()) {
				jetLong = currentJet;
			}
		}
		System.out.println(jetLong + " has the longest range.");
	}

	public void loadAllCargoJets() {
		int indexSpot = 0;
		for (indexSpot = 0; indexSpot < jets.size(); indexSpot++) {
			Jet currentJet = jets.get(indexSpot);
			if (currentJet instanceof CargoPlane) {
			((CargoPlane) currentJet).loadCargo();
		}
		}

	}

	public void dogFight() {
		int indexSpot = 0;
		for (indexSpot = 0; indexSpot < jets.size(); indexSpot++) {
			Jet currentJet = jets.get(indexSpot);
			if (currentJet instanceof FighterJet) {
				((FighterJet) currentJet).fight();
			}
		}
	}
	
	public void addJetToAirField(Jet newJet) {
		jets.add(newJet);
	}
	
	public void removeJetFromFleet() {
//	int indexSpot = 0;
//	int counter = 0;
//	for (indexSpot = 0; indexSpot < jets.size(); indexSpot++) {
//		Jet currentJet = jets.get(indexSpot).add();
//		counter++;
//		System.out.println(indexSpot + ": " +currentJet);
	}
	}

