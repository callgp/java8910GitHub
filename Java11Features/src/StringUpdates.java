import java.util.stream.Collectors;

public class StringUpdates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		System.out.println(str.isBlank());
		String str2=" ";
		System.out.println(str.isBlank());
		String str3=" aa";
		System.out.println(str.isBlank());
		
		
		//line updates
		str=" i \n am \n creator of it";	
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));//prints at delimiter new line as new entry
		
		
		char c='\u2000';//this puts extra space or ? etc.
		
		//str+=c; //this c not working add manually space
		str=" "+str+" ";
	System.out.println("before trim"+str);
	//	System.out.println("after trim"+str.trim());
		
	

		System.out.println(str.strip());
		
		System.out.println("after leading trim"+ str.stripLeading());
		System.out.println("after trailing trim"+ str.stripTrailing());
		
		
		System.out.println("-".repeat(100));
		
	}

}

/*
 * true true true i am creator of it [ i , am , creator of it] before trim i am
 * creator of it i am creator of it after leading trimi am creator of it after
 * trailing trim i am creator of it
 * -----------------------------------------------------------------------------
 * -----------------------
 */

/*
 * true true true i am creator of it [ i , am , creator of it] before trim i am
 * creator of it i am creator of it after leading trimi am creator of it after
 * trailing trim i am creator of it
 */


/*
 * true true true i am creator of it [ i , am , creator of it] i am creator of
 * it? i am creator of it?
 */