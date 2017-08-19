package entity;

import java.awt.List;

public abstract class Herb {
	enum freshness{VERY_FRESH,FRESH,NO_FRESH}
	enum stemLength{LONG,MIDDLE,SHORT}
	String getName();
	String getColor();
	List<T> getFreshnessHirechy() {};
	double getPrice(Bouquet bouquet) {};
}
