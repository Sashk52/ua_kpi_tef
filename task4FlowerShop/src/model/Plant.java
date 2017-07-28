package model;
//new class Plant
public abstract class Plant {
	String PlantType;
public enum PlantType{
	FLOWER, NO_FLOWER
}
Plant(String PlantType){
	this.PlantType=PlantType;
}
abstract String getPlantType();
}
