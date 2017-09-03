package entity;

import java.util.ArrayList;

public class Flower extends Plant{
	FlowerName name;
	FlowerStem stem;
	FlowerFreshness freshness;
	double price;
	
	
	public Flower(FlowerName n,int freshnessLevel,FlowerStem s) {
		name=n;
		freshness=setFreshness(freshnessLevel);
		stem=s;
		price=definePrice(freshnessLevel);
	}
	public Flower(FlowerName n,int freshnessLevel, int stemLevel) {
		name=n;
		freshness=setFreshness(freshnessLevel);
		stem=setStemLevel(stemLevel);
		price=definePrice(freshnessLevel);
		
	}
	
	static double totalFlowerPrice;
	public static double getTotalFlowerPrice() {return totalFlowerPrice;}
	
	public FlowerName getFlowerName() {return name;}
	public FlowerStem getFlowerStem() {return stem;}
	public FlowerFreshness getFlowerFreshness() {return freshness;}
	public double getprice() {return price;}
	
	public String printInfo() {
		return "Flower "+name+ " freshness "+freshness+" stem "+stem+" price "+price;
	}
	
	static ArrayList<Flower> myFlowersList=new ArrayList<>();
	
	public static ArrayList<Flower> roseInBouquet(Integer roseNumber,Integer roseFreshnessLevel,Integer roseLengthOfStem){
		//ArrayList <Flower> roseList=new ArrayList<>();
		System.out.println("START Total price /rose block/ is "+totalFlowerPrice);
		if(roseNumber>0) {			 
			for(int i=0;i<roseNumber;i++) {
			myFlowersList.add(new Flower(FlowerName.ROSE, roseFreshnessLevel, roseLengthOfStem));
			//myFlowersList.getFlowerPrice();{}
			System.out.println("Added new odject!" +myFlowersList.get(i).printInfo()+ " Current size is "+myFlowersList.size());
			}
		System.out.println("FINAL price /rose block/ is "+totalFlowerPrice);
		}
		return myFlowersList;
	}
									
	public static ArrayList<Flower> sunflowerInBouquet(Integer sunflowerNumber,Integer sunflowerFreshnessLevel,Integer sunflowerLengthOfStem){
		//ArrayList <Flower> roseList=new ArrayList<>();
		System.out.println("START Total price /sunflower block/ is "+totalFlowerPrice);
		if(sunflowerNumber>0) {			 
		for(int i=0;i<sunflowerNumber;i++) {
			myFlowersList.add(new Flower(FlowerName.SUNFLOWER, sunflowerFreshnessLevel, sunflowerLengthOfStem));
			System.out.println("Added new odject!" +myFlowersList.get(i).printInfo()+ " Current size is "+myFlowersList.size());	
			}
		System.out.println("FINAL price /sunflower block/ is "+totalFlowerPrice);
		}
		return myFlowersList;
	}
	
	public static ArrayList<Flower> charmolineInBouquet(Integer charmolineNumber,Integer charmolineFreshnessLevel,Integer charmolineLengthOfStem){
		//ArrayList <Flower> roseList=new ArrayList<>();
		System.out.println("START Total price /charmoline block/ is "+totalFlowerPrice);
		if(charmolineNumber>0) {			 
			for(int i=0;i<charmolineNumber;i++) {
			myFlowersList.add(new Flower(FlowerName.CHARMOLINE, charmolineFreshnessLevel,charmolineLengthOfStem));
			System.out.println("Added new odject!" +myFlowersList.get(i).printInfo()+ " Current size is "+myFlowersList.size());	
			}
		System.out.println("FINAL price /charmoline block/ is "+totalFlowerPrice);
		}
		
		return myFlowersList;
	}
	
		public double definePrice(int freshnessLevel) {
		if(this.getFlowerName()==FlowerName.ROSE) {
			System.out.println("It's rose");
			definePriceForRose(freshnessLevel);}
		else if(this.getFlowerName()==FlowerName.CHARMOLINE) {
			System.out.println("It's charmoline");
			definePriceForCharmoline(freshnessLevel);}	
		else if(this.getFlowerName()==FlowerName.SUNFLOWER) {
			System.out.println("It's sunflower");
			definePriceForSunflower(freshnessLevel);};
			return 0.0;}
	
	//methods for different type of Flower(enum FlowerName)
		double definePriceForRose(Integer freshnessLevel){
			if(freshnessLevel.equals(0)){totalFlowerPrice+=PriceList.roseSuperFreshPrice;
			return PriceList.roseSuperFreshPrice;}
			else if (freshnessLevel.equals(1)){totalFlowerPrice+=PriceList.roseFreshPrice;
				return PriceList.roseFreshPrice;}
			else{totalFlowerPrice+=PriceList.roseBasicPrice;
				return PriceList.roseBasicPrice;}
			}
		double definePriceForCharmoline(Integer freshnessLevel){
			if(freshnessLevel.equals(0)){totalFlowerPrice+=PriceList.charmolineSuperFreshPrice;
				return PriceList.charmolineSuperFreshPrice;}
			else if (freshnessLevel.equals(1)){totalFlowerPrice+=PriceList.charmolineFreshPrice;
				return PriceList.charmolineFreshPrice;}
			else{totalFlowerPrice+=PriceList.charmolineBasicPrice;
				return PriceList.charmolineBasicPrice;}
			}
		
		double definePriceForSunflower(Integer freshnessLevel){
			if(freshnessLevel.equals(0)){totalFlowerPrice+=PriceList.sunflowerSuperFreshPrice;
				return PriceList.sunflowerSuperFreshPrice;}
			else if (freshnessLevel.equals(1)){totalFlowerPrice+=PriceList.sunflowerFreshPrice;
				return PriceList.sunflowerFreshPrice;}
			else{totalFlowerPrice+=PriceList.sunflowerBasicPrice;
				return PriceList.sunflowerBasicPrice;}
			}	
		//method defines freshness level based on Integer meaning 
		FlowerFreshness setFreshness(int freshnessLevel) {
			if(freshnessLevel==0) {return FlowerFreshness.VERY_FRESH;}
			else if(freshnessLevel==1) {return FlowerFreshness.FRESH;}
			else {return FlowerFreshness.NO_FRESH;}
			}
		//method defines stem level based on Integer meaning
		FlowerStem setStemLevel(int stemLevel) {
			if(stemLevel==0) {return FlowerStem.LONG;}
			else if(stemLevel==1) {return FlowerStem.MIDDLE;}
			else {return FlowerStem.SHORT;}
			}

// methods to sort by freshness
public static ArrayList<Flower> softByFreshness(){
	ArrayList<Flower> sorteredList=new ArrayList<>(myFlowersList.size());
	for(int i=0,j=myFlowersList.size()-1; i<myFlowersList.size();i++) {
		if(myFlowersList.get(i).getFlowerFreshness()==FlowerFreshness.NO_FRESH) {
			sorteredList.add(j,myFlowersList.get(i));
			j--;}
		if(myFlowersList.get(i).getFlowerFreshness()==FlowerFreshness.VERY_FRESH) {
			sorteredList.add(myFlowersList.size()-j,myFlowersList.get(i));
			j--;}
		if(myFlowersList.get(i).getFlowerFreshness()==FlowerFreshness.FRESH) {
			sorteredList.add(myFlowersList.size()-j,myFlowersList.get(i));
			j--;}
		}
	return sorteredList;
	}

public static void printByFreshness(ArrayList<Flower> sorteredList){
	for(int i=0; i<sorteredList.size();i++) {
		sorteredList.get(i).printInfo();
		} 
	}
}