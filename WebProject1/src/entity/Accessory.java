package entity;

import java.util.ArrayList;

public class Accessory {
	AccessoryType accessoryType;
	double price;
	

	public Accessory(AccessoryType aType) {
		accessoryType=aType;
		price=setPrice();
		totalAccessoryPrice+=price;
	}
	
AccessoryType getAccessoryType() {return accessoryType;}
double getPrice(){return price;}

static double totalAccessoryPrice;
public static double getTotalAccessoryPrice() {return totalAccessoryPrice;}

static ArrayList<Accessory> myAccessories=new ArrayList<>();

public static ArrayList<Accessory> accessoryInBouquet(boolean isBasket,boolean isTape,boolean isWrapper){
	if(isBasket==true) {myAccessories.add(new Accessory(AccessoryType.BASKET));};
	if(isTape==true) {myAccessories.add(new Accessory(AccessoryType.TAPE));};
	if(isWrapper==true){myAccessories.add(new Accessory(AccessoryType.WRAPPER));};
	System.out.println("TotalAccessoryPrice is "+getTotalAccessoryPrice());
	return myAccessories;
		}
double setPrice() {
	if(this.getAccessoryType()==AccessoryType.BASKET) {this.price=PriceList.basketPrice; }
	else if(this.getAccessoryType()==AccessoryType.TAPE) {this.price=PriceList.tapePrice;}
	else {this.price=PriceList.wrapperPrice;}
	return price;}
}

