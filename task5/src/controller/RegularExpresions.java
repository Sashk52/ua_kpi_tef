package controller;

public class RegularExpresions {
	
	static String insSurname="Please, enter your surname";
	static String reqSurname="[A-Z][a-z]+";
	static String insName="Please, enter your name";
	static String reqName="[A-Z][a-z]+";
	static String insMiddeleName="Please, enter your middleName";
	static String reqMiddeleName="[A-Z][a-z]+";
	static String insNickname="Please, enter your nickname";
	static String reqNickname="\\w{2,}";
	static String insComment="Please, enter comment";
	static String reqComment="[a-z]+";
	static String insGroup="Please, enter your gpoup:for Student insert-'s',Worker'w',PublicServant-'p',Retired-'r'.";
	static String reqGroup="[s|w|p|r]";
	static String insPhoneHomeNum="Please, enter your home number";
	static String reqPhoneHomNum="0\\d{9}";
	static String insModNum="Please, enter your mobile number";
	static String reqModNum="0\\d{9}";
	static String insMobNum2="Please, enter your another mobile number";//optional
	static String reqMobNum2="0\\d{9}|";
	static String insEmail="Please, enter your e-mail";
	static String reqEmail="[a-z]+@{1}[a-z]{3,8}\\.[a-z]{2,3}";;
	static String insSkype="Please, enter your skype";
	static String reqSkype="[a-z]+";
	static String insIndex="Please, enter your index";
	static String reqIndex="\\d{5}";
	static String insCity="Please, enter your city";
	static String reqCity="[A-Z][a-z]+[a-z]|[A-Z][a-z]";
	static String insStreet="Please, enter your street";
	static String reqStreet="[A-Z][a-z]+[a-z]|[A-Z][a-z]";
	static String insBuldNum="Please, enter your bulding number";
	static String reqBuldNum="\\d{0,3}";
	static String insFlatNum="Please, enter your flat number";
	static String reqFlatNum="\\d{1,4}";
	
	static String wrongInput="You made wrong input!Try again!";
	
	static String [][] invatation={{insSurname,insName,insMiddeleName,insNickname,insComment,insGroup,insPhoneHomeNum,insModNum,insMobNum2,insEmail,insSkype,insIndex,insCity,insStreet,insBuldNum,insFlatNum},{reqSurname,reqName, reqMiddeleName,reqNickname,reqComment,reqGroup,reqPhoneHomNum,reqModNum,reqMobNum2,reqEmail,reqSkype,reqIndex,reqCity,reqStreet,reqBuldNum,reqFlatNum}};
	static String [] firstRow={insSurname,insName,insMiddeleName,insNickname,insComment,insGroup,insPhoneHomeNum,insModNum,insMobNum2,insEmail,insSkype,insIndex,insCity,insStreet,insBuldNum,insFlatNum};
	static String [] secondRow={reqSurname,reqName, reqMiddeleName,reqNickname,reqComment,reqGroup,reqPhoneHomNum,reqModNum,reqMobNum2,reqEmail,reqSkype,reqIndex,reqCity,reqStreet,reqBuldNum,reqFlatNum};
	static int fRow=firstRow.length;
	static int sRow=secondRow.length;		
	
	static String [] printAllInvitation2(){
		int i = 0;
		int j;
		for(j=0;j<sRow;j++)	
		for(i=0;i<=1;i++)
			System.out.println(invatation[0][j]+ invatation[1][j]);
	return new String [] {invatation[i][j],invatation[i][j]};
	}
	
	
	static void printAllInvitation(){
    	int i=0;
    	while(i<invatation.length){
    		System.out.println(invatation[i]);
    	i++;
    	}
    }
}
