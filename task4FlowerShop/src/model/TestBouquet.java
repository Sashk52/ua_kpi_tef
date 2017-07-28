package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBouquet {
	Flower sunflower=new Flower("FLOWER","ANNUAL_FLOWER");
	Bouquet testBouquet=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	Bouquet testBouquet=new Bouquet(sunflower,3);}

	@Test
	public void testSetValue() {
	Bouquet testBouquet=new Bouquet(sunflower,10);
		assertTrue(testBouquet.getValue()==4.5);
	}
	@Test
	public void testSetValue1() {
	Bouquet testBouquet=new Bouquet(sunflower,10,true,true,true,true,true);
		assertTrue(testBouquet.getValue()==7.4);
	}
	@Test
	public void testSale() {
	Bouquet testBouquet=new Bouquet(sunflower,10,true,true,true,true,true);
		assertTrue(testBouquet.sale()==7.4);
	}
	
	@Test
	public void testShowCashdesk() {
	Bouquet testBouquet=new Bouquet(sunflower,10,true,true,true,true,true);
	Bouquet testBouquet1=new Bouquet(sunflower,5);
	testBouquet.sale();
	testBouquet1.sale();
		assertTrue(Bouquet.showCashdesk()==19.3);
	}
}
