package method.test;

import java.util.Arrays;
import java.util.List;

public class lengthlamda {

	public static void main(String[] args) {
		
		String s = "sivaji";
		List<Integer> ls =  Arrays.asList(s.length());
		ls.forEach((l) -> System.out.print(l + ""));

		
	}

}
