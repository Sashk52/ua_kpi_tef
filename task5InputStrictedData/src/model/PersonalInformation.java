package model;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PersonalInformation {
String surname;
String name;
String middleName;
String fullName=surname+name+middleName;
String nickname;
String comment;
public enum Group{STUDENT,WORKER,PUBLIC_SERVANT,RETIRED};
String homeTelNumber; 
String mobTelNumber;
String mobTelNumber2; //field mobTelNumber2 can be empty
String eMail;
String skype;
String index;
String city;
String street;
String buildingNum;
String flatNum;
String fullAdrress;//"fullAdrress" include index+city+street+buildingNum+flatNum  
Date creation;
Date lastEditione;




public void receivedInformation(String [][] messages){
	int i;
	int j;
	Scanner info=new Scanner(System.in);
	for(j=0;j<16;j++)	{
	String message=messages [0][j];
	String reget=messages [1][j];
	while(!(info.hasNext() && (reget=info.next()).matches(reget)));
	System.out.println(message);
	String input=info.next();
	if(Pattern.matches(reget,input)){
		System.out.println("You entered "+input);}
		else
		{System.out.println("You made wrong input!Try again!");}
	}
	info.close();
}
}

