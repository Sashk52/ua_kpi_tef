package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Accessory;
import entity.Flower;
import entity.FlowerFreshness;
import entity.FlowerName;
import entity.FlowerStem;
import entity.PriceList;


@WebServlet("/FlowerServlet")
public class FlowerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// flower ROSE block
		Integer roseNum=Integer.parseInt(request.getParameter("roseNumber"));
		Integer roseFreshnessLevel=Integer.parseInt(request.getParameter("freshness level"));
		Integer roseLengthOfStem=Integer.parseInt(request.getParameter("length of the rose stem"));
		Flower.roseInBouquet(roseNum,roseFreshnessLevel,roseLengthOfStem);
		//flower SUNFLOWER block
		Integer sunflowerNum=Integer.parseInt(request.getParameter("sunflowerNumber"));
		Integer sunflowerFreshnessLevel=Integer.parseInt(request.getParameter("freshness level sunflower"));
		Integer sunflowerLengthOfStem=Integer.parseInt(request.getParameter("sunflowerNumber"));
		Flower.sunflowerInBouquet(sunflowerNum,sunflowerFreshnessLevel,sunflowerLengthOfStem);
		// flower CHARMOLINE block
		Integer charmolineNum=Integer.parseInt(request.getParameter("charmolineNumber"));
		Integer charmolineFreshnessLevel=Integer.parseInt(request.getParameter("freshness level charmoline"));
		Integer charmolineLengthOfStem=Integer.parseInt(request.getParameter("length of the charmoline stem"));
		Flower.charmolineInBouquet(charmolineNum,charmolineFreshnessLevel,charmolineLengthOfStem);
		//Flower.softByFreshness();
		Boolean isBasket=Boolean.parseBoolean(request.getParameter("isBasket"));
		Boolean isTape=Boolean.parseBoolean(request.getParameter("isTape"));
		Boolean isWrapper=Boolean.parseBoolean(request.getParameter("isWrapper"));
		Accessory.accessoryInBouquet(isBasket,isTape,isWrapper);
		/*if(roseNum>0) {
			ArrayList<Flower> myFlowersList=new ArrayList<>(); 
		for(int i=0;i<roseNum;i++) {
			myFlowersList.add(new Flower(FlowerName.ROSE, roseFreshnessLevel));
			}
		}
		else {return;}*/
		
		
	
		
	PrintWriter out=response.getWriter();
	out.println("<h3>Your order is</h3>");
	out.println("Rose: "+roseNum+" Level of freshness is "+roseFreshnessLevel+" length of the rose stem "+roseLengthOfStem+"<br>");
	out.println("Sunflower: "+sunflowerNum+" Level of freshness is "+sunflowerFreshnessLevel+" length of the sunflower stem "+sunflowerLengthOfStem+"<br>");
	out.println("Charmoline: "+charmolineNum+" Level of freshness is "+charmolineFreshnessLevel+" length of the charmoline stem "+charmolineLengthOfStem+"<br>");
	out.println("Basket: "+isBasket+"<br>");
	out.println("Tape: "+isTape+"<br>");
	out.println("Wrapper: "+isWrapper+"<br>");
	out.println("Price of flowers: " +Flower.getTotalFlowerPrice()+"<br>");
	out.println("Price of accessories: " +Accessory.getTotalAccessoryPrice()+"<br>");
	double totalSum=Flower.getTotalFlowerPrice()+Accessory.getTotalAccessoryPrice();
	out.println("Total price: "+totalSum+"<br>");
	//out.println(Flower.printByFreshness());
	out.close();
	}
}



