package model;


public class NoFlower extends Plant{
String NoFlowerType;

public enum NoFlowerType{BUSH, BRANCH}

NoFlower(String PlantType, String NoFlowerType){
	super(PlantType);
	this.NoFlowerType=NoFlowerType;
}
String getPlantType(){
	return PlantType;
}
}