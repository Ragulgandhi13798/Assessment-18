package method.test;

import java.util.function.BiFunction;

class addtion
{
	
public static String add(String a, String b)
{
	return a+b;
}
}
public class Stringmeth {

	public static void main(String[] args) {
		
 BiFunction<String,String,String> ad = addtion:: add;
		 
		 String s = ad.apply ("ragul","gandhi");
		 System.out.println(s);

	}

}
