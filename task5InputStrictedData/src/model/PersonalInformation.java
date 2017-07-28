package model;

import java.util.Date;

public class PersonalInformation {
String surname;
String name;
String middleName;
String fullName=surname+name+middleName;
String nickname;
String comment;
String enum Gpoup(STUDENT,WORKER,PUBLIC_SERVANT,RETIRED);
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
Date lastEdition;
}

PersonalInformation(){
	{fullName=receivedName();}
}

receivedName();
receivedInformation(){
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext() && )sc.nextString();
	sc.close();
};