package model;

public class Flower extends Plant{
String Flowering;
public enum Flowering{ANNUAL_FLOWER,ONE_YEAR_FLOWER };
public Flower(String PlantType,String Flowering){
	super(PlantType);
	this.Flowering=Flowering;};
	
	String getPlantType(){
		return PlantType;		
	}
}