package method.test;

import java.util.Arrays;
import java.util.List;

public class oddnumberusinglamda {

	public static void main(String[] args) {
		Integer[] n = {22,16,5,33,6};
		List<Integer> List = Arrays.asList(n);

		List.stream().filter(n1 -> n1%2!=0).
		
		forEach(System.out::println);
	}

}
