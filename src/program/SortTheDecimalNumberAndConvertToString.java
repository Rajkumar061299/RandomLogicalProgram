package program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortTheDecimalNumberAndConvertToString {
	
	public static void main(String[] args) {
		sortDesc(12344598);

	}
	
	public static void sortDesc(final int num) {
		String result = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).boxed()
				.sorted(Comparator.reverseOrder()).map(s -> String.valueOf(s)).collect(Collectors.joining());
				//.reduce((a, b) -> a + b).get();
		System.out.println(result);
		/*    return Integer.parseInt(String.valueOf(num).chars().mapToObj(s -> String.valueOf(Character.getNumericValue(s))).sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
*/
	}


}
