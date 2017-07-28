package model;

public class Bouquet {
Flower flower;
int numberOfFlower;
boolean isBasket;
boolean isTape;
boolean isWrapper;
boolean needNutrition;
boolean needSupport;
String Price;
String Purpose;
String Type;
String Size;
String Freshness;
int daysSinceCreation;
double realPrice;
static double cashdesk=0;

public enum Price{CHEAP,BUDGETARY, EXPENSIVE, VIP};
public enum Purpose{ALL,HOLIDAY,FUNERAL,WEDDING};
public enum Type{NO_STEM,SHORT_STEM,MIDDLE_STEM,LONG_STEM};
public enum Size{SMALL,MIDDLE,LARGE,EXTRALARGE};
public enum Freshness{VERY_FRESH,FRESH,LOW_FRESH,FLABBY};

public Bouquet(Flower flower,int numberOfFlower){
	this.flower=flower;
	this.numberOfFlower=numberOfFlower;
	this.isBasket=false;
	this.isTape=false;
	this.isWrapper=false;
	this.needNutrition=false;
	this.needSupport=false;
	this.Price="CHEAP";
	this.Purpose="ALL";
	this.Type="NO_STEM";
	this.Size="SMALL";
	this.Freshness="VERY_FRESH";
	int daysSinceCreation=0;
	double realPrice=0;
	setValue();
}

public Bouquet(Flower flower,int numberOfFlower,boolean isBasket,boolean isTape,boolean isWrapper,boolean needNutrition,boolean needSupport){
	this.flower=flower;
	this.numberOfFlower=numberOfFlower;
	this.isBasket=isBasket;
	this.isTape=isTape;
	this.isWrapper=isWrapper;
	this.needNutrition=needNutrition;
	this.needSupport=needSupport;
	this.Price="CHEAP";
	this.Purpose="ALL";
	this.Type="NO_STEM";
	this.Size="SMALL";
	this.Freshness="VERY_FRESH";
	int daysSinceCreation=0;
	double realPrice=0;
	setValue();
}

public Bouquet(Flower flower,int numberOfFlower,boolean isBasket,boolean isTape,boolean isWrapper,boolean needNutrition,boolean needSupport,String Price, String Purpose,String Type,String Size,String Freshness){
	this.flower=flower;
	this.numberOfFlower=numberOfFlower;
	this.isBasket=isBasket;
	this.isTape=isTape;
	this.isWrapper=isWrapper;
	this.needNutrition=needNutrition;
	this.needSupport=needSupport;
	this.Price=Price;
	this.Purpose="ALL";
	this.Type="NO_STEM";
	this.Size="SMALL";
	this.Freshness="VERY_FRESH";
	int daysSinceCreation=0;
	double realPrice=0;
	setValue();
}

public void setValue(){
	if((this.numberOfFlower<=7 && isBasket==false) && (this.numberOfFlower<=7 && isWrapper==false) && (isTape==true || isTape==false))
	{this.Price="BUDGETARY";
	this.realPrice=4.5;
	}
	else if((this.numberOfFlower<15 && isBasket==true) && (this.numberOfFlower>7 && isWrapper==true))
	{this.Price="EXPENSIVE";
	this.realPrice=7.4;
	}
	else if((this.numberOfFlower>15 && isBasket==true) && (isTape==true && isWrapper==true))
	{this.Price="VIP";
	this.realPrice=12.2;
	}
	else if((this.numberOfFlower>15 && isBasket==false) && (isTape==true && isWrapper==true))
	{this.Price="EXPENSIVE";
	this.realPrice=7.4;}
	else
	{this.Price="BUDGETARY";
	this.realPrice=4.5;}
	
}
public double getValue(){
	return realPrice;
}

public void startsNewDay(){
	daysSinceCreation++;
	if (daysSinceCreation<=3){
		this.Freshness="VERY_FRESH";
		this.realPrice*=1;}
	else if(daysSinceCreation>3){
		this.Freshness="FRESH";
		this.realPrice*=0.9;}
	else if(daysSinceCreation>6){
		this.Freshness="LOW_FRESH";
		this.realPrice*=0.7;}
	else {this.Freshness="FLABBY";
	    this.realPrice*=0;}
		setValue();}

public double sale(){
	cashdesk=cashdesk+this.realPrice;
	System.out.println("Bouquet was sold");
	System.out.println("real price "+realPrice);
	return cashdesk;}
//method showCashDesk return current cashdesk balance
public static double showCashdesk(){
	System.out.println("Current cashdesk is: "+cashdesk);
	return cashdesk;};
}