package controller;

import model.Bouquet;
import model.Flower;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Flower charmoline = new Flower("FLOWER","ANNUAL_FLOWER");
		Flower rose = new Flower("FLOWER","ONE_YEAR_FLOWER");
		
		Bouquet firstBouquet= new Bouquet(charmoline,7);
		Bouquet secondBouquet= new Bouquet(rose,16,true,true,true,true,true);
		firstBouquet.startsNewDay();
		firstBouquet.startsNewDay();
		firstBouquet.startsNewDay();
		firstBouquet.startsNewDay();
		secondBouquet.startsNewDay();
		firstBouquet.sale();
		secondBouquet.sale();
		Bouquet.showCashdesk();
	}
}

