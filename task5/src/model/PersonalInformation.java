package model;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import view.DisplayInformation;

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

/*
void inputStringValueWithScanner(String message,String reget){
Scanner sc=new Scanner(System.in){
String input=sc.nextLine();
if ((input=sc.next()).matches(reget))
{continue;}
else{System.out.println(printWrongStringInput(message));}

}
*/

public void receivedInformation(String [][] messages){
	int j;
	Scanner info=new Scanner(System.in);
	for(j=0;j<16;j++){
	String message=messages [0][j];
	String reget=messages [1][j];
	String res;
	DisplayInformation displayInformation = new DisplayInformation();
	displayInformation.printStringInput(message);
		while(!(info.hasNext() && (res=info.next()).matches(reget)))
		   displayInformation.printWrongStringInput(message);
	}
		
	}
	

/*try number3
 * public void receivedInformation(String [][] messages){
	int j;
	Scanner info=new Scanner(System.in);
	for(j=0;j<16;j++){
	String message=messages [0][j];
	String reget=messages [1][j];
	DisplayInformation displayInformation = new DisplayInformation();
	displayInformation.printStringInput(message);
	//inputStringValueWithScanner(message,reget);
	String input=info.next();
	if(Pattern.matches(reget,message)){
		System.out.println("You entered "+name);
		}
		else{
			while((info.hasNext() && (input=info.next()).matches(reget)));
		{System.out.println("You made wrong input!Try again!");
		}
		}
	}
	*/
	
	/*while(!(info.hasNext() && (input=info.next()).matches(reget)));
	displayInformation.printWrongStringInput(message);
	}*/
	//info.close();

	}



/*while((input=info.next()).matches(reget)){
		
	}
	*/

	//System.out.println(message);
	//String=res;
	/*
	String input=info.next();
	if((input=info.next()).matches(reget))
	{System.out.println("You entered: "+info.next());}
	while(!(info.hasNext() && (input=info.next()).matches(reget)));
	System.out.println("You made wrong input!Try again!");
		}
		*/