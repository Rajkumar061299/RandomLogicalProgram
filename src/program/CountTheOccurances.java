package program;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheOccurances {

	public static void main(String[] args) {
		 countTheOccurance("Rajkumar");

	}
	public static void countTheOccurance(String text) {
		String[] letter = text.toLowerCase().split("");

		System.out.println(
				Arrays.stream(letter).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
						.values().stream().filter(count -> count > 1).count());

	}

}
