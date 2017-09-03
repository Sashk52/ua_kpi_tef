package entity;

public abstract class Plant {
	String name;
	String freshness;
	double price;
	
	String getName(){
		return name;}
	String setName(String name){
		this.name=name;
		return this.name;}
	
	String getFreshness(){
		return freshness;}
	double getPrice(){
		return price;}
	
}