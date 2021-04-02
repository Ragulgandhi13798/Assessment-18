package method.test;

import java.util.function.BiFunction;

class adder
{
	
public static Float add(Float a, Float b)
{
	return a+b;
}
}
public class floatmethod {

	public static void main(String[] args) {
		
		 BiFunction<Float,Float,Float> ad = adder:: add;
		 
		 Float f = ad.apply (23f,65.9f);
		 System.out.println(f);

	}
}
