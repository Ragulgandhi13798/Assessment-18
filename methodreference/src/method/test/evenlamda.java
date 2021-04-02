package method.test;

import java.util.Arrays;
import java.util.List;

public class evenlamda {

	public static void main(String[] args) {
		
		Integer[] n = {2,1,56,33,6};
		List<Integer> l = Arrays.asList(n);

		l.stream().filter(n1 -> n1%2==0).
		
		forEach(System.out::println);
		// TODO Auto-generated method stub

	}

}
